<%@include file="header.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String us=request.getParameter("user");
String ps= request.getParameter("pass");
%>
<br>
<%
out.println(us);
%>
<br>
<%
out.println(ps);
%>

<%if(us.equals("Sairam")){
response.sendRedirect("http://www.khitguntur.com");
}
else{
	out.println("Please check ur user name");
}
%>

</body>
</html>