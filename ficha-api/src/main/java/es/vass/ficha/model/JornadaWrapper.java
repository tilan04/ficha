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

package es.vass.ficha.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Jornada}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Jornada
 * @generated
 */
@ProviderType
public class JornadaWrapper implements Jornada, ModelWrapper<Jornada> {
	public JornadaWrapper(Jornada jornada) {
		_jornada = jornada;
	}

	@Override
	public Class<?> getModelClass() {
		return Jornada.class;
	}

	@Override
	public String getModelClassName() {
		return Jornada.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("jornadaId", getJornadaId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("fechaFinalizacion", getFechaFinalizacion());
		attributes.put("latitud", getLatitud());
		attributes.put("longuitud", getLonguitud());
		attributes.put("horasAsignadas", getHorasAsignadas());
		attributes.put("tipoServicio", getTipoServicio());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long jornadaId = (Long)attributes.get("jornadaId");

		if (jornadaId != null) {
			setJornadaId(jornadaId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Date fechaFinalizacion = (Date)attributes.get("fechaFinalizacion");

		if (fechaFinalizacion != null) {
			setFechaFinalizacion(fechaFinalizacion);
		}

		Long latitud = (Long)attributes.get("latitud");

		if (latitud != null) {
			setLatitud(latitud);
		}

		Long longuitud = (Long)attributes.get("longuitud");

		if (longuitud != null) {
			setLonguitud(longuitud);
		}

		Long horasAsignadas = (Long)attributes.get("horasAsignadas");

		if (horasAsignadas != null) {
			setHorasAsignadas(horasAsignadas);
		}

		Long tipoServicio = (Long)attributes.get("tipoServicio");

		if (tipoServicio != null) {
			setTipoServicio(tipoServicio);
		}
	}

	@Override
	public Object clone() {
		return new JornadaWrapper((Jornada)_jornada.clone());
	}

	@Override
	public int compareTo(Jornada jornada) {
		return _jornada.compareTo(jornada);
	}

	/**
	* Returns the company ID of this jornada.
	*
	* @return the company ID of this jornada
	*/
	@Override
	public long getCompanyId() {
		return _jornada.getCompanyId();
	}

	/**
	* Returns the create date of this jornada.
	*
	* @return the create date of this jornada
	*/
	@Override
	public Date getCreateDate() {
		return _jornada.getCreateDate();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _jornada.getExpandoBridge();
	}

	/**
	* Returns the fecha finalizacion of this jornada.
	*
	* @return the fecha finalizacion of this jornada
	*/
	@Override
	public Date getFechaFinalizacion() {
		return _jornada.getFechaFinalizacion();
	}

	/**
	* Returns the group ID of this jornada.
	*
	* @return the group ID of this jornada
	*/
	@Override
	public long getGroupId() {
		return _jornada.getGroupId();
	}

	/**
	* Returns the horas asignadas of this jornada.
	*
	* @return the horas asignadas of this jornada
	*/
	@Override
	public long getHorasAsignadas() {
		return _jornada.getHorasAsignadas();
	}

	/**
	* Returns the jornada ID of this jornada.
	*
	* @return the jornada ID of this jornada
	*/
	@Override
	public long getJornadaId() {
		return _jornada.getJornadaId();
	}

	/**
	* Returns the latitud of this jornada.
	*
	* @return the latitud of this jornada
	*/
	@Override
	public long getLatitud() {
		return _jornada.getLatitud();
	}

	/**
	* Returns the longuitud of this jornada.
	*
	* @return the longuitud of this jornada
	*/
	@Override
	public long getLonguitud() {
		return _jornada.getLonguitud();
	}

	/**
	* Returns the modified date of this jornada.
	*
	* @return the modified date of this jornada
	*/
	@Override
	public Date getModifiedDate() {
		return _jornada.getModifiedDate();
	}

	/**
	* Returns the primary key of this jornada.
	*
	* @return the primary key of this jornada
	*/
	@Override
	public long getPrimaryKey() {
		return _jornada.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _jornada.getPrimaryKeyObj();
	}

	/**
	* Returns the tipo servicio of this jornada.
	*
	* @return the tipo servicio of this jornada
	*/
	@Override
	public long getTipoServicio() {
		return _jornada.getTipoServicio();
	}

	/**
	* Returns the user ID of this jornada.
	*
	* @return the user ID of this jornada
	*/
	@Override
	public long getUserId() {
		return _jornada.getUserId();
	}

	/**
	* Returns the user name of this jornada.
	*
	* @return the user name of this jornada
	*/
	@Override
	public String getUserName() {
		return _jornada.getUserName();
	}

	/**
	* Returns the user uuid of this jornada.
	*
	* @return the user uuid of this jornada
	*/
	@Override
	public String getUserUuid() {
		return _jornada.getUserUuid();
	}

	/**
	* Returns the uuid of this jornada.
	*
	* @return the uuid of this jornada
	*/
	@Override
	public String getUuid() {
		return _jornada.getUuid();
	}

	@Override
	public int hashCode() {
		return _jornada.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _jornada.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _jornada.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _jornada.isNew();
	}

	@Override
	public void persist() {
		_jornada.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_jornada.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this jornada.
	*
	* @param companyId the company ID of this jornada
	*/
	@Override
	public void setCompanyId(long companyId) {
		_jornada.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this jornada.
	*
	* @param createDate the create date of this jornada
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_jornada.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_jornada.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_jornada.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_jornada.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the fecha finalizacion of this jornada.
	*
	* @param fechaFinalizacion the fecha finalizacion of this jornada
	*/
	@Override
	public void setFechaFinalizacion(Date fechaFinalizacion) {
		_jornada.setFechaFinalizacion(fechaFinalizacion);
	}

	/**
	* Sets the group ID of this jornada.
	*
	* @param groupId the group ID of this jornada
	*/
	@Override
	public void setGroupId(long groupId) {
		_jornada.setGroupId(groupId);
	}

	/**
	* Sets the horas asignadas of this jornada.
	*
	* @param horasAsignadas the horas asignadas of this jornada
	*/
	@Override
	public void setHorasAsignadas(long horasAsignadas) {
		_jornada.setHorasAsignadas(horasAsignadas);
	}

	/**
	* Sets the jornada ID of this jornada.
	*
	* @param jornadaId the jornada ID of this jornada
	*/
	@Override
	public void setJornadaId(long jornadaId) {
		_jornada.setJornadaId(jornadaId);
	}

	/**
	* Sets the latitud of this jornada.
	*
	* @param latitud the latitud of this jornada
	*/
	@Override
	public void setLatitud(long latitud) {
		_jornada.setLatitud(latitud);
	}

	/**
	* Sets the longuitud of this jornada.
	*
	* @param longuitud the longuitud of this jornada
	*/
	@Override
	public void setLonguitud(long longuitud) {
		_jornada.setLonguitud(longuitud);
	}

	/**
	* Sets the modified date of this jornada.
	*
	* @param modifiedDate the modified date of this jornada
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_jornada.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_jornada.setNew(n);
	}

	/**
	* Sets the primary key of this jornada.
	*
	* @param primaryKey the primary key of this jornada
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_jornada.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_jornada.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the tipo servicio of this jornada.
	*
	* @param tipoServicio the tipo servicio of this jornada
	*/
	@Override
	public void setTipoServicio(long tipoServicio) {
		_jornada.setTipoServicio(tipoServicio);
	}

	/**
	* Sets the user ID of this jornada.
	*
	* @param userId the user ID of this jornada
	*/
	@Override
	public void setUserId(long userId) {
		_jornada.setUserId(userId);
	}

	/**
	* Sets the user name of this jornada.
	*
	* @param userName the user name of this jornada
	*/
	@Override
	public void setUserName(String userName) {
		_jornada.setUserName(userName);
	}

	/**
	* Sets the user uuid of this jornada.
	*
	* @param userUuid the user uuid of this jornada
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_jornada.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this jornada.
	*
	* @param uuid the uuid of this jornada
	*/
	@Override
	public void setUuid(String uuid) {
		_jornada.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Jornada> toCacheModel() {
		return _jornada.toCacheModel();
	}

	@Override
	public Jornada toEscapedModel() {
		return new JornadaWrapper(_jornada.toEscapedModel());
	}

	@Override
	public String toString() {
		return _jornada.toString();
	}

	@Override
	public Jornada toUnescapedModel() {
		return new JornadaWrapper(_jornada.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _jornada.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof JornadaWrapper)) {
			return false;
		}

		JornadaWrapper jornadaWrapper = (JornadaWrapper)obj;

		if (Objects.equals(_jornada, jornadaWrapper._jornada)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _jornada.getStagedModelType();
	}

	@Override
	public Jornada getWrappedModel() {
		return _jornada;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _jornada.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _jornada.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_jornada.resetOriginalValues();
	}

	private final Jornada _jornada;
}