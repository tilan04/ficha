package es.vass.ficha.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

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
	       "mvc.command.name=/editJornada"
	    },
	    service = MVCRenderCommand.class
	)

public class EditJornadaRender implements MVCRenderCommand {		
	
	public String render (RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		final Long jornadaId = Long.parseLong(renderRequest.getParameter("jornadaId"));
		try {
			final Jornada jornada = JornadaLocalServiceUtil.getJornada(jornadaId);
			final List<tipoServicio> tiposServicioForm = tipoServicioLocalServiceUtil.gettipoServicios(0, Integer.MAX_VALUE);
			renderRequest.setAttribute("tiposServicioForm", tiposServicioForm);
			renderRequest.setAttribute("jornada", jornada);
			System.out.println(jornada);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "/editJornada.jsp";
	}
}
