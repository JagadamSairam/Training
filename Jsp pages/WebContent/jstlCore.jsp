<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="header.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:out value="Hello World"/>
<br />

<c:set var="name" value="JagadamSairam"/>
<c:out value="${name}"/>

<c:forEach var="i" begin="1" end="10" step="1">
<h2>${i}</h2>
</c:forEach>


<c:forEach var="j" items="2,3,4,5,6,33,44,55,66,44">
<h2>${j}</h2>
</c:forEach>
<%-- <c:remove var="name"/> --%>

<c:catch var="xception">
   <% int num = 10/0; %>
</c:catch>
The Exception is : ${xception} 

<br>
<%-- <c:import var="displayfile" url="login.jsp">
</c:import>
<c:out value="${displayfile}"/> --%>
<br>
<c:set var="count" value="100"/>
<c:if test="${count == 100}">
   <c:out value="The count is 100"/>
   
   <c:redirect url="login.jsp"/>
</c:if>
</body>
</html>