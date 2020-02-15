<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>


	
</head>
<body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

	<%@include file="header.jsp"%>

	<div id="demo" class="carousel slide" data-ride="carousel">
			<!-- Indicators -->
			<ul class="carousel-indicators">
				<li data-target="#demo" data-slide-to="0" class="active"></li>
				<li data-target="#demo" data-slide-to="1"></li>
				<li data-target="#demo" data-slide-to="2"></li>
			</ul>
			<div class="carousel-inner">
				<div class="carousel-item active">
					<img src="/resources/ec.png" alt="img1" width="750" height="500">
				</div>
				<div class="carousel-item">
					<img src="/resources/ec1.jpg" alt="img2" width="750" height="500">
				</div>
				<div class="carousel-item">
					<img src="/resources/ec2.png" alt="img2" width="750" height="500">
				</div>
			</div>
			<!-- Left and right controls -->
			<a class="carousel-control-prev" href="#demo" data-slide="prev">
				<span class="carousel-control-prev-icon"></span>
			</a> <a class="carousel-control-next" href="#demo" data-slide="next">
				<span class="carousel-control-next-icon"></span>
			</a>
		</div>
		<div class=row>
			<c:forEach var="product" items="${productlist }">

				<div class="col-lg-3">
					<div class="box-part text-center border border-rounded">
						product name:
						<h4>${product.productname }</h2>
							price:
							<h5>${product.price }</h3>
								<input type="submit" value="add to cart" /> <input type="submit"
									value="add to wishlist" /> <input type="submit"
									value="view product" />
					</div>
				</div>


			</c:forEach>
		</div>
	</div>

</body>
<%@include file="footer.jsp"%>
</html>
