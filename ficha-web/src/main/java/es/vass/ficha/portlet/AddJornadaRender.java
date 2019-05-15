package es.vass.ficha.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
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
	       "mvc.command.name=/addJornada"
	    },
	    service = MVCRenderCommand.class
	)

public class AddJornadaRender implements MVCRenderCommand {		
	
	public String render (RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		final ThemeDisplay td = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		final Jornada jornada = JornadaLocalServiceUtil.findLastByUserId(td.getUserId());
		final List<tipoServicio> tiposServicioForm = tipoServicioLocalServiceUtil.gettipoServicios(0, Integer.MAX_VALUE);
		renderRequest.setAttribute("tiposServicioForm", tiposServicioForm);
		
		if (jornada != null) {
			if (jornada.getFechaFinalizacion() == null) {
				renderRequest.setAttribute("finalizar", 1);
				renderRequest.setAttribute("jornadaId", jornada.getJornadaId());
			} else { 			
				renderRequest.setAttribute("finalizar", null);
			}
		} else { 			
			renderRequest.setAttribute("finalizar", null);
		}
		return "/addJornada.jsp";
	}
}
