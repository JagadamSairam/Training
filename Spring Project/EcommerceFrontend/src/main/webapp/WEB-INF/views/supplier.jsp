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
	<%@include file="navbar.jsp"%>
	<c:url var="supplierUrl" value="/supplier/save"></c:url>
	<form:form action="${supplierUrl}" class="jumbotron jumboron-fluid bg-dark text-light" modelAttribute="supplier">
		<table>
			<c:if test="${!empty supplier.suppliername }">
				<tr>
					<td><form:label path="id">Id</form:label></td>
					<td><form:input path="id" readonly="true" disabled="true" /> <form:hidden
							path="id" /></td>
				</tr>
			</c:if>
			<tr>
			<div class="form-group">
				<td><form:label path="suppliername">User Name</form:label></td>
				<td><form:input class="form-control" path="suppliername" /></td>
				</div>
			</tr>
			<td></td>
			<td><c:if test="${empty supplier.suppliername}">
					<input type="Submit" value="Register" />
				</c:if> <c:if test="${!empty supplier.suppliername}">
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
			<th>User Name</th>
			<th>Actions</th>
		</tr>
		<c:forEach var="supplier" items="${supplierlist}">
			<tr>
				<td>${supplier.id }
				</td>
				<td>${supplier.suppliername }</td>
				<td><a href="<c:url value='/removesupplier/${supplier.id }'/> ">Delete</a>
					| <a href="<c:url value='/updatesupplier/${supplier.id }'/> ">Update</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
<%@include file="footer.jsp"%>
</html>