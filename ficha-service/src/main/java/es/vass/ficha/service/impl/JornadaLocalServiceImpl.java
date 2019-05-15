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

package es.vass.ficha.service.impl;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import es.vass.ficha.exception.NoSuchJornadaException;
import es.vass.ficha.model.Jornada;
import es.vass.ficha.model.impl.JornadaImpl;
import es.vass.ficha.service.base.JornadaLocalServiceBaseImpl;
import es.vass.ficha.service.persistence.JornadaUtil;

/**
 * The implementation of the jornada local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link es.vass.ficha.service.JornadaLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JornadaLocalServiceBaseImpl
 * @see es.vass.ficha.service.JornadaLocalServiceUtil
 */
public class JornadaLocalServiceImpl extends JornadaLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link es.vass.ficha.service.JornadaLocalServiceUtil} to access the jornada local service.
	 */

	public void addJornada (long groupId, long companyId, long userId, String userName, long tipoServicio) {

		final Jornada jornada = new JornadaImpl();
		jornada.setJornadaId(counterLocalService.increment());
		jornada.setGroupId(groupId);
		jornada.setCompanyId(companyId);
		jornada.setUserId(userId);
		jornada.setCreateDate(new Date ());
		jornada.setUserName(userName);
		jornada.setFechaFinalizacion(null);
		jornada.setHorasAsignadas(8);
		jornada.setTipoServicio(tipoServicio);

		addJornada(jornada);

	}

	public List<Jornada> findByUserId (long userId) {
		return JornadaUtil.findByUsuario(userId);		
	}
	
	public List<Jornada> findByUserIdAndDate (long userId, Date createDate) {
		
		System.out.println(createDate);
		
		Calendar ahora = Calendar.getInstance();
		ahora.setTime(createDate);
		ahora.set(Calendar.HOUR, 0);
		ahora.set(Calendar.MINUTE, 0);
		ahora.set(Calendar.SECOND, 0);
		ahora.set(Calendar.HOUR_OF_DAY, 0);
		Date hoy = ahora.getTime();
		
		ahora.set(Calendar.HOUR, 23);
		ahora.set(Calendar.MINUTE, 59);
		ahora.set(Calendar.SECOND, 59);
		Date finalDia = ahora.getTime();
		
		
        DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Jornada.class, JornadaImpl.class.getClassLoader());
        dynamicQuery.add(PropertyFactoryUtil.forName("userId").like(userId));
        dynamicQuery.add(PropertyFactoryUtil.forName("createDate").between(hoy, finalDia));
        List <Jornada> jornadas = JornadaUtil.findWithDynamicQuery(dynamicQuery);
       

		return jornadas;		
	}
	
	public List<Jornada> findByUserIdAndDateForUsers (long userId) {
		
		Calendar ahora = Calendar.getInstance();
		ahora.set(Calendar.HOUR, 0);
		ahora.set(Calendar.MINUTE, 0);
		ahora.set(Calendar.SECOND, 0);
		ahora.set(Calendar.HOUR_OF_DAY, 0);
		Date hoy = ahora.getTime();
		
		ahora.set(Calendar.HOUR, 23);
		ahora.set(Calendar.MINUTE, 59);
		ahora.set(Calendar.SECOND, 59);
		Date finalDia = ahora.getTime();
		
        DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Jornada.class, JornadaImpl.class.getClassLoader());
        dynamicQuery.add(PropertyFactoryUtil.forName("userId").like(userId));
        dynamicQuery.add(PropertyFactoryUtil.forName("createDate").between(hoy, finalDia));
        List <Jornada> jornadas = JornadaUtil.findWithDynamicQuery(dynamicQuery);
       

		return jornadas;		
	}

	public Jornada findLastByUserId (long userId) {
		try {

			return JornadaUtil.findByUsuario_Last(userId, null);

		} catch (NoSuchJornadaException e) {
			e.printStackTrace();
		}
		return null;

	}
	
	public double calculoHorasTrabajadas (List<Jornada> jornadas) {
		double horasComputadasSinTratar = 0;
		for (int i= 0; i <= (jornadas.size()-1); i++) {
			Date fechaCreacion = jornadas.get(i).getCreateDate();
			Date fechaFinalizacion = jornadas.get(i).getFechaFinalizacion();			
			double resta = fechaFinalizacion.getTime() - fechaCreacion.getTime();
			horasComputadasSinTratar += resta;
			if (i == (jornadas.size()-1)) {
				double horasComputadas = (horasComputadasSinTratar/(1000 * 60 * 60));
				return horasComputadas;
			}
		}
		return 0;
	}
}