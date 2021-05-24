<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../templates/header.jsp"></jsp:include>
<main class="container mt-6">
	<div class="columns is-centered">
		<div class="column is-8">
			<table class="table is-hovered is-bordered is-fullwidth">
				<thead class="has-background-info ">
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
				<td></td>
				<td>${solicitud.nombre}</td>
				<td>${solicitud.tipoSolicitud}</td>
				<td>
				<a href="AtenderSolicitudesController.do?nombreEliminar=${solicitud.nombre}" 
				class="has-text-danger">Atender</a>
				
				</td>
				</tr>
				</c:forEach>
				</tbody>
			</table>

		</div>
	</div>
</main>

<body>
<html>