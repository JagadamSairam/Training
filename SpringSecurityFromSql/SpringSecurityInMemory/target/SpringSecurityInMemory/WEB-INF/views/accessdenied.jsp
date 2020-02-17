<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>AccessDenied</h1>

<c:choose>
<c:when test="${empty username }">
<h2>You are not authorised to access this page</h2>
</c:when>
<c:otherwise>
<h2>UserName : ${username } <br/>

You Do not have the access for this page </h2>
</c:otherwise>
</c:choose>
</body>
</html>