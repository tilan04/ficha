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
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class tipoServicioSoap implements Serializable {
	public static tipoServicioSoap toSoapModel(tipoServicio model) {
		tipoServicioSoap soapModel = new tipoServicioSoap();

		soapModel.setIdTipoServicio(model.getIdTipoServicio());
		soapModel.setNombreTipoServicio(model.getNombreTipoServicio());

		return soapModel;
	}

	public static tipoServicioSoap[] toSoapModels(tipoServicio[] models) {
		tipoServicioSoap[] soapModels = new tipoServicioSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static tipoServicioSoap[][] toSoapModels(tipoServicio[][] models) {
		tipoServicioSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new tipoServicioSoap[models.length][models[0].length];
		}
		else {
			soapModels = new tipoServicioSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static tipoServicioSoap[] toSoapModels(List<tipoServicio> models) {
		List<tipoServicioSoap> soapModels = new ArrayList<tipoServicioSoap>(models.size());

		for (tipoServicio model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new tipoServicioSoap[soapModels.size()]);
	}

	public tipoServicioSoap() {
	}

	public long getPrimaryKey() {
		return _idTipoServicio;
	}

	public void setPrimaryKey(long pk) {
		setIdTipoServicio(pk);
	}

	public long getIdTipoServicio() {
		return _idTipoServicio;
	}

	public void setIdTipoServicio(long idTipoServicio) {
		_idTipoServicio = idTipoServicio;
	}

	public String getNombreTipoServicio() {
		return _nombreTipoServicio;
	}

	public void setNombreTipoServicio(String nombreTipoServicio) {
		_nombreTipoServicio = nombreTipoServicio;
	}

	private long _idTipoServicio;
	private String _nombreTipoServicio;
}