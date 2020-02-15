<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
    crossorigin="anonymous">

</head>
<body>
	<%@include file="navbar.jsp"%>

	<div class="container">
		
	<hr />

	<div class=row>
			<c:forEach var="product" items="${productlist }">

				<div class="col-lg-3">
					<div class="box-part text-center border border-rounded">
						product name:<h4>${product.productname }</h2>
						price:<h5>${product.price }</h3>
						<input type="submit" value="add to cart"/>
						<input type="submit" value="add to wishlist"/>
						<input type="submit" value="view product"/>
					</div>
				</div>


			</c:forEach>
		</div>
	</div>
	

</body>
<%@include file="footer.jsp"%>
</html>
