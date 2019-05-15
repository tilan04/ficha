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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class JornadaSoap implements Serializable {
	public static JornadaSoap toSoapModel(Jornada model) {
		JornadaSoap soapModel = new JornadaSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setJornadaId(model.getJornadaId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setFechaFinalizacion(model.getFechaFinalizacion());
		soapModel.setLatitud(model.getLatitud());
		soapModel.setLonguitud(model.getLonguitud());
		soapModel.setHorasAsignadas(model.getHorasAsignadas());
		soapModel.setTipoServicio(model.getTipoServicio());

		return soapModel;
	}

	public static JornadaSoap[] toSoapModels(Jornada[] models) {
		JornadaSoap[] soapModels = new JornadaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static JornadaSoap[][] toSoapModels(Jornada[][] models) {
		JornadaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new JornadaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new JornadaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static JornadaSoap[] toSoapModels(List<Jornada> models) {
		List<JornadaSoap> soapModels = new ArrayList<JornadaSoap>(models.size());

		for (Jornada model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new JornadaSoap[soapModels.size()]);
	}

	public JornadaSoap() {
	}

	public long getPrimaryKey() {
		return _jornadaId;
	}

	public void setPrimaryKey(long pk) {
		setJornadaId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getJornadaId() {
		return _jornadaId;
	}

	public void setJornadaId(long jornadaId) {
		_jornadaId = jornadaId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public Date getFechaFinalizacion() {
		return _fechaFinalizacion;
	}

	public void setFechaFinalizacion(Date fechaFinalizacion) {
		_fechaFinalizacion = fechaFinalizacion;
	}

	public long getLatitud() {
		return _latitud;
	}

	public void setLatitud(long latitud) {
		_latitud = latitud;
	}

	public long getLonguitud() {
		return _longuitud;
	}

	public void setLonguitud(long longuitud) {
		_longuitud = longuitud;
	}

	public long getHorasAsignadas() {
		return _horasAsignadas;
	}

	public void setHorasAsignadas(long horasAsignadas) {
		_horasAsignadas = horasAsignadas;
	}

	public long getTipoServicio() {
		return _tipoServicio;
	}

	public void setTipoServicio(long tipoServicio) {
		_tipoServicio = tipoServicio;
	}

	private String _uuid;
	private long _jornadaId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private Date _fechaFinalizacion;
	private long _latitud;
	private long _longuitud;
	private long _horasAsignadas;
	private long _tipoServicio;
}