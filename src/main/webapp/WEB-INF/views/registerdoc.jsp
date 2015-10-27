<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Metge a Medical Category Flat bootstrap Responsive website Template | About :: w3layouts</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="js/bootstrap.js"></script>
<link href="css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
<link href="css/style.css" type="text/css" rel="stylesheet" media="all">
<!--web-font-->
<link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
<link href='http://fonts.googleapis.com/css?family=Lobster' rel='stylesheet' type='text/css'>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="css/default.css">

<!--//web-font-->
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Metge Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
	Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //Custom Theme files -->
<!-- js -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>  
<script src="js/modernizr.custom.63321.js"></script>
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
<!--  <SCRIPT>  
     function ok()  
     {  
       var name = form2.name.value;  
  
      var title= form2.title.value;  
       form1.action="FileUpload?name="+name+"&title="+title;  
       form1.submit();   
     }  
     </SCRIPT>  -->
<!--//end-smoth-scrolling-->
</head>
<body>
    <!--banner-->
	<div class="banner bnr-text">
		<!--header-->
		<div class="container">
			<div class="header">			
				<div class="header-logo">
					<a href="index.jsp"><img src="images/logo.png" alt="logo"/></a>
				</div>
				<div class="top-nav">
					<span class="menu"><img src="images/menu-icon.png" alt=""/></span>		
					<ul class="nav1">
						<li><a href="index.jsp">Home</a></li>
						<li><a href="about.jsp" class="active">About</a></li>
						<li><a href="services.jsp">Services</a></li>
						<li><a href="news.jsp">News</a></li>
						<li><a href="contact.jsp">Contact</a></li>
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
				<div class="home-social">
					<ul>
						<li><a href="#"></a></li>
						<li><a href="#" class="fb1"></a></li>
						<li><a href="#" class="be1"></a></li>
						<li><a href="#" class="gg1"></a></li>
					</ul>	
				</div>
				<div class="clearfix"> </div>
			</div>	
			<!--//header-->								
		</div>
	</div>					
	<!--header-->
	<!--about-->
	<div class="about"> 
		<div class="container">
			<h3>User Register</h3>
			<div class="about-text">
				<div class="col-md-4 about-text-left">
					<img src="images/img18.jpg" class="img-responsive" alt=""/>
				</div>
				<div class="col-md-8 about-text-right">
					<h4>Enter Your Personal Information Here </h4>
					<p><form action="upload"  method="post" enctype="multipart/form-data" onsubmit="return on_submit()" >

					 <table class="table">
					<tbody>
						<tr>
							<td><div class="form-group">
   								 <input type="text" class="form-control" placeholder="Enter Doctor Name" name="name" id="name">
  							</div>
  							</td>
						</tr>
						<tr>
							<td><div class="form-group">
   								 <input type="password" class="form-control" placeholder="Enter Password" name="password" id="password">
  							</div>
  							</td>
						</tr>
						<tr>
							<td><div class="form-group">
   								 <input type="text" class="form-control" placeholder="Enter Tel" name="tel" id="tel">
  							</div>
  							</td>
						</tr>
						<tr>
							<td><div class="form-group">
   								 <input type="text" class="form-control" placeholder="Enter Brief Description" name="brief" id="brief">
  							</div>
  							</td>
						</tr>
						<tr>
							<td><div class="form-group">
                                       <textarea class="form-control" rows="4" name="description"></textarea>
                                </div>
  							</td>
						</tr>	
						<tr>
						<td><div class="form-group">
                        <!--  <input id="file-4" type="file" class="file"  name="thefile" >-->
                        <span id="files"><input type="file" name="myfile" /></span></td>
                        </div>
						</tr>
						    
						
 					 </tbody>
				</table>
				
				 <button class="btn btn-success" type="submit">Submit</button>  
				</form></p>
<!--  <form action="upload2"  method="post" enctype="multipart/form-data" onsubmit="return on_submit()" >
  <input type="file" name="thefile" /> 
  
 <div class="form-group">
   								 <input type="text" class="form-control" placeholder="Enter Username" name="name" id="name">
  							</div>
   								<button class="btn btn-success" type="submit">Submit</button> 
  							
 </form>-->
				</div>
				<div class="clearfix"> </div>
			</div>
					
			
		</div><!-- /container -->			
	</div>		
	<!--footer-->
	<div class="footer"> 
		<div class="footer-text">
			<div class="container">
				<h3>Get in touch</h3>
				<p>Blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident.</p>
			</div>
		</div>	
		<div class="map">
			<iframe src="https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d492961.1701893511!2d77.26071847271531!3d15.144106478541513!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1sen!2sin!4v1432977452715" style="border:0"></iframe>
		</div>
		<div class="copy-right">
			<div class="container">
				<div class="social-icons">
					<ul>
						<li><a href="#"></a></li>
						<li><a href="#" class="fb"></a></li>
						<li><a href="#" class="be"></a></li>
						<li><a href="#" class="gg"></a></li>
					</ul>	
				</div>
				<p>Copyright © 2015 Metge. All rights reserved | Design by <a href="http://w3layouts.com">W3layouts</a></p>
			</div>
		</div>
	</div>	
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