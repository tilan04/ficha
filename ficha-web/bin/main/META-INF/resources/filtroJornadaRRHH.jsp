<%@ include file="/init.jsp"%>
<div class="row">
	<div class="col-md-8" style="margin-top: 2.2rem;">
		<jsp:useBean id="jornadas"
			type="java.util.List<es.vass.ficha.model.Jornada>" scope="request" />
		<liferay-ui:search-container
			emptyResultsMessage="No se ha encontrado ninguna jornada.">
			<liferay-ui:search-container-results results="${jornadas}" />
			<liferay-ui:search-container-row
				className="es.vass.horas.model.Jornada" modelVar="jornada">
				<liferay-ui:search-container-column-text name="Inicio"
					property="createDate" />
				<liferay-ui:search-container-column-text name="Fin"
					property="fechaFinalizacion" />
				<c:forEach items="${tipoServicios}" var="tipoServicio">
					<c:if test="${tipoServicio.idTipoServicio == jornada.tipoServicio}">
						<liferay-ui:search-container-column-text name="Tipo de Servicio"
							value="${tipoServicio.nombreTipoServicio}" />
					</c:if>
				</c:forEach>
				<liferay-ui:search-container-column-text name="Opciones">
					<portlet:renderURL var="jspEditarJornada">
						<portlet:param name="mvcRenderCommandName" value="/editJornada" />
						<portlet:param name="jornadaId" value="${jornada.jornadaId}" />
					</portlet:renderURL>
					<aui:button value="Editar" type="submit"
						onclick="location.href = '${jspEditarJornada}'" />
				</liferay-ui:search-container-column-text>
			</liferay-ui:search-container-row>
			<liferay-ui:search-iterator />
		</liferay-ui:search-container>
	</div>
	<div class="col-md-4" style="margin-top: 2.2rem;"></div>
</div>
