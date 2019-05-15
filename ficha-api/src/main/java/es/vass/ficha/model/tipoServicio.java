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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the tipoServicio service. Represents a row in the &quot;FICHA_tipoServicio&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see tipoServicioModel
 * @see es.vass.ficha.model.impl.tipoServicioImpl
 * @see es.vass.ficha.model.impl.tipoServicioModelImpl
 * @generated
 */
@ImplementationClassName("es.vass.ficha.model.impl.tipoServicioImpl")
@ProviderType
public interface tipoServicio extends tipoServicioModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link es.vass.ficha.model.impl.tipoServicioImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<tipoServicio, Long> ID_TIPO_SERVICIO_ACCESSOR = new Accessor<tipoServicio, Long>() {
			@Override
			public Long get(tipoServicio tipoServicio) {
				return tipoServicio.getIdTipoServicio();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<tipoServicio> getTypeClass() {
				return tipoServicio.class;
			}
		};
}