<%@ include file="/init.jsp"%>
<div class="row" style="margin-top: 2.2rem;">
	<div class="col-md-6">
		<portlet:actionURL name="editarJornada" var="editarJornadaUrl" />
		<aui:form action="${editarJornadaUrl}">
		<aui:input name="jornadaId" type="hidden"
				value="${jornada.jornadaId}"
				label="jornadaId" />
			<aui:input name="createDate" type="text"
				value="${jornada.createDate}"
				label="Escribe aquí la fecha de inicio:" />
			<aui:input name="fechaFinalizacion" type="text"
				value="${jornada.fechaFinalizacion}"
				label="Escribe aquí la fecha de fin:" />
			<aui:select name="tipoServicio"
				label="Selecciona el tipo de servicio:">
				<c:forEach items="${tiposServicioForm}" var="tipoServicioForm">
					<c:choose>
						<c:when
							test="${tipoServicioForm.idTipoServicio == jornada.tipoServicio}">
							<aui:option value="${tipoServicioForm.idTipoServicio}" selected="<%=true%>">${tipoServicioForm.nombreTipoServicio} </aui:option>
						</c:when>

						<c:otherwise>
							<aui:option value="${tipoServicioForm.idTipoServicio}">${tipoServicioForm.nombreTipoServicio}</aui:option>
						</c:otherwise>
					</c:choose>

				</c:forEach>
			</aui:select>
			<aui:button name="editarJornadaButton" type="submit"
				value="Editar jornada" />
		</aui:form>
	</div>
	<div class="col-md-6"></div>
</div>