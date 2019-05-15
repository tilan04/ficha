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

package es.vass.ficha.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import es.vass.ficha.model.tipoServicio;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing tipoServicio in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see tipoServicio
 * @generated
 */
@ProviderType
public class tipoServicioCacheModel implements CacheModel<tipoServicio>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof tipoServicioCacheModel)) {
			return false;
		}

		tipoServicioCacheModel tipoServicioCacheModel = (tipoServicioCacheModel)obj;

		if (idTipoServicio == tipoServicioCacheModel.idTipoServicio) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, idTipoServicio);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{idTipoServicio=");
		sb.append(idTipoServicio);
		sb.append(", nombreTipoServicio=");
		sb.append(nombreTipoServicio);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public tipoServicio toEntityModel() {
		tipoServicioImpl tipoServicioImpl = new tipoServicioImpl();

		tipoServicioImpl.setIdTipoServicio(idTipoServicio);

		if (nombreTipoServicio == null) {
			tipoServicioImpl.setNombreTipoServicio("");
		}
		else {
			tipoServicioImpl.setNombreTipoServicio(nombreTipoServicio);
		}

		tipoServicioImpl.resetOriginalValues();

		return tipoServicioImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		idTipoServicio = objectInput.readLong();
		nombreTipoServicio = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(idTipoServicio);

		if (nombreTipoServicio == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nombreTipoServicio);
		}
	}

	public long idTipoServicio;
	public String nombreTipoServicio;
}