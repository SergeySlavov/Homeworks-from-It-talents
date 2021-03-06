<%@
page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>eBooks</title>
    
    <!-- Google Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Raleway:400,100' rel='stylesheet' type='text/css'>
    
    <!-- Bootstrap -->
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
    
    <!-- Font Awesome -->
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
    
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
                            
                            <li><a href="cart"><i class="fa fa-user"></i> My Cart</a></li>
                             <%if (((String)request.getSession().getAttribute("name"))==null) { %>
                            <li><a href="login"><i class="fa fa-user"></i><span id="loginName"> Login</span></a></li>
                            <%} else {%>
                           <li><a href="login"><i class="fa fa-user"></i> <%=request.getSession().getAttribute("name") %></a></li>
                           <li><a href="logout"><i class="fa fa-user"></i> Logout </a></li>
                           <%} %>
                            
                        </ul>
                    </div>
                </div>
                
                <div class="col-md-4">
                    <div class="header-right">
                       
                    </div>
                </div>
            </div>
        </div>
    </div> <!-- End header area -->
    
    <div class="site-branding-area">
        <div class="container">
            <div class="row">
                <div class="col-sm-6">
                    <div class="logo">
                        <h1><a href="index">e<span>Books</span></a></h1>
                    </div>
                </div>
                
                
            </div>
        </div>
    </div> <!-- End site branding area -->
    
    <div class="mainmenu-area">
        <div class="container">
            <div class="row">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                </div> 
                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">
                        <li><a href="index">Home</a></li>
                        
                      
                    </ul>
                </div>  
            </div>
        </div>
    </div> <!-- End main menu area -->
    <div id="login-form">
		<div class="form profile textPro">
			first name: <br/>
			last name: <br/>
			e-mail:<br/>
			password:<br/>
			repeat password:<br/><br/>
			street:<br/>
			number:<br/>
			city:
		</div>
		<div class="form input">
	        <form:form  method = "post" class="form" commandName="userWrap">
			<form:input type="text" placeholder="First Name" path="user.firstName" required="true"/> <br>
			<form:input type="text" placeholder="Last Name" path="user.lastName" required="true"/> <br>
			<form:input type="email" placeholder="Email" path="user.eMail" required="true"/> <br>
			<form:input type="password" placeholder="Password" path="user.password" required="true"/> <br>
			<form:input type="password" placeholder="Re-Password" path="user.rePassword" required="true"/> <br> <br/><br>
			<form:input type="text" placeholder="Street" path="adress.street" required="true"/> <br>
			<form:input type="text" placeholder="number" path="adress.number" required="true"/> <br>
			<form:input type="text" placeholder="City" path="adress.city" required="true"/> <br>
			<div>
			<button type="submit" value="Login" class="button registerButton">Register</button>
			<a href="redirect:index" >back</a>
			</div>
			</form:form>
		</div>
    </div>
    <div class="footer-bottom-area">
        <div class="container">
            <div class="row">
                <div class="col-md-8">
                    <div class="copyright">
                        <p>&copy; 2015 eBooks. All Rights Reserved. Coded by Us </p>
                    </div>
                </div>
                
                <div class="col-md-4">
                    <div class="footer-card-icon">
                        <i class="fa fa-cc-discover"></i>
                        <i class="fa fa-cc-mastercard"></i>
                        <i class="fa fa-cc-paypal"></i>
                        <i class="fa fa-cc-visa"></i>
                    </div>
                </div>
            </div>
        </div>
    </div>
   
    <!-- Latest jQuery form server -->
    <script src="https://code.jquery.com/jquery.min.js"></script>
    
    <!-- Bootstrap JS form CDN -->
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    
    <!-- jQuery sticky menu -->
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/jquery.sticky.js"></script>
    
    <!-- jQuery easing -->
    <script src="js/jquery.easing.1.3.min.js"></script>
    
    <!-- Main Script -->
    <script src="js/main.js"></script>
  </body>
</html>