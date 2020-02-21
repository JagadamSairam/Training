<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Welcome!! user</h3>
<h2>Your password is:</h2>
<span>${pwd}</span>

<h1>${usr}</h1>

<form action="register" method="post">
<input type="text" name="username"><br><br>
<input type="password" name="password"><br><br>
<input type="submit" value="Login">
</form>
<a href="/logout">Logout..</a>
</body>
</html>