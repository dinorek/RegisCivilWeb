<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../templates/header.jsp"></jsp:include>
<main class="container mt-6">
	<c:if test="${mensaje != null}">
		<div class="columns is-centered mb-6">
			<div class="column is-6">
				<div class="notification is-primary">
					<p>${mensaje}</p>
				</div>
			</div>
		</div>
	</c:if>
	<c:if test="${errores != null}">
		<div class="columns is-centered mb-6">
			<div class="column is-6">
				<div class="notification is-warning">
					<h6>Existen errores en el formulario</h6>
					<div class="content">
					<ul>
							<c:forEach var="error" items="${errores}">
								<li>${error}</li>
							</c:forEach>
						</ul>
					</div>
				</div>
			</div>
			</div>
			</c:if>
			<div class="columns is-centered">
				<div class="column is-6">
					<form method="POST" action="IngresarSolicitudController.do">
						<div class="card">
							<div class="card-header has-background-info">
								<span class="card-header-title text is-centered  has-text-white">Ingreso
									Solicitud</span>
							</div>
							<div class="card-content">
								<div class="field">
									<label class="label" for="rut-txt">Rut de Cliente</label>
									<div class="control">
										<input type="text" class="input" id="rut-txt" name="rut-txt" />
									</div>
								</div>
							</div>
							<div class="card-content">
								<div class="field">
									<label class="label" for="nombre-txt">Nombre del
										Cliente</label>
									<div class="control">
										<input type="text" class="input" id="nombre-txt"
											name="nombre-txt" />
									</div>
								</div>
							</div>
							<div class="card-content">
								<div class="field">
									<label class="label" for="tipo-select">Tipo de
										Solicitud</label>
									<div class="control">
										<div class="select">
											<select name="tipo-select" id="tipo-select">
												<option>Solicitud de C�dula de Identidad</option>
												<option>Retiro de C�dula de Identidad</option>
												<option>Solicitud de Certificado de Nacimiento</option>
												<option>Solicitud de Certificado de Defunci�n</option>

											</select>
										</div>
									</div>
								</div>
							</div>
							<div class="card-footer has-text-centered">
								<div class="card-footer-item">
									<button type="submit" class="button is-success">Ingresar
										Solicitud</button>
								</div>
							</div>
						</div>

					</form>
				</div>
			</div>
</main>

</body>
</html>