<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../templates/header.jsp"></jsp:include>
<main class="container mt-6">
	<div class="columns is-centered">
	<div class="card-content">
								<div class="field">
									<label class="label" for="tipo-select">Tipo de
										Solicitud</label>
									<div class="control">
										<div class="select">
											<select name="tipo-select" id="tipo-select">
												<option value="1">Solicitud de Cédula de Identidad</option>
												<option value="2">Retiro de Cédula de Identidad</option>
												<option value="3">Solicitud de Certificado de Nacimiento</option>
												<option value="4">Solicitud de Certificado de Defunción</option>
											</select>
										</div>
									</div>
								</div>
							</div>	
							<div class="card-footer has-text-centered">
								<div class="card-footer-item">
									<button type="submit" class="button is-success">Filtrar</button>
								</div>
							</div>
						</div>
	
		<div class="column is-8">		
			<table class="table is-hovered is-bordered is-fullwidth">
				<thead class="has-background-primary">
					<tr>
						<th class= "has-text-white">Nro de Atencion</th>
						<th class= "has-text-white">Nombre del Cliente</th>
						<th class= "has-text-white">Tipo de Solicitud</th>
						<th class= "has-text-white">Botón Atender</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach var="solicitud" items="${solicitudes}">
				<tr>
				<td>${solicitud.nSolicitud}</td>
				<td>${solicitud.nombre}</td>
				<td>${solicitud.tipoSolicitud}</td>
				<td>
				<a href="AtenderSolicitudesController.do?nombreEliminar=${solicitud.nombre}" 
				class="has-text-primary">Atender</a>
				
				</td>
				</tr>
				</c:forEach>
				</tbody>
			</table>

		</div>
	
</main>

<body>
<html>