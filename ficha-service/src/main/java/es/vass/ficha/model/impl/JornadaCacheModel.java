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

import es.vass.ficha.model.Jornada;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Jornada in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Jornada
 * @generated
 */
@ProviderType
public class JornadaCacheModel implements CacheModel<Jornada>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof JornadaCacheModel)) {
			return false;
		}

		JornadaCacheModel jornadaCacheModel = (JornadaCacheModel)obj;

		if (jornadaId == jornadaCacheModel.jornadaId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, jornadaId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", jornadaId=");
		sb.append(jornadaId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", fechaFinalizacion=");
		sb.append(fechaFinalizacion);
		sb.append(", latitud=");
		sb.append(latitud);
		sb.append(", longuitud=");
		sb.append(longuitud);
		sb.append(", horasAsignadas=");
		sb.append(horasAsignadas);
		sb.append(", tipoServicio=");
		sb.append(tipoServicio);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Jornada toEntityModel() {
		JornadaImpl jornadaImpl = new JornadaImpl();

		if (uuid == null) {
			jornadaImpl.setUuid("");
		}
		else {
			jornadaImpl.setUuid(uuid);
		}

		jornadaImpl.setJornadaId(jornadaId);
		jornadaImpl.setGroupId(groupId);
		jornadaImpl.setCompanyId(companyId);
		jornadaImpl.setUserId(userId);

		if (userName == null) {
			jornadaImpl.setUserName("");
		}
		else {
			jornadaImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			jornadaImpl.setCreateDate(null);
		}
		else {
			jornadaImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			jornadaImpl.setModifiedDate(null);
		}
		else {
			jornadaImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (fechaFinalizacion == Long.MIN_VALUE) {
			jornadaImpl.setFechaFinalizacion(null);
		}
		else {
			jornadaImpl.setFechaFinalizacion(new Date(fechaFinalizacion));
		}

		jornadaImpl.setLatitud(latitud);
		jornadaImpl.setLonguitud(longuitud);
		jornadaImpl.setHorasAsignadas(horasAsignadas);
		jornadaImpl.setTipoServicio(tipoServicio);

		jornadaImpl.resetOriginalValues();

		return jornadaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		jornadaId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		fechaFinalizacion = objectInput.readLong();

		latitud = objectInput.readLong();

		longuitud = objectInput.readLong();

		horasAsignadas = objectInput.readLong();

		tipoServicio = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(jornadaId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(fechaFinalizacion);

		objectOutput.writeLong(latitud);

		objectOutput.writeLong(longuitud);

		objectOutput.writeLong(horasAsignadas);

		objectOutput.writeLong(tipoServicio);
	}

	public String uuid;
	public long jornadaId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long fechaFinalizacion;
	public long latitud;
	public long longuitud;
	public long horasAsignadas;
	public long tipoServicio;
}