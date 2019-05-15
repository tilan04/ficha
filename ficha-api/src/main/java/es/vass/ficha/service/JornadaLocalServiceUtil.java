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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Jornada. This utility wraps
 * {@link es.vass.ficha.service.impl.JornadaLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see JornadaLocalService
 * @see es.vass.ficha.service.base.JornadaLocalServiceBaseImpl
 * @see es.vass.ficha.service.impl.JornadaLocalServiceImpl
 * @generated
 */
@ProviderType
public class JornadaLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link es.vass.ficha.service.impl.JornadaLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the jornada to the database. Also notifies the appropriate model listeners.
	*
	* @param jornada the jornada
	* @return the jornada that was added
	*/
	public static es.vass.ficha.model.Jornada addJornada(
		es.vass.ficha.model.Jornada jornada) {
		return getService().addJornada(jornada);
	}

	public static void addJornada(long groupId, long companyId, long userId,
		String userName, long tipoServicio) {
		getService()
			.addJornada(groupId, companyId, userId, userName, tipoServicio);
	}

	public static double calculoHorasTrabajadas(
		java.util.List<es.vass.ficha.model.Jornada> jornadas) {
		return getService().calculoHorasTrabajadas(jornadas);
	}

	/**
	* Creates a new jornada with the primary key. Does not add the jornada to the database.
	*
	* @param jornadaId the primary key for the new jornada
	* @return the new jornada
	*/
	public static es.vass.ficha.model.Jornada createJornada(long jornadaId) {
		return getService().createJornada(jornadaId);
	}

	/**
	* Deletes the jornada from the database. Also notifies the appropriate model listeners.
	*
	* @param jornada the jornada
	* @return the jornada that was removed
	*/
	public static es.vass.ficha.model.Jornada deleteJornada(
		es.vass.ficha.model.Jornada jornada) {
		return getService().deleteJornada(jornada);
	}

	/**
	* Deletes the jornada with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jornadaId the primary key of the jornada
	* @return the jornada that was removed
	* @throws PortalException if a jornada with the primary key could not be found
	*/
	public static es.vass.ficha.model.Jornada deleteJornada(long jornadaId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteJornada(jornadaId);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.vass.ficha.model.impl.JornadaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.vass.ficha.model.impl.JornadaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
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

	public static es.vass.ficha.model.Jornada fetchJornada(long jornadaId) {
		return getService().fetchJornada(jornadaId);
	}

	/**
	* Returns the jornada matching the UUID and group.
	*
	* @param uuid the jornada's UUID
	* @param groupId the primary key of the group
	* @return the matching jornada, or <code>null</code> if a matching jornada could not be found
	*/
	public static es.vass.ficha.model.Jornada fetchJornadaByUuidAndGroupId(
		String uuid, long groupId) {
		return getService().fetchJornadaByUuidAndGroupId(uuid, groupId);
	}

	public static java.util.List<es.vass.ficha.model.Jornada> findByUserId(
		long userId) {
		return getService().findByUserId(userId);
	}

	public static java.util.List<es.vass.ficha.model.Jornada> findByUserIdAndDate(
		long userId, java.util.Date createDate) {
		return getService().findByUserIdAndDate(userId, createDate);
	}

	public static java.util.List<es.vass.ficha.model.Jornada> findByUserIdAndDateForUsers(
		long userId) {
		return getService().findByUserIdAndDateForUsers(userId);
	}

	public static es.vass.ficha.model.Jornada findLastByUserId(long userId) {
		return getService().findLastByUserId(userId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the jornada with the primary key.
	*
	* @param jornadaId the primary key of the jornada
	* @return the jornada
	* @throws PortalException if a jornada with the primary key could not be found
	*/
	public static es.vass.ficha.model.Jornada getJornada(long jornadaId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getJornada(jornadaId);
	}

	/**
	* Returns the jornada matching the UUID and group.
	*
	* @param uuid the jornada's UUID
	* @param groupId the primary key of the group
	* @return the matching jornada
	* @throws PortalException if a matching jornada could not be found
	*/
	public static es.vass.ficha.model.Jornada getJornadaByUuidAndGroupId(
		String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getJornadaByUuidAndGroupId(uuid, groupId);
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
	public static java.util.List<es.vass.ficha.model.Jornada> getJornadas(
		int start, int end) {
		return getService().getJornadas(start, end);
	}

	/**
	* Returns all the jornadas matching the UUID and company.
	*
	* @param uuid the UUID of the jornadas
	* @param companyId the primary key of the company
	* @return the matching jornadas, or an empty list if no matches were found
	*/
	public static java.util.List<es.vass.ficha.model.Jornada> getJornadasByUuidAndCompanyId(
		String uuid, long companyId) {
		return getService().getJornadasByUuidAndCompanyId(uuid, companyId);
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
	public static java.util.List<es.vass.ficha.model.Jornada> getJornadasByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<es.vass.ficha.model.Jornada> orderByComparator) {
		return getService()
				   .getJornadasByUuidAndCompanyId(uuid, companyId, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of jornadas.
	*
	* @return the number of jornadas
	*/
	public static int getJornadasCount() {
		return getService().getJornadasCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the jornada in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param jornada the jornada
	* @return the jornada that was updated
	*/
	public static es.vass.ficha.model.Jornada updateJornada(
		es.vass.ficha.model.Jornada jornada) {
		return getService().updateJornada(jornada);
	}

	public static JornadaLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<JornadaLocalService, JornadaLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(JornadaLocalService.class);

		ServiceTracker<JornadaLocalService, JornadaLocalService> serviceTracker = new ServiceTracker<JornadaLocalService, JornadaLocalService>(bundle.getBundleContext(),
				JornadaLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}