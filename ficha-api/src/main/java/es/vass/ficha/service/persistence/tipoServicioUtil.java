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

package es.vass.ficha.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import es.vass.ficha.model.tipoServicio;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the tipo servicio service. This utility wraps {@link es.vass.ficha.service.persistence.impl.tipoServicioPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tipoServicioPersistence
 * @see es.vass.ficha.service.persistence.impl.tipoServicioPersistenceImpl
 * @generated
 */
@ProviderType
public class tipoServicioUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(tipoServicio tipoServicio) {
		getPersistence().clearCache(tipoServicio);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<tipoServicio> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<tipoServicio> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<tipoServicio> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<tipoServicio> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static tipoServicio update(tipoServicio tipoServicio) {
		return getPersistence().update(tipoServicio);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static tipoServicio update(tipoServicio tipoServicio,
		ServiceContext serviceContext) {
		return getPersistence().update(tipoServicio, serviceContext);
	}

	/**
	* Caches the tipo servicio in the entity cache if it is enabled.
	*
	* @param tipoServicio the tipo servicio
	*/
	public static void cacheResult(tipoServicio tipoServicio) {
		getPersistence().cacheResult(tipoServicio);
	}

	/**
	* Caches the tipo servicios in the entity cache if it is enabled.
	*
	* @param tipoServicios the tipo servicios
	*/
	public static void cacheResult(List<tipoServicio> tipoServicios) {
		getPersistence().cacheResult(tipoServicios);
	}

	/**
	* Creates a new tipo servicio with the primary key. Does not add the tipo servicio to the database.
	*
	* @param idTipoServicio the primary key for the new tipo servicio
	* @return the new tipo servicio
	*/
	public static tipoServicio create(long idTipoServicio) {
		return getPersistence().create(idTipoServicio);
	}

	/**
	* Removes the tipo servicio with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param idTipoServicio the primary key of the tipo servicio
	* @return the tipo servicio that was removed
	* @throws NoSuchtipoServicioException if a tipo servicio with the primary key could not be found
	*/
	public static tipoServicio remove(long idTipoServicio)
		throws es.vass.ficha.exception.NoSuchtipoServicioException {
		return getPersistence().remove(idTipoServicio);
	}

	public static tipoServicio updateImpl(tipoServicio tipoServicio) {
		return getPersistence().updateImpl(tipoServicio);
	}

	/**
	* Returns the tipo servicio with the primary key or throws a {@link NoSuchtipoServicioException} if it could not be found.
	*
	* @param idTipoServicio the primary key of the tipo servicio
	* @return the tipo servicio
	* @throws NoSuchtipoServicioException if a tipo servicio with the primary key could not be found
	*/
	public static tipoServicio findByPrimaryKey(long idTipoServicio)
		throws es.vass.ficha.exception.NoSuchtipoServicioException {
		return getPersistence().findByPrimaryKey(idTipoServicio);
	}

	/**
	* Returns the tipo servicio with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param idTipoServicio the primary key of the tipo servicio
	* @return the tipo servicio, or <code>null</code> if a tipo servicio with the primary key could not be found
	*/
	public static tipoServicio fetchByPrimaryKey(long idTipoServicio) {
		return getPersistence().fetchByPrimaryKey(idTipoServicio);
	}

	public static java.util.Map<java.io.Serializable, tipoServicio> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the tipo servicios.
	*
	* @return the tipo servicios
	*/
	public static List<tipoServicio> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the tipo servicios.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tipoServicioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipo servicios
	* @param end the upper bound of the range of tipo servicios (not inclusive)
	* @return the range of tipo servicios
	*/
	public static List<tipoServicio> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the tipo servicios.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tipoServicioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipo servicios
	* @param end the upper bound of the range of tipo servicios (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tipo servicios
	*/
	public static List<tipoServicio> findAll(int start, int end,
		OrderByComparator<tipoServicio> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the tipo servicios.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tipoServicioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipo servicios
	* @param end the upper bound of the range of tipo servicios (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of tipo servicios
	*/
	public static List<tipoServicio> findAll(int start, int end,
		OrderByComparator<tipoServicio> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the tipo servicios from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tipo servicios.
	*
	* @return the number of tipo servicios
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static tipoServicioPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<tipoServicioPersistence, tipoServicioPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(tipoServicioPersistence.class);

		ServiceTracker<tipoServicioPersistence, tipoServicioPersistence> serviceTracker =
			new ServiceTracker<tipoServicioPersistence, tipoServicioPersistence>(bundle.getBundleContext(),
				tipoServicioPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}