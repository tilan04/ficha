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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import es.vass.ficha.exception.NoSuchJornadaException;
import es.vass.ficha.model.Jornada;

/**
 * The persistence interface for the jornada service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see es.vass.ficha.service.persistence.impl.JornadaPersistenceImpl
 * @see JornadaUtil
 * @generated
 */
@ProviderType
public interface JornadaPersistence extends BasePersistence<Jornada> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JornadaUtil} to access the jornada persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the jornadas where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching jornadas
	*/
	public java.util.List<Jornada> findByUuid(String uuid);

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
	public java.util.List<Jornada> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Jornada> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Jornada> orderByComparator);

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
	public java.util.List<Jornada> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Jornada> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first jornada in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jornada
	* @throws NoSuchJornadaException if a matching jornada could not be found
	*/
	public Jornada findByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Jornada> orderByComparator)
		throws NoSuchJornadaException;

	/**
	* Returns the first jornada in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jornada, or <code>null</code> if a matching jornada could not be found
	*/
	public Jornada fetchByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Jornada> orderByComparator);

	/**
	* Returns the last jornada in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jornada
	* @throws NoSuchJornadaException if a matching jornada could not be found
	*/
	public Jornada findByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Jornada> orderByComparator)
		throws NoSuchJornadaException;

	/**
	* Returns the last jornada in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jornada, or <code>null</code> if a matching jornada could not be found
	*/
	public Jornada fetchByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Jornada> orderByComparator);

	/**
	* Returns the jornadas before and after the current jornada in the ordered set where uuid = &#63;.
	*
	* @param jornadaId the primary key of the current jornada
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next jornada
	* @throws NoSuchJornadaException if a jornada with the primary key could not be found
	*/
	public Jornada[] findByUuid_PrevAndNext(long jornadaId, String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Jornada> orderByComparator)
		throws NoSuchJornadaException;

	/**
	* Removes all the jornadas where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(String uuid);

	/**
	* Returns the number of jornadas where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching jornadas
	*/
	public int countByUuid(String uuid);

	/**
	* Returns the jornada where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchJornadaException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching jornada
	* @throws NoSuchJornadaException if a matching jornada could not be found
	*/
	public Jornada findByUUID_G(String uuid, long groupId)
		throws NoSuchJornadaException;

	/**
	* Returns the jornada where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching jornada, or <code>null</code> if a matching jornada could not be found
	*/
	public Jornada fetchByUUID_G(String uuid, long groupId);

	/**
	* Returns the jornada where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching jornada, or <code>null</code> if a matching jornada could not be found
	*/
	public Jornada fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the jornada where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the jornada that was removed
	*/
	public Jornada removeByUUID_G(String uuid, long groupId)
		throws NoSuchJornadaException;

	/**
	* Returns the number of jornadas where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching jornadas
	*/
	public int countByUUID_G(String uuid, long groupId);

	/**
	* Returns all the jornadas where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching jornadas
	*/
	public java.util.List<Jornada> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<Jornada> findByUuid_C(String uuid, long companyId,
		int start, int end);

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
	public java.util.List<Jornada> findByUuid_C(String uuid, long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Jornada> orderByComparator);

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
	public java.util.List<Jornada> findByUuid_C(String uuid, long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Jornada> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first jornada in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jornada
	* @throws NoSuchJornadaException if a matching jornada could not be found
	*/
	public Jornada findByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Jornada> orderByComparator)
		throws NoSuchJornadaException;

	/**
	* Returns the first jornada in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jornada, or <code>null</code> if a matching jornada could not be found
	*/
	public Jornada fetchByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Jornada> orderByComparator);

	/**
	* Returns the last jornada in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jornada
	* @throws NoSuchJornadaException if a matching jornada could not be found
	*/
	public Jornada findByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Jornada> orderByComparator)
		throws NoSuchJornadaException;

	/**
	* Returns the last jornada in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jornada, or <code>null</code> if a matching jornada could not be found
	*/
	public Jornada fetchByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Jornada> orderByComparator);

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
	public Jornada[] findByUuid_C_PrevAndNext(long jornadaId, String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Jornada> orderByComparator)
		throws NoSuchJornadaException;

	/**
	* Removes all the jornadas where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(String uuid, long companyId);

	/**
	* Returns the number of jornadas where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching jornadas
	*/
	public int countByUuid_C(String uuid, long companyId);

	/**
	* Returns all the jornadas where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching jornadas
	*/
	public java.util.List<Jornada> findByUsuario(long userId);

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
	public java.util.List<Jornada> findByUsuario(long userId, int start, int end);

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
	public java.util.List<Jornada> findByUsuario(long userId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Jornada> orderByComparator);

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
	public java.util.List<Jornada> findByUsuario(long userId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Jornada> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first jornada in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jornada
	* @throws NoSuchJornadaException if a matching jornada could not be found
	*/
	public Jornada findByUsuario_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Jornada> orderByComparator)
		throws NoSuchJornadaException;

	/**
	* Returns the first jornada in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jornada, or <code>null</code> if a matching jornada could not be found
	*/
	public Jornada fetchByUsuario_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Jornada> orderByComparator);

	/**
	* Returns the last jornada in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jornada
	* @throws NoSuchJornadaException if a matching jornada could not be found
	*/
	public Jornada findByUsuario_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Jornada> orderByComparator)
		throws NoSuchJornadaException;

	/**
	* Returns the last jornada in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jornada, or <code>null</code> if a matching jornada could not be found
	*/
	public Jornada fetchByUsuario_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Jornada> orderByComparator);

	/**
	* Returns the jornadas before and after the current jornada in the ordered set where userId = &#63;.
	*
	* @param jornadaId the primary key of the current jornada
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next jornada
	* @throws NoSuchJornadaException if a jornada with the primary key could not be found
	*/
	public Jornada[] findByUsuario_PrevAndNext(long jornadaId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Jornada> orderByComparator)
		throws NoSuchJornadaException;

	/**
	* Removes all the jornadas where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public void removeByUsuario(long userId);

	/**
	* Returns the number of jornadas where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching jornadas
	*/
	public int countByUsuario(long userId);

	/**
	* Caches the jornada in the entity cache if it is enabled.
	*
	* @param jornada the jornada
	*/
	public void cacheResult(Jornada jornada);

	/**
	* Caches the jornadas in the entity cache if it is enabled.
	*
	* @param jornadas the jornadas
	*/
	public void cacheResult(java.util.List<Jornada> jornadas);

	/**
	* Creates a new jornada with the primary key. Does not add the jornada to the database.
	*
	* @param jornadaId the primary key for the new jornada
	* @return the new jornada
	*/
	public Jornada create(long jornadaId);

	/**
	* Removes the jornada with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jornadaId the primary key of the jornada
	* @return the jornada that was removed
	* @throws NoSuchJornadaException if a jornada with the primary key could not be found
	*/
	public Jornada remove(long jornadaId) throws NoSuchJornadaException;

	public Jornada updateImpl(Jornada jornada);

	/**
	* Returns the jornada with the primary key or throws a {@link NoSuchJornadaException} if it could not be found.
	*
	* @param jornadaId the primary key of the jornada
	* @return the jornada
	* @throws NoSuchJornadaException if a jornada with the primary key could not be found
	*/
	public Jornada findByPrimaryKey(long jornadaId)
		throws NoSuchJornadaException;

	/**
	* Returns the jornada with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param jornadaId the primary key of the jornada
	* @return the jornada, or <code>null</code> if a jornada with the primary key could not be found
	*/
	public Jornada fetchByPrimaryKey(long jornadaId);

	@Override
	public java.util.Map<java.io.Serializable, Jornada> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the jornadas.
	*
	* @return the jornadas
	*/
	public java.util.List<Jornada> findAll();

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
	public java.util.List<Jornada> findAll(int start, int end);

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
	public java.util.List<Jornada> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Jornada> orderByComparator);

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
	public java.util.List<Jornada> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Jornada> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the jornadas from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of jornadas.
	*
	* @return the number of jornadas
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}