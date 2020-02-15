
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false"  %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous"></head>
<body>
<%@include file="navbar.jsp"%>
<c:url var="userUrl" value="/user/save"></c:url>
<form:form action="${userUrl}" class="jumbotron jumboron-fluid bg-dark text-light" modelAttribute="user">
	<table>
		<c:if test="${!empty user.name }">
	<tr>
	<td><form:label path="id">Id</form:label></td>
			<td><form:input path="id" readonly="true" disabled="true"/>
			<form:hidden path="id"/></td>
	</tr>
	</c:if>
		<tr>
		<div class="form-group">
			<td><form:label path="name">User Name</form:label></td>
			<td><form:input class="form-control" path="name"/></td>
			</div>
		</tr>
		<tr>
			<div class="form-group">
			<td><form:label path="password">Password</form:label></td>
			<td><form:input class="form-control" path="password"/></td>
			</div>
		</tr>
		<tr>
		<div class="form-group">
			<td><form:label path="email">EmailId</form:label></td>
			<td><form:input class="form-control" path="email"/></td>
			</div>
		</tr>
		<tr>
		<div class="form-group">
			<td><form:label path="enabled">Enabled</form:label></td>
			<td><form:input class="form-control" path="enabled"/></td>
		</div>
		</tr>
		<tr>
			<td></td>
			<td>
			<c:if test="${empty user.name}">
			<input type="Submit" value="Register"/>
			</c:if>
			<c:if test="${!empty user.name}">
			<input type="Submit" value="Update"/>
			</c:if>
			</td>
		</tr>
	</table>
</form:form>
<br/>
<hr>
<table class="table table-dark">
 <tr>
<th>Id</th>
<th>User Name</th>
<th>Password</th>
<th>Email</th>
<th>Enabled</th>

<th>Actions</th>
</tr>
<c:forEach var="user" items="${userlist}"> 
<tr>
<td>${user.id }</th>
<td>${user.name }</td>
<td>${user.password}</td>
<td>${user.email }</td>
<td>${user.enabled }</td>
<td><a href= "<c:url value='/removeuser/${user.id }'/> ">Delete</a> |
	<a href= "<c:url value='/updateuser/${user.id }'/> ">Update</a>
</td>
</tr>
</c:forEach>
</table>
</body>
<%@include file="footer.jsp"%>
</html>