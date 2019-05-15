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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link tipoServicio}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tipoServicio
 * @generated
 */
@ProviderType
public class tipoServicioWrapper implements tipoServicio,
	ModelWrapper<tipoServicio> {
	public tipoServicioWrapper(tipoServicio tipoServicio) {
		_tipoServicio = tipoServicio;
	}

	@Override
	public Class<?> getModelClass() {
		return tipoServicio.class;
	}

	@Override
	public String getModelClassName() {
		return tipoServicio.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("idTipoServicio", getIdTipoServicio());
		attributes.put("nombreTipoServicio", getNombreTipoServicio());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long idTipoServicio = (Long)attributes.get("idTipoServicio");

		if (idTipoServicio != null) {
			setIdTipoServicio(idTipoServicio);
		}

		String nombreTipoServicio = (String)attributes.get("nombreTipoServicio");

		if (nombreTipoServicio != null) {
			setNombreTipoServicio(nombreTipoServicio);
		}
	}

	@Override
	public Object clone() {
		return new tipoServicioWrapper((tipoServicio)_tipoServicio.clone());
	}

	@Override
	public int compareTo(es.vass.ficha.model.tipoServicio tipoServicio) {
		return _tipoServicio.compareTo(tipoServicio);
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _tipoServicio.getExpandoBridge();
	}

	/**
	* Returns the id tipo servicio of this tipo servicio.
	*
	* @return the id tipo servicio of this tipo servicio
	*/
	@Override
	public long getIdTipoServicio() {
		return _tipoServicio.getIdTipoServicio();
	}

	/**
	* Returns the nombre tipo servicio of this tipo servicio.
	*
	* @return the nombre tipo servicio of this tipo servicio
	*/
	@Override
	public String getNombreTipoServicio() {
		return _tipoServicio.getNombreTipoServicio();
	}

	/**
	* Returns the primary key of this tipo servicio.
	*
	* @return the primary key of this tipo servicio
	*/
	@Override
	public long getPrimaryKey() {
		return _tipoServicio.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _tipoServicio.getPrimaryKeyObj();
	}

	@Override
	public int hashCode() {
		return _tipoServicio.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _tipoServicio.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _tipoServicio.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _tipoServicio.isNew();
	}

	@Override
	public void persist() {
		_tipoServicio.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tipoServicio.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_tipoServicio.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_tipoServicio.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_tipoServicio.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the id tipo servicio of this tipo servicio.
	*
	* @param idTipoServicio the id tipo servicio of this tipo servicio
	*/
	@Override
	public void setIdTipoServicio(long idTipoServicio) {
		_tipoServicio.setIdTipoServicio(idTipoServicio);
	}

	@Override
	public void setNew(boolean n) {
		_tipoServicio.setNew(n);
	}

	/**
	* Sets the nombre tipo servicio of this tipo servicio.
	*
	* @param nombreTipoServicio the nombre tipo servicio of this tipo servicio
	*/
	@Override
	public void setNombreTipoServicio(String nombreTipoServicio) {
		_tipoServicio.setNombreTipoServicio(nombreTipoServicio);
	}

	/**
	* Sets the primary key of this tipo servicio.
	*
	* @param primaryKey the primary key of this tipo servicio
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tipoServicio.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_tipoServicio.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<es.vass.ficha.model.tipoServicio> toCacheModel() {
		return _tipoServicio.toCacheModel();
	}

	@Override
	public es.vass.ficha.model.tipoServicio toEscapedModel() {
		return new tipoServicioWrapper(_tipoServicio.toEscapedModel());
	}

	@Override
	public String toString() {
		return _tipoServicio.toString();
	}

	@Override
	public es.vass.ficha.model.tipoServicio toUnescapedModel() {
		return new tipoServicioWrapper(_tipoServicio.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _tipoServicio.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof tipoServicioWrapper)) {
			return false;
		}

		tipoServicioWrapper tipoServicioWrapper = (tipoServicioWrapper)obj;

		if (Objects.equals(_tipoServicio, tipoServicioWrapper._tipoServicio)) {
			return true;
		}

		return false;
	}

	@Override
	public tipoServicio getWrappedModel() {
		return _tipoServicio;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _tipoServicio.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _tipoServicio.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_tipoServicio.resetOriginalValues();
	}

	private final tipoServicio _tipoServicio;
}