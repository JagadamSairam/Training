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
	<c:url var="productUrl" value="/product/save"></c:url>
	<form:form action="${productUrl}" class="jumbotron jumboron-fluid bg-dark text-light" modelAttribute="product">
		<table>
			<c:if test="${!empty product.productname }">
				<tr>
					<td><form:label path="id">Id</form:label></td>
					<td><form:input path="id" readonly="true" disabled="true" /> <form:hidden
							path="id" /></td>
				</tr>
			</c:if>
			<tr>
			<div class="form-group">
				<td><form:label path="productname">Product  Name</form:label></td>
				<td><form:input class="form-control" path="productname" /></td>
				</div>
			</tr>
			<tr>
			<div class="form-group">
				<td><form:label path="price">price</form:label></td>
				<td><form:input class="form-control" path="price" /></td>
				</div>
			</tr>
			<tr>
				<td></td>
				<td><c:if test="${empty product.productname}">
						<input type="Submit" value="Register" />
					</c:if> <c:if test="${!empty product.productname}">
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
			<th>Product Name</th>
			<th>Price</th>
			<th>Actions</th>
		</tr>
		<c:forEach var="product" items="${productlist}">
			<tr>
				<td>${product.id }</td>
				<td>${product.productname }</td>
				<td>${product.price}</td>

				<td><a href="<c:url value='/removeproduct/${product.id }'/> ">Delete</a>
					| <a href="<c:url value='/updateproduct/${product.id }'/> ">Update</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
<%@include file="footer.jsp"%>
</html>