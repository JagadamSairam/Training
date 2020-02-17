<%-- <%@ include file="header.jsp" %>
Welcome Admin
</body>
</html> --%>

<%-- <%@ include file="header.jsp" %>
 --%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="true"  %>
<html>
<body>
<h1> Name : ${name }</h1>
<h2> Description :${description }</h2>

<c:if test="${pageContext.request.userPrincipal.name != null }">

<h2> Welcome : ${user } | <a href="<c:url value ='j_spring_security_logout' />">Logout</a>   </h2>



</c:if>

</body>


</html>