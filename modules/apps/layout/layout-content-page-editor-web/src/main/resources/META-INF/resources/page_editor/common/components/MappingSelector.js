/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

import ClayForm, {ClaySelectWithOption} from '@clayui/form';
import classNames from 'classnames';
import PropTypes from 'prop-types';
import React, {useEffect, useState} from 'react';

import {addMappedInfoItem} from '../../app/actions/index';
import {useCollectionFields} from '../../app/components/CollectionItemContext';
import isMapped from '../../app/components/fragment-content/isMapped';
import {COMPATIBLE_TYPES} from '../../app/config/constants/compatibleTypes';
import {EDITABLE_TYPES} from '../../app/config/constants/editableTypes';
import {PAGE_TYPES} from '../../app/config/constants/pageTypes';
import {config} from '../../app/config/index';
import InfoItemService from '../../app/services/InfoItemService';
import {useDispatch, useSelector} from '../../app/store/index';
import {useId} from '../../app/utils/useId';
import ItemSelector from './ItemSelector';

const MAPPING_SOURCE_TYPE_IDS = {
	content: 'content',
	structure: 'structure',
};

const UNMAPPED_OPTION = {
	label: `-- ${Liferay.Language.get('unmapped')} --`,
	value: 'unmapped',
};

function loadFields({
	dispatch,
	fieldType,
	selectedItem,
	selectedMappingTypes,
	selectedSourceTypeId,
}) {
	let promise;

	if (selectedSourceTypeId === MAPPING_SOURCE_TYPE_IDS.structure) {
		promise = InfoItemService.getAvailableStructureMappingFields({
			classNameId: selectedMappingTypes.type.id,
			classTypeId: selectedMappingTypes.subtype.id,
			onNetworkStatus: dispatch,
		});
	}
	else if (
		selectedSourceTypeId === MAPPING_SOURCE_TYPE_IDS.content &&
		selectedItem.classNameId &&
		selectedItem.classPK
	) {
		promise = InfoItemService.getAvailableAssetMappingFields({
			classNameId: selectedItem.classNameId,
			classPK: selectedItem.classPK,
			onNetworkStatus: dispatch,
		});
	}

	if (promise) {
		return promise.then((response) => {
			if (Array.isArray(response)) {
				return response.filter(
					(field) =>
						COMPATIBLE_TYPES[fieldType].indexOf(field.type) !== -1
				);
			}

			return [];
		});
	}

	return Promise.resolve(null);
}

export default function ({fieldType, mappedItem, onMappingSelect}) {
	const collectionFields = useCollectionFields();

	return collectionFields ? (
		<CollectionMappingSelector
			collectionFields={collectionFields}
			fieldType={fieldType}
			mappedItem={mappedItem}
			onMappingSelect={onMappingSelect}
		/>
	) : (
		<MappingSelector
			fieldType={fieldType}
			mappedItem={mappedItem}
			onMappingSelect={onMappingSelect}
		/>
	);
}

function CollectionMappingSelector({
	collectionFields,
	fieldType,
	mappedItem,
	onMappingSelect,
}) {
	const fields = collectionFields.filter(
		(field) => COMPATIBLE_TYPES[fieldType].indexOf(field.type) !== -1
	);

	return (
		<MappingFieldSelect
			fields={fields}
			fieldType={fieldType}
			onValueSelect={(event) => {
				if (event.target.value === UNMAPPED_OPTION.value) {
					onMappingSelect({collectionFieldId: ''});
				}
				else {
					onMappingSelect({
						collectionFieldId: event.target.value,
					});
				}
			}}
			value={mappedItem.collectionFieldId}
		/>
	);
}

function MappingSelector({fieldType, mappedItem, onMappingSelect}) {
	const dispatch = useDispatch();
	const mappedInfoItems = useSelector((state) => state.mappedInfoItems);
	const mappingSelectorSourceSelectId = useId();

	const {selectedMappingTypes} = config;

	const [fields, setFields] = useState(null);
	const [selectedItem, setSelectedItem] = useState(mappedItem);
	const [selectedSourceTypeId, setSelectedSourceTypeId] = useState(
		mappedItem.mappedField || config.pageType === PAGE_TYPES.display
			? MAPPING_SOURCE_TYPE_IDS.structure
			: MAPPING_SOURCE_TYPE_IDS.content
	);

	const onInfoItemSelect = (selectedInfoItem) => {
		setSelectedItem(selectedInfoItem);

		if (isMapped(mappedItem)) {
			onMappingSelect({
				classNameId: '',
				classPK: '',
				fieldId: '',
				mappedField: '',
			});
		}
	};

	const onFieldSelect = (event) => {
		const fieldValue = event.target.value;

		const data =
			fieldValue === UNMAPPED_OPTION.value
				? {
						classNameId: '',
						classPK: '',
						fieldId: '',
						mappedField: '',
				  }
				: selectedSourceTypeId === MAPPING_SOURCE_TYPE_IDS.content
				? {
						classNameId: selectedItem.classNameId,
						classPK: selectedItem.classPK,
						fieldId: fieldValue,
				  }
				: {mappedField: fieldValue};

		if (selectedSourceTypeId === MAPPING_SOURCE_TYPE_IDS.content) {
			const mappedInfoItem = mappedInfoItems.find(
				(item) =>
					item.classNameId === selectedItem.classNameId &&
					item.classPK === selectedItem.classPK
			);

			if (!mappedInfoItem) {
				dispatch(
					addMappedInfoItem({title: selectedItem.title, ...data})
				);
			}

			setSelectedItem((selectedItem) => ({
				...selectedItem,
				fieldId: fieldValue,
			}));
		}
		else {
			setSelectedItem((selectedItem) => ({
				...selectedItem,
				mappedField: fieldValue,
			}));
		}

		onMappingSelect(data);
	};

	useEffect(() => {
		const infoItem = mappedInfoItems.find(
			(infoItem) =>
				infoItem.classNameId === mappedItem.classNameId &&
				infoItem.classPK === mappedItem.classPK
		);

		setSelectedItem((selectedItem) => ({
			...infoItem,
			...mappedItem,
			...selectedItem,
		}));
	}, [mappedItem, mappedInfoItems]);

	useEffect(() => {
		const data =
			selectedSourceTypeId === MAPPING_SOURCE_TYPE_IDS.structure
				? {
						dispatch,
						fieldType,
						selectedMappingTypes,
						selectedSourceTypeId,
				  }
				: {
						dispatch,
						fieldType,
						selectedItem,
						selectedSourceTypeId,
				  };

		loadFields(data).then((newFields) => {
			setFields(newFields);
		});
	}, [
		dispatch,
		fieldType,
		selectedItem,
		selectedMappingTypes,
		selectedSourceTypeId,
	]);

	return (
		<>
			{config.pageType === PAGE_TYPES.display && (
				<ClayForm.Group small>
					<label htmlFor="mappingSelectorSourceSelect">
						{Liferay.Language.get('source')}
					</label>
					<ClaySelectWithOption
						aria-label={Liferay.Language.get('source')}
						id={mappingSelectorSourceSelectId}
						onChange={(event) => {
							setSelectedSourceTypeId(event.target.value);

							setSelectedItem({});

							if (isMapped(mappedItem)) {
								onMappingSelect({
									classNameId: '',
									classPK: '',
									fieldId: '',
									mappedField: '',
								});
							}
						}}
						options={[
							{
								label: Liferay.Util.sub(
									Liferay.Language.get('x-default'),
									selectedMappingTypes.subtype
										? selectedMappingTypes.subtype.label
										: selectedMappingTypes.type.label
								),
								value: MAPPING_SOURCE_TYPE_IDS.structure,
							},
							{
								label: Liferay.Language.get('specific-content'),
								value: MAPPING_SOURCE_TYPE_IDS.content,
							},
						]}
						value={selectedSourceTypeId}
					/>
				</ClayForm.Group>
			)}
			{selectedSourceTypeId === MAPPING_SOURCE_TYPE_IDS.content && (
				<ClayForm.Group small>
					<ItemSelector
						label={Liferay.Language.get('content')}
						onItemSelect={onInfoItemSelect}
						selectedItemTitle={selectedItem.title}
					/>
				</ClayForm.Group>
			)}
			<ClayForm.Group small>
				<MappingFieldSelect
					fields={fields}
					fieldType={fieldType}
					onValueSelect={onFieldSelect}
					value={selectedItem.mappedField || selectedItem.fieldId}
				/>
			</ClayForm.Group>
		</>
	);
}

function MappingFieldSelect({fieldType, fields, onValueSelect, value}) {
	const mappingSelectorFieldSelectId = useId();

	const hasWarnings = fields && fields.length === 0;

	return (
		<ClayForm.Group
			className={classNames({'has-warning': hasWarnings})}
			small
		>
			<label htmlFor="mappingSelectorFieldSelect">
				{Liferay.Language.get('field')}
			</label>
			<ClaySelectWithOption
				aria-label={Liferay.Language.get('field')}
				disabled={!(fields && fields.length)}
				id={mappingSelectorFieldSelectId}
				onChange={onValueSelect}
				options={
					fields && fields.length
						? [
								UNMAPPED_OPTION,
								...fields.map(({key, label}) => ({
									label,
									value: key,
								})),
						  ]
						: [UNMAPPED_OPTION]
				}
				value={value}
			/>
			{hasWarnings && (
				<ClayForm.FeedbackGroup>
					<ClayForm.FeedbackItem>
						{Liferay.Util.sub(
							Liferay.Language.get(
								'no-fields-are-available-for-x-editable'
							),
							[
								EDITABLE_TYPES.backgroundImage,
								EDITABLE_TYPES.image,
							].includes(fieldType)
								? Liferay.Language.get('image')
								: Liferay.Language.get('text')
						)}
					</ClayForm.FeedbackItem>
				</ClayForm.FeedbackGroup>
			)}
		</ClayForm.Group>
	);
}

MappingSelector.propTypes = {
	fieldType: PropTypes.oneOf(Object.keys(COMPATIBLE_TYPES)),
	mappedItem: PropTypes.oneOfType([
		PropTypes.shape({
			classNameId: PropTypes.string,
			classPK: PropTypes.string,
			fieldId: PropTypes.string,
		}),
		PropTypes.shape({mappedField: PropTypes.string}),
	]),
	onMappingSelect: PropTypes.func.isRequired,
};
