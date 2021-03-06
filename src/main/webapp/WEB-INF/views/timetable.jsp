<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>MultiHealth:: Mental</title>
<link href="css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
<link href="css/style.css" type="text/css" rel="stylesheet" media="all">
<link href="css/commons.css" type="text/css" rel="stylesheet" media="all">
<!--web-font-->
<link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
<link href='http://fonts.googleapis.com/css?family=Lobster' rel='stylesheet' type='text/css'>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="css/default.css">
<link rel="stylesheet" type="text/css" href="css/lanrenzhijia1.css" />
<link rel="stylesheet" type="text/css" href="css/jquery.datetimepicker.css"/>
<!--//web-font-->
<!-- Custom Theme files -->
<meta http-equiv="content-type" content="text/html; charset=gb2312"/>
<meta name="viewport" content="width=device-width, initial-scale=1">

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
<script type="text/javascript" src="js/lanrenzhijia1.js"></script>

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
	<div class="banner bnr-text">
		<!--header-->
		<div class="container">
			<div class="header">
				<div class="header-logo">
					<a href="index2"><img src="images/logo.png" alt="logo" /></a>
				</div>
				<div class="top-nav">
					<span class="menu"><img src="images/menu-icon.png" alt="" /></span>
					<ul class="nav1">
						<li><a href="index2" class="active">Home</a></li>
						
						<li><a href="solveconsult">User's Consultation</a></li>
						<li><a href="newslist">News</a></li>
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
				
				<div class="clearfix"></div>
			</div>
			<!--//header-->
		</div>
	</div>
	<!--header-->
	<div class="section section-breadcrumbs">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<h1>Mental Health</h1>
				</div>
			</div>
		</div>
	</div>
	<!--about-->
	<div class="section">
		<div class="container">
		<div class="row">
		
		<div class="col-md-3 col-sm-3 blog-sidebar">
					<h4>Search a Consultation</h4>
										
					<!-- Search Medicine SideBar -->
					<form role="form" action="consultsearch" method="post">
						<div class="input-group">
							<input type="text" class="form-control input-sm" id="medicineSearchSidebar" placeholder="Title" name="findconsult">
							<span class="input-group-btn">
								<button type="submit" class="btn btn-primary btn-sm">Search</button>
							</span>
							<div class="radio hidden">
								<label>
									<input type="radio" name="optionsRadios" id="optionsRadios1Sidebar"
										   value="1" checked>By Title
								</label>
							</div>
						</div>
					</form>
					<!-- Search Medicine SideBar End -->
					
					<h4>Reservation</h4>
					<ul class="recent-posts">
						<li><a href="userapp" >Check User's reservation</a></li>
						<li><a href="jumptimetable">Upload Timetable</a></li>
						
					</ul>
					<h4>Personal Information</h4>
					<ul class="blog-categories">
						<li><a href="solveconsult">Check Consult List</a></li>
						<li><a href="docinfor">The Consultations I've Solved</a></li>
					</ul>
					<h4>News & Events</h4>
					<ul class="blog-categories">
						<li><a href="newslist">Mental Health News</a></li>
					</ul>

				</div>
				
				<div class="col-md-9 col-sm-9">
					<div class="blog-post blog-single-post">
		              <div class="text-center">
							<h3>Upload Timetable</h3>
						</div>
					<h4>Upload Your Timetable Here</h4>
					<div class="panel panel-info" style="height: 300px; weight:1000px;overflow:auto">
					
					
					<form action="addtimetable" method="post" enctype="multipart/form-data"
						onsubmit="return on_submit()">

						<table class="table">
							<tbody>
								
								<tr>
									<td>
										<div class="form-group">
											<input type="text" name="adate" class="tcal" id="adate"/>
										</div>
									</td>
									<td>
										<div class="form-group">
											<select class="form-control" name="timeperiod" id="timeperiod">
												<option>9:00-10:00</option>
												<option>10:00-11:00</option>
												<option>14:00-15:00</option>
												<option>15:00-16:00</option>
												<option>16:00-17:00</option>
											</select>
										</div>
									</td>
									<td>
									<div class="form-group">
											<input type="text" class="form-control"
												placeholder="Enter Address" name="address" id="address">
										</div>
									</td>
								</tr>
								
								<tr>
									<td>
										<div class="form-group">
											<input type="text" name="adate1" class="tcal" id="adate1"/>
										</div>
									</td>
									<td>
										<div class="form-group">
											<select class="form-control" name="timeperiod1" id="timeperiod1">
												<option>9:00-10:00</option>
												<option>10:00-11:00</option>
												<option>14:00-15:00</option>
												<option>15:00-16:00</option>
												<option>16:00-17:00</option>
											</select>
										</div>
									</td>
									<td>
									<div class="form-group">
											<input type="text" class="form-control"
												placeholder="Enter Address" name="address1" id="address1">
										</div>
									</td>
								</tr>
								
								<tr>
									<td>
										<div class="form-group">
											<input type="text" name="adate2" class="tcal" id="adate2"/>
										</div>
									</td>
									<td>
										<div class="form-group">
											<select class="form-control" name="timeperiod2" id="timeperiod2">
												<option>9:00-10:00</option>
												<option>10:00-11:00</option>
												<option>14:00-15:00</option>
												<option>15:00-16:00</option>
												<option>16:00-17:00</option>
											</select>
										</div>
									</td>
									<td>
									<div class="form-group">
											<input type="text" class="form-control"
												placeholder="Enter Address" name="address2" id="address2">
										</div>
									</td>
								</tr>
								


							</tbody>
						</table>
						<div align="center">
						<button class="btn btn-success" type="submit">Submit</button></div>
					</form>
					
					
					
					</div>
					
					</div>
					</div>
		
		</div>
		
		
		
		
			
				<div class="clearfix"></div>
			</div>


		</div>
		<!-- /container -->
	
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