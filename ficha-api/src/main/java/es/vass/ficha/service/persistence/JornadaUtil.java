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

import es.vass.ficha.model.Jornada;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the jornada service. This utility wraps {@link es.vass.ficha.service.persistence.impl.JornadaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JornadaPersistence
 * @see es.vass.ficha.service.persistence.impl.JornadaPersistenceImpl
 * @generated
 */
@ProviderType
public class JornadaUtil {
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
	public static void clearCache(Jornada jornada) {
		getPersistence().clearCache(jornada);
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
	public static List<Jornada> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Jornada> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Jornada> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Jornada> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Jornada update(Jornada jornada) {
		return getPersistence().update(jornada);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Jornada update(Jornada jornada, ServiceContext serviceContext) {
		return getPersistence().update(jornada, serviceContext);
	}

	/**
	* Returns all the jornadas where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching jornadas
	*/
	public static List<Jornada> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the jornadas where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JornadaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of jornadas
	* @param end the upper bound of the range of jornadas (not inclusive)
	* @return the range of matching jornadas
	*/
	public static List<Jornada> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the jornadas where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JornadaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of jornadas
	* @param end the upper bound of the range of jornadas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching jornadas
	*/
	public static List<Jornada> findByUuid(String uuid, int start, int end,
		OrderByComparator<Jornada> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the jornadas where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JornadaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of jornadas
	* @param end the upper bound of the range of jornadas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching jornadas
	*/
	public static List<Jornada> findByUuid(String uuid, int start, int end,
		OrderByComparator<Jornada> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first jornada in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jornada
	* @throws NoSuchJornadaException if a matching jornada could not be found
	*/
	public static Jornada findByUuid_First(String uuid,
		OrderByComparator<Jornada> orderByComparator)
		throws es.vass.ficha.exception.NoSuchJornadaException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first jornada in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jornada, or <code>null</code> if a matching jornada could not be found
	*/
	public static Jornada fetchByUuid_First(String uuid,
		OrderByComparator<Jornada> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last jornada in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jornada
	* @throws NoSuchJornadaException if a matching jornada could not be found
	*/
	public static Jornada findByUuid_Last(String uuid,
		OrderByComparator<Jornada> orderByComparator)
		throws es.vass.ficha.exception.NoSuchJornadaException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last jornada in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jornada, or <code>null</code> if a matching jornada could not be found
	*/
	public static Jornada fetchByUuid_Last(String uuid,
		OrderByComparator<Jornada> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the jornadas before and after the current jornada in the ordered set where uuid = &#63;.
	*
	* @param jornadaId the primary key of the current jornada
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next jornada
	* @throws NoSuchJornadaException if a jornada with the primary key could not be found
	*/
	public static Jornada[] findByUuid_PrevAndNext(long jornadaId, String uuid,
		OrderByComparator<Jornada> orderByComparator)
		throws es.vass.ficha.exception.NoSuchJornadaException {
		return getPersistence()
				   .findByUuid_PrevAndNext(jornadaId, uuid, orderByComparator);
	}

	/**
	* Removes all the jornadas where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of jornadas where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching jornadas
	*/
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the jornada where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchJornadaException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching jornada
	* @throws NoSuchJornadaException if a matching jornada could not be found
	*/
	public static Jornada findByUUID_G(String uuid, long groupId)
		throws es.vass.ficha.exception.NoSuchJornadaException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the jornada where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching jornada, or <code>null</code> if a matching jornada could not be found
	*/
	public static Jornada fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the jornada where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching jornada, or <code>null</code> if a matching jornada could not be found
	*/
	public static Jornada fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the jornada where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the jornada that was removed
	*/
	public static Jornada removeByUUID_G(String uuid, long groupId)
		throws es.vass.ficha.exception.NoSuchJornadaException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of jornadas where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching jornadas
	*/
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the jornadas where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching jornadas
	*/
	public static List<Jornada> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the jornadas where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JornadaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of jornadas
	* @param end the upper bound of the range of jornadas (not inclusive)
	* @return the range of matching jornadas
	*/
	public static List<Jornada> findByUuid_C(String uuid, long companyId,
		int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the jornadas where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JornadaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of jornadas
	* @param end the upper bound of the range of jornadas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching jornadas
	*/
	public static List<Jornada> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<Jornada> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the jornadas where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JornadaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of jornadas
	* @param end the upper bound of the range of jornadas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching jornadas
	*/
	public static List<Jornada> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<Jornada> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first jornada in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jornada
	* @throws NoSuchJornadaException if a matching jornada could not be found
	*/
	public static Jornada findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Jornada> orderByComparator)
		throws es.vass.ficha.exception.NoSuchJornadaException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first jornada in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jornada, or <code>null</code> if a matching jornada could not be found
	*/
	public static Jornada fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Jornada> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last jornada in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jornada
	* @throws NoSuchJornadaException if a matching jornada could not be found
	*/
	public static Jornada findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Jornada> orderByComparator)
		throws es.vass.ficha.exception.NoSuchJornadaException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last jornada in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jornada, or <code>null</code> if a matching jornada could not be found
	*/
	public static Jornada fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Jornada> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the jornadas before and after the current jornada in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param jornadaId the primary key of the current jornada
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next jornada
	* @throws NoSuchJornadaException if a jornada with the primary key could not be found
	*/
	public static Jornada[] findByUuid_C_PrevAndNext(long jornadaId,
		String uuid, long companyId,
		OrderByComparator<Jornada> orderByComparator)
		throws es.vass.ficha.exception.NoSuchJornadaException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(jornadaId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the jornadas where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of jornadas where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching jornadas
	*/
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the jornadas where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching jornadas
	*/
	public static List<Jornada> findByUsuario(long userId) {
		return getPersistence().findByUsuario(userId);
	}

	/**
	* Returns a range of all the jornadas where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JornadaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of jornadas
	* @param end the upper bound of the range of jornadas (not inclusive)
	* @return the range of matching jornadas
	*/
	public static List<Jornada> findByUsuario(long userId, int start, int end) {
		return getPersistence().findByUsuario(userId, start, end);
	}

	/**
	* Returns an ordered range of all the jornadas where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JornadaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of jornadas
	* @param end the upper bound of the range of jornadas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching jornadas
	*/
	public static List<Jornada> findByUsuario(long userId, int start, int end,
		OrderByComparator<Jornada> orderByComparator) {
		return getPersistence()
				   .findByUsuario(userId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the jornadas where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JornadaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of jornadas
	* @param end the upper bound of the range of jornadas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching jornadas
	*/
	public static List<Jornada> findByUsuario(long userId, int start, int end,
		OrderByComparator<Jornada> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUsuario(userId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first jornada in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jornada
	* @throws NoSuchJornadaException if a matching jornada could not be found
	*/
	public static Jornada findByUsuario_First(long userId,
		OrderByComparator<Jornada> orderByComparator)
		throws es.vass.ficha.exception.NoSuchJornadaException {
		return getPersistence().findByUsuario_First(userId, orderByComparator);
	}

	/**
	* Returns the first jornada in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jornada, or <code>null</code> if a matching jornada could not be found
	*/
	public static Jornada fetchByUsuario_First(long userId,
		OrderByComparator<Jornada> orderByComparator) {
		return getPersistence().fetchByUsuario_First(userId, orderByComparator);
	}

	/**
	* Returns the last jornada in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jornada
	* @throws NoSuchJornadaException if a matching jornada could not be found
	*/
	public static Jornada findByUsuario_Last(long userId,
		OrderByComparator<Jornada> orderByComparator)
		throws es.vass.ficha.exception.NoSuchJornadaException {
		return getPersistence().findByUsuario_Last(userId, orderByComparator);
	}

	/**
	* Returns the last jornada in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jornada, or <code>null</code> if a matching jornada could not be found
	*/
	public static Jornada fetchByUsuario_Last(long userId,
		OrderByComparator<Jornada> orderByComparator) {
		return getPersistence().fetchByUsuario_Last(userId, orderByComparator);
	}

	/**
	* Returns the jornadas before and after the current jornada in the ordered set where userId = &#63;.
	*
	* @param jornadaId the primary key of the current jornada
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next jornada
	* @throws NoSuchJornadaException if a jornada with the primary key could not be found
	*/
	public static Jornada[] findByUsuario_PrevAndNext(long jornadaId,
		long userId, OrderByComparator<Jornada> orderByComparator)
		throws es.vass.ficha.exception.NoSuchJornadaException {
		return getPersistence()
				   .findByUsuario_PrevAndNext(jornadaId, userId,
			orderByComparator);
	}

	/**
	* Removes all the jornadas where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public static void removeByUsuario(long userId) {
		getPersistence().removeByUsuario(userId);
	}

	/**
	* Returns the number of jornadas where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching jornadas
	*/
	public static int countByUsuario(long userId) {
		return getPersistence().countByUsuario(userId);
	}

	/**
	* Caches the jornada in the entity cache if it is enabled.
	*
	* @param jornada the jornada
	*/
	public static void cacheResult(Jornada jornada) {
		getPersistence().cacheResult(jornada);
	}

	/**
	* Caches the jornadas in the entity cache if it is enabled.
	*
	* @param jornadas the jornadas
	*/
	public static void cacheResult(List<Jornada> jornadas) {
		getPersistence().cacheResult(jornadas);
	}

	/**
	* Creates a new jornada with the primary key. Does not add the jornada to the database.
	*
	* @param jornadaId the primary key for the new jornada
	* @return the new jornada
	*/
	public static Jornada create(long jornadaId) {
		return getPersistence().create(jornadaId);
	}

	/**
	* Removes the jornada with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jornadaId the primary key of the jornada
	* @return the jornada that was removed
	* @throws NoSuchJornadaException if a jornada with the primary key could not be found
	*/
	public static Jornada remove(long jornadaId)
		throws es.vass.ficha.exception.NoSuchJornadaException {
		return getPersistence().remove(jornadaId);
	}

	public static Jornada updateImpl(Jornada jornada) {
		return getPersistence().updateImpl(jornada);
	}

	/**
	* Returns the jornada with the primary key or throws a {@link NoSuchJornadaException} if it could not be found.
	*
	* @param jornadaId the primary key of the jornada
	* @return the jornada
	* @throws NoSuchJornadaException if a jornada with the primary key could not be found
	*/
	public static Jornada findByPrimaryKey(long jornadaId)
		throws es.vass.ficha.exception.NoSuchJornadaException {
		return getPersistence().findByPrimaryKey(jornadaId);
	}

	/**
	* Returns the jornada with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param jornadaId the primary key of the jornada
	* @return the jornada, or <code>null</code> if a jornada with the primary key could not be found
	*/
	public static Jornada fetchByPrimaryKey(long jornadaId) {
		return getPersistence().fetchByPrimaryKey(jornadaId);
	}

	public static java.util.Map<java.io.Serializable, Jornada> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the jornadas.
	*
	* @return the jornadas
	*/
	public static List<Jornada> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the jornadas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JornadaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of jornadas
	* @param end the upper bound of the range of jornadas (not inclusive)
	* @return the range of jornadas
	*/
	public static List<Jornada> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the jornadas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JornadaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of jornadas
	* @param end the upper bound of the range of jornadas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of jornadas
	*/
	public static List<Jornada> findAll(int start, int end,
		OrderByComparator<Jornada> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the jornadas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JornadaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of jornadas
	* @param end the upper bound of the range of jornadas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of jornadas
	*/
	public static List<Jornada> findAll(int start, int end,
		OrderByComparator<Jornada> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the jornadas from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of jornadas.
	*
	* @return the number of jornadas
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static JornadaPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<JornadaPersistence, JornadaPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(JornadaPersistence.class);

		ServiceTracker<JornadaPersistence, JornadaPersistence> serviceTracker = new ServiceTracker<JornadaPersistence, JornadaPersistence>(bundle.getBundleContext(),
				JornadaPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}