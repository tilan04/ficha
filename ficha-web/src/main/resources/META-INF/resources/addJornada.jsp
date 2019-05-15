<%@ include file="/init.jsp"%>
<div class="row">
	<div class="col-md-6" style="margin-top: 2.2rem;">
		<c:choose>
			<c:when test="${empty finalizar}">
				<portlet:actionURL name="addJornada" var="addJornadaUrl" />
				<aui:form action="${addJornadaUrl}">
					<aui:select name="tipoServicio"
						label="Selecciona el tipo de servicio a realizar:">
						<c:forEach items="${tiposServicioForm}" var="tipoServicioForm">
							<aui:option value="${tipoServicioForm.idTipoServicio}">${tipoServicioForm.nombreTipoServicio}</aui:option>
						</c:forEach>
					</aui:select>
					<aui:button name="addJornadaButton" type="submit" value="Fichar" />
					<aui:button name="stopJornadaButton" type="submit" value="Detener"
						disabled="true" />
				</aui:form>
			</c:when>
			<c:otherwise>
				<portlet:actionURL name="stopJornada" var="stopJornadaUrl" />
				<aui:form action="${stopJornadaUrl}">
				<aui:input name="jornadaId" type="hidden"
				value="${jornadaId}"
				label="jornadaId" />
					<aui:select name="tipoServicio"
						label="Selecciona el tipo de servicio a realizar:">
						<c:forEach items="${tiposServicioForm}" var="tipoServicioForm">
							<aui:option value="${tipoServicioForm.idTipoServicio}">${tipoServicioForm.nombreTipoServicio}</aui:option>
						</c:forEach>
					</aui:select>
					<aui:button name="addJornadaButton" type="submit" value="Fichar"
						disabled="true" />
					<aui:button name="stopJornadaButton" type="submit" value="Detener" />
				</aui:form>
			</c:otherwise>
		</c:choose>
	</div>
</div>
