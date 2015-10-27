<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>MultiHealth:: Mental</title>
<link href="css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
<link href="css/style.css" type="text/css" rel="stylesheet" media="all">
<!--web-font-->
<link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Lobster' rel='stylesheet' type='text/css'>
<!--//web-font-->
<!-- Custom Theme files -->
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //Custom Theme files -->
<!-- js -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>  
<!-- //js -->	
<!-- start-smoth-scrolling-->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>	
<script type="text/javascript">
		jQuery(document).ready(function($) {
			$(".scroll").click(function(event){		
				event.preventDefault();
				$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
			});
		});
</script>
<!--//end-smoth-scrolling-->
</head>
<%
  		String msg = (String)request.getAttribute("msg");
  		if(msg != null){
  			out.print("<script>window.alert('"+msg+"');</script>");
  			request.removeAttribute(msg);
  		}
   %>
<body>
    <!--banner-->
	<div class="banner">
		<!--header-->
		<div class="container">
			<div class="header">			
				<div class="header-logo">
					<a href="index"><img src="images/logo.png" alt="logo"/></a>
				</div>
				<div class="top-nav">
					<span class="menu"><img src="images/menu-icon.png" alt=""/></span>





					<ul class="nav1">
						<li><a href="index">Home</a></li>
						<li><a href="music">Music</a>

							<li><div class="dropdown" >
								<a id="dLabel" data-target="#" 
									data-toggle="dropdown" role="button" aria-haspopup="true"
									aria-expanded="false"> Sign Up <span class="caret"></span>
								</a>

								
							<ul class="dropdown-menu" aria-labelledby="dLabel" style="background: rgba(0, 0, 0, 0)">
								
								<li><a href="register" style="outline-color: black;">User</a></li>
								<li><a href="registerdoc">Doctor</a></li>
								</ul>
							</div>
							</li>
						
						<li><a href="newslist">News</a></li>

					</ul>




					<!-- script-for-menu -->
					 <script>
					   $( "span.menu" ).click(function() {
						 $( "ul.nav1" ).slideToggle( 300, function() {
						 // Animation complete.
						  });
						 });
					</script>
					<!-- /script-for-menu -->
				</div>	
				
				<div class="clearfix"> </div>
			</div>	
			<!--//header-->	
			<div class="banner-text">								
				<div class="badge">
					<h1><span class="char1">H</span><span class="char2">o</span><span class="char3">s</span><span class="char4">p</span><span class="char5">i</span><span class="char6">t</span><span class="char7">a</span><span class="char8">l</span><span class="char9">i</span><span class="char10">t</span><span class="char11">y</span>
					<span class="char12"> </span><span class="char13">S</span><span class="char14">e</span><span class="char15">r</span><span class="char16">v</span><span class="char17">i</span><span class="char18">c</span><span class="char19">e</span><span class="char20">s</span></h1>
				</div>
				<h2>Metge</h2>
				<h3>Care You Deserve</h3>
				<div class="clearfix"> </div>
			</div>					
		</div>
	</div>					
	<!--//banner-->
	<div class="banner-bottom"> 
		<div class="container">
			<h3>Welcome Visitors</h3>
			<form action="userlogin" method="post">
			<p><div class="form-group">
   								 <input type="text" class="form-control" placeholder="Enter Name" name="name" id="name">
  							</div></p>
			<p><div class="form-group">
   								 <input type="password" class="form-control" placeholder="Enter Password" name="password" id="password">
  							</div></p>
  							<div class="form-group">
    <select class="form-control" name="loginrole" id="loginrole"> 
      <option>User</option> 
      <option>Doctor</option> 
       
      </select>
  </div>
  <button class="btn btn-success" type="submit">Login</button> 
  </form>
		</div>
	</div>
	<!--special-->
	
	<!--//special-->
	<!--work-->
	

	<!--work-->	
	<!--portfolio-->
	
	<!--footer-->
	
	<!--smooth-scrolling-of-move-up-->
		<script type="text/javascript">
			$(document).ready(function() {
				/*
				var defaults = {
					containerID: 'toTop', // fading element id
					containerHoverID: 'toTopHover', // fading element hover id
					scrollSpeed: 1200,
					easingType: 'linear' 
				};
				*/
				
				$().UItoTop({ easingType: 'easeOutQuart' });
				
			});
		</script>
		<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
	<!--//smooth-scrolling-of-move-up-->
	<!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="js/bootstrap.js"></script>
</body>
</html>