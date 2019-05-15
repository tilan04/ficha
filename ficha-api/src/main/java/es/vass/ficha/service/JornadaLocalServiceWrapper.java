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

package es.vass.ficha.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JornadaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JornadaLocalService
 * @generated
 */
@ProviderType
public class JornadaLocalServiceWrapper implements JornadaLocalService,
	ServiceWrapper<JornadaLocalService> {
	public JornadaLocalServiceWrapper(JornadaLocalService jornadaLocalService) {
		_jornadaLocalService = jornadaLocalService;
	}

	/**
	* Adds the jornada to the database. Also notifies the appropriate model listeners.
	*
	* @param jornada the jornada
	* @return the jornada that was added
	*/
	@Override
	public es.vass.ficha.model.Jornada addJornada(
		es.vass.ficha.model.Jornada jornada) {
		return _jornadaLocalService.addJornada(jornada);
	}

	@Override
	public void addJornada(long groupId, long companyId, long userId,
		String userName, long tipoServicio) {
		_jornadaLocalService.addJornada(groupId, companyId, userId, userName,
			tipoServicio);
	}

	@Override
	public double calculoHorasTrabajadas(
		java.util.List<es.vass.ficha.model.Jornada> jornadas) {
		return _jornadaLocalService.calculoHorasTrabajadas(jornadas);
	}

	/**
	* Creates a new jornada with the primary key. Does not add the jornada to the database.
	*
	* @param jornadaId the primary key for the new jornada
	* @return the new jornada
	*/
	@Override
	public es.vass.ficha.model.Jornada createJornada(long jornadaId) {
		return _jornadaLocalService.createJornada(jornadaId);
	}

	/**
	* Deletes the jornada from the database. Also notifies the appropriate model listeners.
	*
	* @param jornada the jornada
	* @return the jornada that was removed
	*/
	@Override
	public es.vass.ficha.model.Jornada deleteJornada(
		es.vass.ficha.model.Jornada jornada) {
		return _jornadaLocalService.deleteJornada(jornada);
	}

	/**
	* Deletes the jornada with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jornadaId the primary key of the jornada
	* @return the jornada that was removed
	* @throws PortalException if a jornada with the primary key could not be found
	*/
	@Override
	public es.vass.ficha.model.Jornada deleteJornada(long jornadaId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _jornadaLocalService.deleteJornada(jornadaId);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _jornadaLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _jornadaLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _jornadaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.vass.ficha.model.impl.JornadaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _jornadaLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.vass.ficha.model.impl.JornadaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _jornadaLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _jornadaLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _jornadaLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public es.vass.ficha.model.Jornada fetchJornada(long jornadaId) {
		return _jornadaLocalService.fetchJornada(jornadaId);
	}

	/**
	* Returns the jornada matching the UUID and group.
	*
	* @param uuid the jornada's UUID
	* @param groupId the primary key of the group
	* @return the matching jornada, or <code>null</code> if a matching jornada could not be found
	*/
	@Override
	public es.vass.ficha.model.Jornada fetchJornadaByUuidAndGroupId(
		String uuid, long groupId) {
		return _jornadaLocalService.fetchJornadaByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public java.util.List<es.vass.ficha.model.Jornada> findByUserId(long userId) {
		return _jornadaLocalService.findByUserId(userId);
	}

	@Override
	public java.util.List<es.vass.ficha.model.Jornada> findByUserIdAndDate(
		long userId, java.util.Date createDate) {
		return _jornadaLocalService.findByUserIdAndDate(userId, createDate);
	}

	@Override
	public java.util.List<es.vass.ficha.model.Jornada> findByUserIdAndDateForUsers(
		long userId) {
		return _jornadaLocalService.findByUserIdAndDateForUsers(userId);
	}

	@Override
	public es.vass.ficha.model.Jornada findLastByUserId(long userId) {
		return _jornadaLocalService.findLastByUserId(userId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _jornadaLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _jornadaLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _jornadaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the jornada with the primary key.
	*
	* @param jornadaId the primary key of the jornada
	* @return the jornada
	* @throws PortalException if a jornada with the primary key could not be found
	*/
	@Override
	public es.vass.ficha.model.Jornada getJornada(long jornadaId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _jornadaLocalService.getJornada(jornadaId);
	}

	/**
	* Returns the jornada matching the UUID and group.
	*
	* @param uuid the jornada's UUID
	* @param groupId the primary key of the group
	* @return the matching jornada
	* @throws PortalException if a matching jornada could not be found
	*/
	@Override
	public es.vass.ficha.model.Jornada getJornadaByUuidAndGroupId(String uuid,
		long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _jornadaLocalService.getJornadaByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the jornadas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.vass.ficha.model.impl.JornadaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of jornadas
	* @param end the upper bound of the range of jornadas (not inclusive)
	* @return the range of jornadas
	*/
	@Override
	public java.util.List<es.vass.ficha.model.Jornada> getJornadas(int start,
		int end) {
		return _jornadaLocalService.getJornadas(start, end);
	}

	/**
	* Returns all the jornadas matching the UUID and company.
	*
	* @param uuid the UUID of the jornadas
	* @param companyId the primary key of the company
	* @return the matching jornadas, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<es.vass.ficha.model.Jornada> getJornadasByUuidAndCompanyId(
		String uuid, long companyId) {
		return _jornadaLocalService.getJornadasByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of jornadas matching the UUID and company.
	*
	* @param uuid the UUID of the jornadas
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of jornadas
	* @param end the upper bound of the range of jornadas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching jornadas, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<es.vass.ficha.model.Jornada> getJornadasByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<es.vass.ficha.model.Jornada> orderByComparator) {
		return _jornadaLocalService.getJornadasByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	/**
	* Returns the number of jornadas.
	*
	* @return the number of jornadas
	*/
	@Override
	public int getJornadasCount() {
		return _jornadaLocalService.getJornadasCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _jornadaLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _jornadaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the jornada in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param jornada the jornada
	* @return the jornada that was updated
	*/
	@Override
	public es.vass.ficha.model.Jornada updateJornada(
		es.vass.ficha.model.Jornada jornada) {
		return _jornadaLocalService.updateJornada(jornada);
	}

	@Override
	public JornadaLocalService getWrappedService() {
		return _jornadaLocalService;
	}

	@Override
	public void setWrappedService(JornadaLocalService jornadaLocalService) {
		_jornadaLocalService = jornadaLocalService;
	}

	private JornadaLocalService _jornadaLocalService;
}