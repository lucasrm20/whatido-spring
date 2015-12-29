<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="template" %>

<template:mainTemplate titulo="Nova Lista">

<!-- CORPO -->
<div class="container">
	
	<div class="col-md-8 col-md-offset-2">

		<div class="page-header">
			<h1>${lista.descricao }</h1>
		</div>
		
		<c:if test="${!empty mensagem}">
			<div class="alert alert-success alert-dismissible" role="alert">
				<button type="button" class="close" data-dismiss="alert" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				${mensagem }
			</div>
		</c:if>
	
		<!-- form principal -->
		
		<div class="espacamento-listagem">
			<table class="table table-bordered table-striped">
				<colgroup>
					<col class="col-md-7">
					<col class="col-md-1">
				</colgroup>
				<thead>
					<tr>
						<th>Descrição</th>
						<th>Remover</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${lista.tarefas}" var="tarefa">
						<tr>
							<td>${tarefa.descricao}</td>
							<td>
								<!-- form remocao -->
									<div class="text-center">
										<button type="submit" value="Remover" class="btn btn-warning btn-sm">
											<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
										</button>
									</div>
								<!-- form remocao -->
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		
	</div>
	
</div>

</template:mainTemplate>