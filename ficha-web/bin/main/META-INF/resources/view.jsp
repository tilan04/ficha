<%@ include file="/init.jsp"%>
<c:choose>
	<c:when test="${rol ne 'guest' }">
		<div class="btn-group" role="group" aria-label="Menu">
			<portlet:renderURL var="jspAddJornada">
				<portlet:param name="mvcRenderCommandName" value="/addJornada" />
			</portlet:renderURL>
			<a class="btn btn-outline-primary" role="button"
				href="${jspAddJornada}">Fichaje</a>
			<portlet:renderURL var="jspListJornada">
				<portlet:param name="mvcRenderCommandName" value="/listJornada" />
			</portlet:renderURL>
			<a class="btn btn-outline-primary" role="button"
				href="${jspListJornada}">Historial</a>
		</div>
	</c:when>
	<c:otherwise>
		<div class="aviso">
			<div class="alert alert-warning alert-dismissible fade show"
				role="alert">
				<p>
					<strong>Sin acceso a esta funcionalidad.</strong>
				</p>
				<ul>
					<li>Accede con tu usuario y contraseña.</li>
					<li>En caso de no tener credenciales contacta con un
						administrador.</li>
				</ul>
				<button type="button" class="close" data-dismiss="alert"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
		</div>
	</c:otherwise>
</c:choose>