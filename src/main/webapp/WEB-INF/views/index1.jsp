<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>MultiHealth:: Mental</title>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script> 
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
 <script src="js/bootstrap.js"></script>
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
<body>
    <!--banner-->
	<div class="banner">
		<!--header-->
		<div class="container">
			<div class="header">			
				<div class="header-logo">
					<a href="index2"><img src="images/logo.png" alt="logo"/></a>
				</div>
				<div class="top-nav">
					<span class="menu"><img src="images/menu-icon.png" alt=""/></span>		
					<ul class="nav1">
						<li><a href="index1" class="active">Home</a></li>
						
						
						<li><a href="newslist">News</a></li>
						<li><a href="personallistcon">Personal Information</a></li>
						<li><a href="userlogout">Log Out</a></li>
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
	
	<!--special-->
	<div class="special"> 
		<div class="container">
			<div class="col-md-5 special-grids">
				<h3>Our Specialization</h3>
				<p></p>
				<h6>Our facilities</h6>
				<div class="progress">
					<div class="progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%;">
						60%
					</div>
				</div>
				<h6>Experienced staff</h6>
				<div class="progress">
					<div class="progress-bar" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%;">
						80%
					</div>
				</div>
				<h6>Free consultations</h6>
				<div class="progress">
					<div class="progress-bar" role="progressbar" aria-valuenow="90" aria-valuemin="0" aria-valuemax="100" style="width:90%;">
						90%
					</div>
				</div>
				<h6>Advanced lab tests</h6>
				<div class="progress">
					<div class="progress-bar" role="progressbar" aria-valuenow="75" aria-valuemin="0" aria-valuemax="100" style="width: 75%;">
						75%
					</div>
				</div>
			</div>	
			<div class="col-md-7 special-grids">
				<h3>What We do</h3>
				<div class="embed-responsive embed-responsive-16by9">
					<iframe width="560" height="315" src="https://www.youtube.com/embed/LlqkheMtsJk" frameborder="0" allowfullscreen></iframe>
				</div>
			</div>
			<div class="clearfix"> </div>
		</div>
	</div>
	<!--//special-->
	<!--work-->
	<div class="work"> 
		<div class="container">
			<h3>Our Services</h3>
			<div class="row work-row">
				<div class="col-sm-6 col-md-4 work-row-grids">
					<div class="work-grids-img">
						<img src="images/icon1.png" alt=""/>
					</div>	
					<div class="caption work-captn">
						<h4><a href="consultlist">Consult Your Problems</a></li></h4>
						<p>Consult Your Problem Here</p>						
					 </div>
				</div>
				<div class="col-sm-6 col-md-4 work-row-grids">
					<div class="work-grids-img">
						<img src="images/icon2.png" alt=""/>
						
					</div>	
					<div class="caption work-captn">
						<h4><a href="gotoapp" type=""><input type="hidden" name="uid" value="${user.id}">Make An Appointment</a></h4>
						<p>Clicking Here To Make An Appointment</p>						
					 </div>
				</div>
				<div class="col-sm-6 col-md-4 work-row-grids">
					<div class="work-grids-img">
						<img src="images/mmmm.jpg" alt="" width="64" height="64"/>
					</div>	
					<div class="caption work-captn">
						<h4><a href="music">Soft Music</a></h4>
						<p>Want To Listen To Some Soft Music?</p>						
					 </div>
				</div>
				<div class="clearfix"> </div>
			</div>
			<div class="work-text">
				<!-- banner-text Slider starts Here -->
				<script src="js/responsiveslides.min.js"></script>
				 <script>
					// You can also use "$(window).load(function() {"
						$(function () {
						// Slideshow 4
							$("#slider4").responsiveSlides({
							auto: true,
							pager:true,
							nav:false,
							speed: 500,
							namespace: "callbacks",
							before: function () {
							$('.events').append("<li>before event fired.</li>");
							},
							after: function () {
								$('.events').append("<li>after event fired.</li>");
							}
						});	
					});
				</script>
				<!--//End-slider-script -->
				
			</div>	
		</div>	
	</div>
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
   
</body>
</html>