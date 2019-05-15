package es.vass.ficha.portlet;

import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;

import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import es.vass.ficha.constants.FichaWebPortletKeys;
import es.vass.ficha.model.Jornada;
import es.vass.ficha.model.tipoServicio;
import es.vass.ficha.service.JornadaLocalServiceUtil;
import es.vass.ficha.service.tipoServicioLocalServiceUtil;


@Component(
	    immediate = true,
	    property = {
	       "javax.portlet.name=" + FichaWebPortletKeys.FichaWeb,
	       "mvc.command.name=/listJornada"
	    },
	    service = MVCRenderCommand.class
	)

public class ListJornadaRender implements MVCRenderCommand {
	

	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		final ThemeDisplay td = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		final List<Jornada> jornadas = JornadaLocalServiceUtil.findByUserIdAndDateForUsers(td.getUserId());
		final List<tipoServicio> tipoServicios = tipoServicioLocalServiceUtil.gettipoServicios(0, Integer.MAX_VALUE);
		List<User> usuarios = UserLocalServiceUtil.getUserGroupUsers(70408);
		final double horasAsignadas = 8;
		double horasComputadas = JornadaLocalServiceUtil.calculoHorasTrabajadas(jornadas);
		double horasExtra = horasComputadas - horasAsignadas;
		
		if (horasExtra < 0) {
			horasExtra = 0;
		}
		
		renderRequest.setAttribute("jornadas", jornadas);
		renderRequest.setAttribute("tipoServicios", tipoServicios);
		renderRequest.setAttribute("usuarios", usuarios);
		renderRequest.setAttribute("horasComputadas", String.format("%.2f", horasComputadas));
		renderRequest.setAttribute("horasAsignadas", String.format("%.2f", horasAsignadas));
		renderRequest.setAttribute("horasExtra", String.format("%.2f", horasExtra));
		return "/listJornada.jsp";
	}
	

}
