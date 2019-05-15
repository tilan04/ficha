<%@ include file="/init.jsp"%>

<div class="row">
	<div class="col-md-4">
		<c:if test="${rol == 'empleado'}">
			<div class="filtroUsuario" style="margin-top: 2.2rem;">
				<portlet:actionURL name="filtrarJornadaUsuario"
					var="filtrarJornadaUsuarioUrl" />
				<aui:form action="${filtrarJornadaUsuarioUrl}">
					<aui:input name="createDate" type="date"
						label="Escribe aquí la fecha deseada:" />
					<aui:button name="filtroJornadaUsuarioButton" type="submit"
						value="Buscar jornada(s)" />
				</aui:form>
			</div>
		</c:if>
		<c:if test="${rol == 'rrhh'}">
			<div class="filtroRRHH" style="margin-top: 2.2rem;">
				<portlet:actionURL name="filtrarJornadaRRHH"
					var="filtrarJornadaRRHHUrl" />
				<aui:form action="${filtrarJornadaRRHHUrl}">
					<aui:select name="usuario"
						label="Selecciona el usuario por el que quieras buscar:">
						<c:forEach items="${usuarios}" var="usuario">
							<aui:option value="${usuario.userId}">${usuario.firstName} ${usuario.lastName}</aui:option>
						</c:forEach>
					</aui:select>
					<aui:input name="createDate" type="date"
						label="Escribe aquí la fecha deseada:" />
					<aui:button name="filtroJornadaRRHHButton" type="submit"
						value="Buscar jornada(s)" />
				</aui:form>
			</div>
		</c:if>
	</div>
	<c:if test="${rol == 'empleado'}">
		<div class="col-md-8" style="margin-top: 2.2rem;">
		<h3>Resumen de la jornada:</h3>
		<br> <b>Horas computadas:</b>
		<c:out value="${horasComputadas}" />
		<br><b>Horas asignadas:</b>
		<c:out value="${horasAsignadas}" />
		<br><b>Horas extra:</b>
		<c:out value="${horasExtra}" />
		<div class="historial" style="margin-top: 2.2rem;">
		<h3>Historial de servicios de la jornada:</h3>
			<jsp:useBean id="jornadas"
				type="java.util.List<es.vass.ficha.model.Jornada>" scope="request" />
			<liferay-ui:search-container
				emptyResultsMessage="No has realizado ninguna jornada.">
				<liferay-ui:search-container-results results="${jornadas}" />
				<liferay-ui:search-container-row
					className="es.vass.horas.model.Jornada" modelVar="jornada">
					<liferay-ui:search-container-column-text name="Inicio"
						property="createDate" />
					<liferay-ui:search-container-column-text name="Fin"
						property="fechaFinalizacion" />
					<c:forEach items="${tipoServicios}" var="tipoServicio">
						<c:if
							test="${tipoServicio.idTipoServicio == jornada.tipoServicio}">
							<liferay-ui:search-container-column-text name="Tipo de Servicio"
								value="${tipoServicio.nombreTipoServicio}" />
						</c:if>
					</c:forEach>
				</liferay-ui:search-container-row>
				<liferay-ui:search-iterator />
			</liferay-ui:search-container>
			</div>
		</div>
	</c:if>
</div>
