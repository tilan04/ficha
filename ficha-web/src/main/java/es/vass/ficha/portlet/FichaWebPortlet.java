package es.vass.ficha.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import es.vass.ficha.constants.FichaWebPortletKeys;
import es.vass.ficha.model.Jornada;
import es.vass.ficha.model.tipoServicio;
import es.vass.ficha.service.JornadaLocalServiceUtil;
import es.vass.ficha.service.tipoServicioLocalServiceUtil;

/**
 * @author Edgar
 */
@Component(
		immediate = true,
		property = {
				"com.liferay.portlet.display-category=category.sample",
				"com.liferay.portlet.instanceable=true",
				"javax.portlet.init-param.template-path=/",
				"javax.portlet.init-param.view-template=/view.jsp",
				"javax.portlet.name=" + FichaWebPortletKeys.FichaWeb,
				"javax.portlet.resource-bundle=content.Language",
				"javax.portlet.security-role-ref=power-user,user"
		},
		service = Portlet.class
		)
public class FichaWebPortlet extends MVCPortlet {

	public void render(RenderRequest request, RenderResponse response) throws IOException, PortletException {
		final ThemeDisplay td = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		if (!onlyForYourEyes(td.getUser()).isEmpty()) {
			request.setAttribute("rol", onlyForYourEyes(td.getUser()));
		} 
		super.render(request, response);
	}

	public String onlyForYourEyes(User user) {
		List<Role> roles = user.getRoles();
		String rol = null;

		for (Role r : roles) {
			if(r.getRoleId() == 70452) {
				rol = "rrhh";
			}
			else if(r.getRoleId() == 70453) {
				rol = "empleado";
			} 
			else if(r.getRoleId() == 20105) {
				rol = "admin";
			}
			else if(r.getRoleId() == 20106) {
				rol = "guest";
			}
		}
		return rol;
	}


	@ProcessAction(name = "addJornada")
	public void addJornada(ActionRequest request, ActionResponse response) {
		final ThemeDisplay td = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		final long tipoServicio = ParamUtil.getLong(request, "tipoServicio");
		JornadaLocalServiceUtil.addJornada(td.getCompanyGroupId(), td.getCompanyId(), td.getUserId(), td.getUser().getFullName(), tipoServicio);
	}

	@ProcessAction(name = "stopJornada")
	public void stopJornada(ActionRequest request, ActionResponse response) throws PortalException {

		final Long jornadaId = Long.parseLong(request.getParameter("jornadaId"));
		final Date fechaFinalizacion = new Date();
		final Jornada jornada = JornadaLocalServiceUtil.getJornada(jornadaId);

		jornada.setFechaFinalizacion(fechaFinalizacion);    	
		JornadaLocalServiceUtil.updateJornada(jornada);
	}

	@ProcessAction(name = "filtrarJornadaUsuario")
	public void filtrarJornadaUsuario(ActionRequest request, ActionResponse response) throws PortalException {

		//SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		final ThemeDisplay td = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		final Date createDate = ParamUtil.getDate(request, "createDate", null);
		System.out.println(createDate);
		final List<Jornada> jornadas = JornadaLocalServiceUtil.findByUserIdAndDate(td.getUserId(), createDate);
		final List<tipoServicio> tipoServicios = tipoServicioLocalServiceUtil.gettipoServicios(0, Integer.MAX_VALUE);
		request.setAttribute("jornadas", jornadas);
		request.setAttribute("tipoServicios", tipoServicios);

		response.setRenderParameter("jspPage", "/META-INF/resources/filtroJornadaUsuario.jsp");


	}

	@ProcessAction(name = "filtrarJornadaRRHH")
	public void filtrarJornadaRRHH(ActionRequest request, ActionResponse response) throws PortalException {

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		final long userId = ParamUtil.getLong(request, "usuario");
		final Date createDate = ParamUtil.getDate(request, "createDate", format);
		final List<Jornada> jornadas = JornadaLocalServiceUtil.findByUserIdAndDate(userId, createDate);
		final List<tipoServicio> tipoServicios = tipoServicioLocalServiceUtil.gettipoServicios(0, Integer.MAX_VALUE);
		request.setAttribute("jornadas", jornadas);
		request.setAttribute("tipoServicios", tipoServicios);

		response.setRenderParameter("jspPage", "/META-INF/resources/filtroJornadaRRHH.jsp");


	}

	@ProcessAction(name ="editarJornada")
	public void editarJornada(ActionRequest request, ActionResponse response) throws PortalException {
		final Date createDate = ParamUtil.getDate(request, "createDate", null);
		final Date fechaFinalizacion = ParamUtil.getDate(request, "fechaFinalizacion", null);
		final long tipoServicio = ParamUtil.getLong(request, "tipoServicio");
		final long jornadaId = ParamUtil.getLong(request, "jornadaId");

		final Jornada jornada = JornadaLocalServiceUtil.getJornada(jornadaId);
		jornada.setCreateDate(createDate);
		jornada.setFechaFinalizacion(fechaFinalizacion);
		jornada.setTipoServicio(tipoServicio);

		JornadaLocalServiceUtil.updateJornada(jornada);

	}

}