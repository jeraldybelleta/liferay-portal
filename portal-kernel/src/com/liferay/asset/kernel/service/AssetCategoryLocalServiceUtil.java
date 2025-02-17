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

package com.liferay.asset.kernel.service;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;

/**
 * Provides the local service utility for AssetCategory. This utility wraps
 * <code>com.liferay.portlet.asset.service.impl.AssetCategoryLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AssetCategoryLocalService
 * @generated
 */
public class AssetCategoryLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.portlet.asset.service.impl.AssetCategoryLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the asset category to the database. Also notifies the appropriate model listeners.
	 *
	 * @param assetCategory the asset category
	 * @return the asset category that was added
	 */
	public static com.liferay.asset.kernel.model.AssetCategory addAssetCategory(
		com.liferay.asset.kernel.model.AssetCategory assetCategory) {

		return getService().addAssetCategory(assetCategory);
	}

	public static void addAssetEntryAssetCategories(
		long entryId,
		java.util.List<com.liferay.asset.kernel.model.AssetCategory>
			assetCategories) {

		getService().addAssetEntryAssetCategories(entryId, assetCategories);
	}

	public static void addAssetEntryAssetCategories(
		long entryId, long[] categoryIds) {

		getService().addAssetEntryAssetCategories(entryId, categoryIds);
	}

	public static void addAssetEntryAssetCategory(
		long entryId,
		com.liferay.asset.kernel.model.AssetCategory assetCategory) {

		getService().addAssetEntryAssetCategory(entryId, assetCategory);
	}

	public static void addAssetEntryAssetCategory(
		long entryId, long categoryId) {

		getService().addAssetEntryAssetCategory(entryId, categoryId);
	}

	public static com.liferay.asset.kernel.model.AssetCategory addCategory(
			long userId, long groupId, long parentCategoryId,
			java.util.Map<java.util.Locale, String> titleMap,
			java.util.Map<java.util.Locale, String> descriptionMap,
			long vocabularyId, String[] categoryProperties,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addCategory(
			userId, groupId, parentCategoryId, titleMap, descriptionMap,
			vocabularyId, categoryProperties, serviceContext);
	}

	public static com.liferay.asset.kernel.model.AssetCategory addCategory(
			long userId, long groupId, String title, long vocabularyId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addCategory(
			userId, groupId, title, vocabularyId, serviceContext);
	}

	public static void addCategoryResources(
			com.liferay.asset.kernel.model.AssetCategory category,
			boolean addGroupPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException {

		getService().addCategoryResources(
			category, addGroupPermissions, addGuestPermissions);
	}

	public static void addCategoryResources(
			com.liferay.asset.kernel.model.AssetCategory category,
			com.liferay.portal.kernel.service.permission.ModelPermissions
				modelPermissions)
		throws com.liferay.portal.kernel.exception.PortalException {

		getService().addCategoryResources(category, modelPermissions);
	}

	public static void clearAssetEntryAssetCategories(long entryId) {
		getService().clearAssetEntryAssetCategories(entryId);
	}

	/**
	 * Creates a new asset category with the primary key. Does not add the asset category to the database.
	 *
	 * @param categoryId the primary key for the new asset category
	 * @return the new asset category
	 */
	public static com.liferay.asset.kernel.model.AssetCategory
		createAssetCategory(long categoryId) {

		return getService().createAssetCategory(categoryId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			createPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the asset category from the database. Also notifies the appropriate model listeners.
	 *
	 * @param assetCategory the asset category
	 * @return the asset category that was removed
	 */
	public static com.liferay.asset.kernel.model.AssetCategory
		deleteAssetCategory(
			com.liferay.asset.kernel.model.AssetCategory assetCategory) {

		return getService().deleteAssetCategory(assetCategory);
	}

	/**
	 * Deletes the asset category with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param categoryId the primary key of the asset category
	 * @return the asset category that was removed
	 * @throws PortalException if a asset category with the primary key could not be found
	 */
	public static com.liferay.asset.kernel.model.AssetCategory
			deleteAssetCategory(long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteAssetCategory(categoryId);
	}

	public static void deleteAssetEntryAssetCategories(
		long entryId,
		java.util.List<com.liferay.asset.kernel.model.AssetCategory>
			assetCategories) {

		getService().deleteAssetEntryAssetCategories(entryId, assetCategories);
	}

	public static void deleteAssetEntryAssetCategories(
		long entryId, long[] categoryIds) {

		getService().deleteAssetEntryAssetCategories(entryId, categoryIds);
	}

	public static void deleteAssetEntryAssetCategory(
		long entryId,
		com.liferay.asset.kernel.model.AssetCategory assetCategory) {

		getService().deleteAssetEntryAssetCategory(entryId, assetCategory);
	}

	public static void deleteAssetEntryAssetCategory(
		long entryId, long categoryId) {

		getService().deleteAssetEntryAssetCategory(entryId, categoryId);
	}

	public static void deleteCategories(
			java.util.List<com.liferay.asset.kernel.model.AssetCategory>
				categories)
		throws com.liferay.portal.kernel.exception.PortalException {

		getService().deleteCategories(categories);
	}

	public static void deleteCategories(long[] categoryIds)
		throws com.liferay.portal.kernel.exception.PortalException {

		getService().deleteCategories(categoryIds);
	}

	public static com.liferay.asset.kernel.model.AssetCategory deleteCategory(
			com.liferay.asset.kernel.model.AssetCategory category)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteCategory(category);
	}

	public static com.liferay.asset.kernel.model.AssetCategory deleteCategory(
			com.liferay.asset.kernel.model.AssetCategory category,
			boolean skipRebuildTree)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteCategory(category, skipRebuildTree);
	}

	public static com.liferay.asset.kernel.model.AssetCategory deleteCategory(
			long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteCategory(categoryId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static void deleteVocabularyCategories(long vocabularyId)
		throws com.liferay.portal.kernel.exception.PortalException {

		getService().deleteVocabularyCategories(vocabularyId);
	}

	public static <T> T dslQuery(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return getService().dslQuery(dslQuery);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.portlet.asset.model.impl.AssetCategoryModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.portlet.asset.model.impl.AssetCategoryModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.asset.kernel.model.AssetCategory
		fetchAssetCategory(long categoryId) {

		return getService().fetchAssetCategory(categoryId);
	}

	/**
	 * Returns the asset category with the matching external reference code and company.
	 *
	 * @param companyId the primary key of the company
	 * @param externalReferenceCode the asset category's external reference code
	 * @return the matching asset category, or <code>null</code> if a matching asset category could not be found
	 */
	public static com.liferay.asset.kernel.model.AssetCategory
		fetchAssetCategoryByReferenceCode(
			long companyId, String externalReferenceCode) {

		return getService().fetchAssetCategoryByReferenceCode(
			companyId, externalReferenceCode);
	}

	/**
	 * Returns the asset category matching the UUID and group.
	 *
	 * @param uuid the asset category's UUID
	 * @param groupId the primary key of the group
	 * @return the matching asset category, or <code>null</code> if a matching asset category could not be found
	 */
	public static com.liferay.asset.kernel.model.AssetCategory
		fetchAssetCategoryByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchAssetCategoryByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.asset.kernel.model.AssetCategory fetchCategory(
		long categoryId) {

		return getService().fetchCategory(categoryId);
	}

	public static com.liferay.asset.kernel.model.AssetCategory fetchCategory(
		long groupId, long parentCategoryId, String name, long vocabularyId) {

		return getService().fetchCategory(
			groupId, parentCategoryId, name, vocabularyId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns a range of all the asset categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.portlet.asset.model.impl.AssetCategoryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of asset categories
	 * @param end the upper bound of the range of asset categories (not inclusive)
	 * @return the range of asset categories
	 */
	public static java.util.List<com.liferay.asset.kernel.model.AssetCategory>
		getAssetCategories(int start, int end) {

		return getService().getAssetCategories(start, end);
	}

	/**
	 * Returns all the asset categories matching the UUID and company.
	 *
	 * @param uuid the UUID of the asset categories
	 * @param companyId the primary key of the company
	 * @return the matching asset categories, or an empty list if no matches were found
	 */
	public static java.util.List<com.liferay.asset.kernel.model.AssetCategory>
		getAssetCategoriesByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getAssetCategoriesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of asset categories matching the UUID and company.
	 *
	 * @param uuid the UUID of the asset categories
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of asset categories
	 * @param end the upper bound of the range of asset categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching asset categories, or an empty list if no matches were found
	 */
	public static java.util.List<com.liferay.asset.kernel.model.AssetCategory>
		getAssetCategoriesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.asset.kernel.model.AssetCategory>
					orderByComparator) {

		return getService().getAssetCategoriesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of asset categories.
	 *
	 * @return the number of asset categories
	 */
	public static int getAssetCategoriesCount() {
		return getService().getAssetCategoriesCount();
	}

	/**
	 * Returns the asset category with the primary key.
	 *
	 * @param categoryId the primary key of the asset category
	 * @return the asset category
	 * @throws PortalException if a asset category with the primary key could not be found
	 */
	public static com.liferay.asset.kernel.model.AssetCategory getAssetCategory(
			long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getAssetCategory(categoryId);
	}

	/**
	 * Returns the asset category matching the UUID and group.
	 *
	 * @param uuid the asset category's UUID
	 * @param groupId the primary key of the group
	 * @return the matching asset category
	 * @throws PortalException if a matching asset category could not be found
	 */
	public static com.liferay.asset.kernel.model.AssetCategory
			getAssetCategoryByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getAssetCategoryByUuidAndGroupId(uuid, groupId);
	}

	public static java.util.List<com.liferay.asset.kernel.model.AssetCategory>
		getAssetEntryAssetCategories(long entryId) {

		return getService().getAssetEntryAssetCategories(entryId);
	}

	public static java.util.List<com.liferay.asset.kernel.model.AssetCategory>
		getAssetEntryAssetCategories(long entryId, int start, int end) {

		return getService().getAssetEntryAssetCategories(entryId, start, end);
	}

	public static java.util.List<com.liferay.asset.kernel.model.AssetCategory>
		getAssetEntryAssetCategories(
			long entryId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.asset.kernel.model.AssetCategory>
					orderByComparator) {

		return getService().getAssetEntryAssetCategories(
			entryId, start, end, orderByComparator);
	}

	public static int getAssetEntryAssetCategoriesCount(long entryId) {
		return getService().getAssetEntryAssetCategoriesCount(entryId);
	}

	/**
	 * Returns the entryIds of the asset entries associated with the asset category.
	 *
	 * @param categoryId the categoryId of the asset category
	 * @return long[] the entryIds of asset entries associated with the asset category
	 */
	public static long[] getAssetEntryPrimaryKeys(long categoryId) {
		return getService().getAssetEntryPrimaryKeys(categoryId);
	}

	public static java.util.List<com.liferay.asset.kernel.model.AssetCategory>
		getCategories() {

		return getService().getCategories();
	}

	public static java.util.List<com.liferay.asset.kernel.model.AssetCategory>
			getCategories(com.liferay.portal.kernel.search.Hits hits)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getCategories(hits);
	}

	public static java.util.List<com.liferay.asset.kernel.model.AssetCategory>
		getCategories(long classNameId, long classPK) {

		return getService().getCategories(classNameId, classPK);
	}

	public static java.util.List<com.liferay.asset.kernel.model.AssetCategory>
		getCategories(String className, long classPK) {

		return getService().getCategories(className, classPK);
	}

	public static com.liferay.asset.kernel.model.AssetCategory getCategory(
			long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getCategory(categoryId);
	}

	public static com.liferay.asset.kernel.model.AssetCategory getCategory(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getCategory(uuid, groupId);
	}

	public static long[] getCategoryIds(String className, long classPK) {
		return getService().getCategoryIds(className, classPK);
	}

	public static String[] getCategoryNames() {
		return getService().getCategoryNames();
	}

	public static String[] getCategoryNames(long classNameId, long classPK) {
		return getService().getCategoryNames(classNameId, classPK);
	}

	public static String[] getCategoryNames(String className, long classPK) {
		return getService().getCategoryNames(className, classPK);
	}

	public static java.util.List<com.liferay.asset.kernel.model.AssetCategory>
		getChildCategories(long parentCategoryId) {

		return getService().getChildCategories(parentCategoryId);
	}

	public static java.util.List<com.liferay.asset.kernel.model.AssetCategory>
		getChildCategories(
			long parentCategoryId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.asset.kernel.model.AssetCategory>
					orderByComparator) {

		return getService().getChildCategories(
			parentCategoryId, start, end, orderByComparator);
	}

	public static int getChildCategoriesCount(long parentCategoryId) {
		return getService().getChildCategoriesCount(parentCategoryId);
	}

	public static java.util.List<com.liferay.asset.kernel.model.AssetCategory>
		getDescendantCategories(
			com.liferay.asset.kernel.model.AssetCategory category) {

		return getService().getDescendantCategories(category);
	}

	public static java.util.List<com.liferay.asset.kernel.model.AssetCategory>
		getEntryCategories(long entryId) {

		return getService().getEntryCategories(entryId);
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	public static java.util.List<Long> getSubcategoryIds(
		long parentCategoryId) {

		return getService().getSubcategoryIds(parentCategoryId);
	}

	public static long[] getViewableCategoryIds(
			String className, long classPK, long[] categoryIds)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getViewableCategoryIds(
			className, classPK, categoryIds);
	}

	public static java.util.List<com.liferay.asset.kernel.model.AssetCategory>
		getVocabularyCategories(
			long vocabularyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.asset.kernel.model.AssetCategory>
					orderByComparator) {

		return getService().getVocabularyCategories(
			vocabularyId, start, end, orderByComparator);
	}

	public static java.util.List<com.liferay.asset.kernel.model.AssetCategory>
		getVocabularyCategories(
			long parentCategoryId, long vocabularyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.asset.kernel.model.AssetCategory>
					orderByComparator) {

		return getService().getVocabularyCategories(
			parentCategoryId, vocabularyId, start, end, orderByComparator);
	}

	public static int getVocabularyCategoriesCount(long vocabularyId) {
		return getService().getVocabularyCategoriesCount(vocabularyId);
	}

	public static java.util.List<com.liferay.asset.kernel.model.AssetCategory>
		getVocabularyRootCategories(
			long vocabularyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.asset.kernel.model.AssetCategory>
					orderByComparator) {

		return getService().getVocabularyRootCategories(
			vocabularyId, start, end, orderByComparator);
	}

	public static int getVocabularyRootCategoriesCount(long vocabularyId) {
		return getService().getVocabularyRootCategoriesCount(vocabularyId);
	}

	public static boolean hasAssetEntryAssetCategories(long entryId) {
		return getService().hasAssetEntryAssetCategories(entryId);
	}

	public static boolean hasAssetEntryAssetCategory(
		long entryId, long categoryId) {

		return getService().hasAssetEntryAssetCategory(entryId, categoryId);
	}

	public static com.liferay.asset.kernel.model.AssetCategory mergeCategories(
			long fromCategoryId, long toCategoryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().mergeCategories(fromCategoryId, toCategoryId);
	}

	public static com.liferay.asset.kernel.model.AssetCategory moveCategory(
			long categoryId, long parentCategoryId, long vocabularyId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().moveCategory(
			categoryId, parentCategoryId, vocabularyId, serviceContext);
	}

	public static java.util.List<com.liferay.asset.kernel.model.AssetCategory>
		search(
			long groupId, String name, String[] categoryProperties, int start,
			int end) {

		return getService().search(
			groupId, name, categoryProperties, start, end);
	}

	public static com.liferay.portal.kernel.search.BaseModelSearchResult
		<com.liferay.asset.kernel.model.AssetCategory> searchCategories(
				long companyId, long groupIds, String title, long vocabularyId,
				int start, int end)
			throws com.liferay.portal.kernel.exception.PortalException {

		return getService().searchCategories(
			companyId, groupIds, title, vocabularyId, start, end);
	}

	public static com.liferay.portal.kernel.search.BaseModelSearchResult
		<com.liferay.asset.kernel.model.AssetCategory> searchCategories(
				long companyId, long[] groupIds, String title,
				long[] vocabularyIds, int start, int end)
			throws com.liferay.portal.kernel.exception.PortalException {

		return getService().searchCategories(
			companyId, groupIds, title, vocabularyIds, start, end);
	}

	public static com.liferay.portal.kernel.search.BaseModelSearchResult
		<com.liferay.asset.kernel.model.AssetCategory> searchCategories(
				long companyId, long[] groupIds, String title,
				long[] parentCategoryIds, long[] vocabularyIds, int start,
				int end)
			throws com.liferay.portal.kernel.exception.PortalException {

		return getService().searchCategories(
			companyId, groupIds, title, parentCategoryIds, vocabularyIds, start,
			end);
	}

	public static com.liferay.portal.kernel.search.BaseModelSearchResult
		<com.liferay.asset.kernel.model.AssetCategory> searchCategories(
				long companyId, long[] groupIds, String title,
				long[] vocabularyIds, long[] parentCategoryIds, int start,
				int end, com.liferay.portal.kernel.search.Sort sort)
			throws com.liferay.portal.kernel.exception.PortalException {

		return getService().searchCategories(
			companyId, groupIds, title, vocabularyIds, parentCategoryIds, start,
			end, sort);
	}

	public static void setAssetEntryAssetCategories(
		long entryId, long[] categoryIds) {

		getService().setAssetEntryAssetCategories(entryId, categoryIds);
	}

	/**
	 * Updates the asset category in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param assetCategory the asset category
	 * @return the asset category that was updated
	 */
	public static com.liferay.asset.kernel.model.AssetCategory
		updateAssetCategory(
			com.liferay.asset.kernel.model.AssetCategory assetCategory) {

		return getService().updateAssetCategory(assetCategory);
	}

	public static com.liferay.asset.kernel.model.AssetCategory updateCategory(
			long userId, long categoryId, long parentCategoryId,
			java.util.Map<java.util.Locale, String> titleMap,
			java.util.Map<java.util.Locale, String> descriptionMap,
			long vocabularyId, String[] categoryProperties,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateCategory(
			userId, categoryId, parentCategoryId, titleMap, descriptionMap,
			vocabularyId, categoryProperties, serviceContext);
	}

	public static AssetCategoryLocalService getService() {
		if (_service == null) {
			_service = (AssetCategoryLocalService)PortalBeanLocatorUtil.locate(
				AssetCategoryLocalService.class.getName());
		}

		return _service;
	}

	private static AssetCategoryLocalService _service;

}