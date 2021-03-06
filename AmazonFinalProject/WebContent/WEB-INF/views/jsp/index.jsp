<%@
page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page session="false"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>eBooks</title>

<!-- Google Fonts -->
<link
	href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600'
	rel='stylesheet' type='text/css'>
<link
	href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300'
	rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Raleway:400,100'
	rel='stylesheet' type='text/css'>

<!-- Bootstrap -->
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">

<!-- Font Awesome -->
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">

<!-- Custom CSS -->
<link rel="stylesheet" href="css/owl.carousel.css">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/responsive.css">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>

	<div class="header-area">
		<div class="container">
			<div class="row">
				<div class="col-md-8">
					<div class="user-menu">
						<ul>

							<li><a href="addtocart"><i class="fa fa-user"></i> My
									Cart</a></li>
							<%
								if (((String) request.getSession().getAttribute("name")) == null) {
							%>
							<li><a href="login"><i class="fa fa-user"></i><span
									id="loginName"> Login</span></a></li>
							<%
								} else {
							%>
							<li><a href="profile"><i class="fa fa-user"></i> <%=request.getSession().getAttribute("name")%></a></li>
							<li><a href="logout"><i class="fa fa-user"></i> Logout </a></li>
							<%
								}
							%>

						</ul>

					</div>
				</div>

				<div class="col-md-4">
					<div class="header-right">
						<ul class="list-unstyled list-inline">
							
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- End header area -->

	<div class="site-branding-area">
		<div class="container">
			<div class="row">
				<div class="col-sm-6">
					<div class="logo">
						<h1>
							<a href="index">e<span>Books</span></a>
						</h1>
					</div>
				</div>
				<div class="col-sm-6">
					<form:form id="tfnewsearch" method="post" action="search"
						commandName="searchForm">
						<div id="search-drop-menu">
							<label> <form:select path="selectMenu">
									<form:option value="title" selected="selected">Title</form:option>
									<form:option value="author">Author</form:option>
									<form:option value="genre">Genre</form:option>

								</form:select>
							</label>
						</div>
						<div id="tfheader">

							<form:input type="text" class="tftextinput" path="userInput"
								name="q" size="21" maxlength="120" />
							<input type="submit" value="search" class="tfbutton"
								id="searchButton">

						</div>
					</form:form>
					<div class="shopping-item">
						<a href="addtocart">Cart - <span class="cart-amunt"><fmt:formatNumber
															type="number" maxIntegerDigits="2" value="${total}" /></span>
							<i class="fa fa-shopping-cart"></i> <span class="product-count">${cart.size()}</span></a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- End site branding area -->

	<div class="mainmenu-area">
		<div class="container">
			<div class="row">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target=".navbar-collapse">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
				</div>
				<div class="navbar-collapse collapse">
					<ul class="nav navbar-nav">
						<li class="active"><a href="index">Home</a></li>
						<li><a href="shop">Shop page</a></li>
						<li><a href="addtocart">Cart</a></li>
						<li><a href="service">Service</a></li>
						
					</ul>
				</div>
			</div>
		</div>
	</div>
	<!-- End mainmenu area -->

	<div class="slider-area" id="slider-area-hide">
		<div class="zigzag-bottom"></div>
		<div id="slide-list" class="carousel carousel-fade slide"
			data-ride="carousel">

			<div class="slide-bulletz">
				<div class="container">
					<div class="row">
						<div class="col-md-12">
							<ol class="carousel-indicators slide-indicators">
								<li data-target="#slide-list" data-slide-to="0" class="active"></li>
								<li data-target="#slide-list" data-slide-to="1"></li>
								<li data-target="#slide-list" data-slide-to="2"></li>
							</ol>
						</div>
					</div>
				</div>
			</div>

			<div class="carousel-inner" role="listbox">
				<div class="item active">
					<div class="single-slide">
						<div class="slide-bg slide-one"></div>
						<div class="slide-text-wrapper"></div>
					</div>
				</div>
				<div class="item">
					<div class="single-slide">
						<div class="slide-bg slide-two"></div>
						<div class="slide-text-wrapper"></div>
					</div>
				</div>
				<div class="item">
					<div class="single-slide">
						<div class="slide-bg slide-three"></div>
						<div class="slide-text-wrapper"></div>
					</div>
				</div>
			</div>

		</div>
	</div>
	<!-- End slider area -->

	

	<div class="maincontent-area">
		<div class="zigzag-bottom"></div>
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="latest-product">
						<h2 class="section-title">Products</h2>					
						<div class="product-carousel">
							<c:forEach items="${books}" var="book">
							
								<div class='single-product'>
									<div class='product-f-image'>
										<img class="productImages" src='img/${book.img}.jpg'
											alt='${book.blurb}'>
										<div class='product-hover'>
											<a href='addtocart-${book.id}' class='add-to-cart-link'
												 method="post"> <i class='fa fa-shopping-cart'> </i>
												Add to cart
											</a> <a href='single-product-${book.id}'
												class='view-details-link'> <i class='fa fa-link'></i>
												See details
											</a>
										</div>
									</div>
									<h2>
										<a href='single-product-${book.id}'> ${book.title}</a>
									</h2>
									<div class='product-carousel-price'>
										<ins>${book.price}<br>
										</ins>
										${book.genre}
									</div>
								</div>

							</c:forEach>

						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- End main content area -->

	

	<div class="product-widget-area">
		<div class="zigzag-bottom"></div>
		<div class="container">
			<div class="row">
				<div class="col-md-4">
					<div class="single-product-widget">
						<h2 class="product-wid-title">Top Sellers</h2>
						<a href="#" class="wid-view-more">View All</a>

						<c:forEach items="${books}" begin="0" end="3" varStatus="loop"
							var="book">

							<div class="single-wid-product">
								<a href="single-product-${book.id}"><img src="img/${book.img}.jpg"
									alt="${book.img}" class="product-thumb"></a>
								<h2>
									<a href="single-product-${book.id}">${book.title}</a>
								</h2>
								<div class="product-wid-rating">
									<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
										class="fa fa-star"></i> <i class="fa fa-star"></i> <i
										class="fa fa-star"></i>
								</div>
								<div class="product-wid-price">
									<ins>${book.price}</ins>
								</div>
							</div>

						</c:forEach>
					</div>
				</div>
				<div class="col-md-4">
					<div class="single-product-widget">
						<h2 class="product-wid-title">Recently Viewed</h2>
						<a href="#" class="wid-view-more">View All</a>

						<c:forEach items="${books}" begin="0" end="3" varStatus="loop"
							var="book">

							<div class="single-wid-product">
								<a href="single-product-${book.id}"><img src="img/${book.img}.jpg"
									alt="${book.img}" class="product-thumb"></a>
								<h2>
									<a href="single-product-${book.id}">${book.title}</a>
								</h2>
								<div class="product-wid-rating">
									<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
										class="fa fa-star"></i> <i class="fa fa-star"></i> <i
										class="fa fa-star"></i>
								</div>
								<div class="product-wid-price">
									<ins>${book.price}</ins>
								</div>
							</div>

						</c:forEach>

					</div>
				</div>
				<div class="col-md-4">
					<div class="single-product-widget">
						<h2 class="product-wid-title">Top New</h2>
						<a href="#" class="wid-view-more">View All</a>
						<c:forEach items="${books}" begin="0" end="3" varStatus="loop"
							var="book">

							<div class="single-wid-product">
								<a href="single-product-${book.id}"><img src="img/${book.img}.jpg"
									alt="${book.img}" class="product-thumb"></a>
								<h2>
									<a href="single-product-${book.id}">${book.title}</a>
								</h2>
								<div class="product-wid-rating">
									<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
										class="fa fa-star"></i> <i class="fa fa-star"></i> <i
										class="fa fa-star"></i>
								</div>
								<div class="product-wid-price">
									<ins>${book.price}</ins>
								</div>
							</div>

						</c:forEach>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- End product widget area -->

	

	<div class="footer-bottom-area">
		<div class="container">
			<div class="row">
				<div class="col-md-8">
					<div class="copyright">
						<p>&copy; 2015 eBooks. All Rights Reserved. Coded by Us</p>
					</div>
				</div>

				<div class="col-md-4">
					<div class="footer-card-icon">
						<i class="fa fa-cc-discover"></i> <i class="fa fa-cc-mastercard"></i>
						<i class="fa fa-cc-paypal"></i> <i class="fa fa-cc-visa"></i>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- End footer bottom area -->

	<!-- Latest jQuery form server -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>

	<!-- Bootstrap JS form CDN -->
	<script
		src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>

	<!-- jQuery sticky menu -->
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/jquery.sticky.js"></script>

	<!-- jQuery easing -->
	<script src="js/jquery.easing.1.3.min.js"></script>

	<!-- Main Script -->
	<script src="js/main.js"></script>
</body>
</html>