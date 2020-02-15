<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
</head>
<body>
<%@include file="navbar.jsp" %>
	<c:url var="catUrl" value="/cat/save"></c:url>
	<form:form action="${catUrl}"  class="jumbotron jumboron-fluid bg-dark text-light" modelAttribute="cat">
		<table>
			<c:if test="${!empty cat.type}">
				<tr>
					<td><form:label path="id">Id</form:label></td>
					<td><form:input path="id" readonly="true" disabled="true" /> <form:hidden
							path="id" /></td>
				</tr>
			</c:if>
			<tr>
			
			<div class="form-group">
				<td><form:label path="type" class="form-control">Category Type</form:label></td>
			
				<td><form:input path="type" /></td>
			</div>
			</tr>
			
			<td></td>
			<td><c:if test="${empty cat.type}">
					<input type="Submit" value="Register" />
				</c:if> <c:if test="${!empty cat.type}">
					<input type="Submit" value="Update" />
				</c:if></td>
			</tr>
		</table>
	</form:form>
	<br />
	<hr>
	<table class="table table-dark">
		<tr>
			<th>Id</th>
			<th>Category Type</th>
			<th>Actions</th>
		</tr>
		<c:forEach var="supplier" items="${catlist}">
			<tr>
				<td>${cat.id }</td>
				<td>${cat.type }</td>
				<td><a href="<c:url value='/removecat/${cat.id }'/> ">Delete</a>
					| <a href="<c:url value='/updatecat/${cat.id }'/> ">Update</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
<%@include file="footer.jsp" %>
</html>