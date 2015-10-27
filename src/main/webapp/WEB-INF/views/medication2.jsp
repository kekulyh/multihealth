<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
<head>
<title>MultiHealth :: Medication :: Doctor</title>
<link href="css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
<link href="css/style.css" type="text/css" rel="stylesheet" media="all">
<link href="css/medication.css" type="text/css" rel="stylesheet" media="all">
<!--web-font-->
<!--<link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>-->
<!--<link href='http://fonts.googleapis.com/css?family=Lobster' rel='stylesheet' type='text/css'>-->
<!--//web-font-->
<!-- Custom Theme files -->
<!--<meta name="viewport" content="width=device-width, initial-scale=1">-->
<!--<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />-->
<!--<meta name="keywords" content="Metge Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, -->
	<!--Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />-->
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
<!--//end-smoth-scrolling-->
</head>
<body>
    <!--banner-->
	<div class="banner bnr-text">
		<!--header-->
		<div class="container">
			<div class="header">			
				<div class="header-logo">
					<a href="index.html"><img src="images/logo.png" alt="logo"/></a>

				</div>

				<div class="top-nav">
					<span class="menu"><img src="images/menu-icon.png" alt=""/></span>		
					<ul class="nav1">
						<li><a href="index">Home</a></li>
						<li><a href="nutrition">Nutrition</a></li>
						<li><a href="index1">Mental</a></li>
						<li><a href="medication" class="active">Medication</a></li>
						<li><a href="userlogout">Logout</a></li>
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
				<!--<div class="home-social">-->
					<!--<ul>-->
						<!--<li><a href="#"></a></li>-->
						<!--<li><a href="#" class="fb1"></a></li>-->
						<!--<li><a href="#" class="be1"></a></li>-->
						<!--<li><a href="#" class="gg1"></a></li>-->
					<!--</ul>	-->
				<!--</div>-->
				<div class="clearfix"> </div>
			</div>	
			<!--//header-->								
		</div>
	</div>					
	<!--header-->

	<!-- Body -->
	<div class="section section-breadcrumbs">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<h1>Medication</h1>
				</div>
			</div>
		</div>
	</div>

	<!-- Content -->
	<div class="section">
		<div class="container">
			<div class="row">

				<!-- Sidebar -->
				<div class="col-md-2 col-sm-2 blog-sidebar">
					<!-- <h4>Search a Medicine</h4>
					
					Search Medicine SideBar
					<form role="form" action="medication_medicine_find" method="post">
						<div class="input-group">
							<input type="text" class="form-control input-sm" id="medicineSearchSidebar" placeholder="Name" name="medicineSearch">
							<span class="input-group-btn">
								<button type="submit" class="btn btn-primary btn-sm">Search</button>
							</span>
							<div class="radio hidden">
								<label>
									<input type="radio" name="optionsRadios" id="optionsRadios1Sidebar"
										   value="1" checked>By Name
								</label>
							</div>
						</div>
					</form>
					Search Medicine SideBar End
					
					<h4>Drugs & Medicine</h4>
					<ul class="recent-posts">
						<li><a href="medication_medicine_find">Find a Medicine</a></li>
						<li><a href="medication_medicine_list">View Medicine List</a></li>

					</ul>
					<h4>Pharmacy Doctors</h4>
					<ul class="blog-categories">
						<li><a href="medication_doctor_find">Find a Doctor</a></li>
						<li><a href="medication_doctor_list">View Doctor List</a></li>

					</ul>
					<h4>News & Events</h4>
					<ul class="blog-categories">
						<li><a href="medication_news">Medical News</a></li>
						<li><a href="medication_events">Medical Events</a></li>

					</ul> -->
					
					<h4>Management</h4>
					<ul class="blog-categories">
						<li><a href="medication_medicine_manage">Manage Medicine</a></li>
						<li><a href="medication_doctor_manage">Manage Doctor Information</a></li>
						<li><a href="medication_news_manage">Manage News</a></li>
						<li><a href="medication_events_manage">Manage Events</a></li>
					</ul>
					
				</div>
				<!-- End Sidebar -->

				<!-- Medication Main -->
				<div class="col-md-10 col-sm-10">
					<div class="blog-post blog-single-post">

						<!-- Title -->
						<div class="text-center">
							<h3>MultiHealth :: Medication :: Doctor</h3>
						</div>


						<div class="single-post-info"></div>

						<!-- Content -->
						<h3>Management</h3>
						<div class="">
							<div class="col-md-6 servc-info">
								<ul>
									<li><img src="images/pill.png" width="50" alt=""></li>
									<li>
										<a href="medication_medicine_manage"><h4>Manage Medicine</h4></a>
										<p>Having trouble choosing your medicine? Enter the name or symptoms. We will display the specification of your medicine.</p>
									</li>
								</ul>
							</div>
							<div class="col-md-6 servc-info">
								<ul>
									<li><img src="images/doctor.png" width="50" alt=""></li>
									<li>
										<a href="medication_doctor_manage"><h4>Manage Doctor Information</h4></a>
										<p>View our MedicinePedia and find your interests. </p>
									</li>
								</ul>
							</div>
							<div class="clearfix"> </div>
							<div class="col-md-6 servc-info">
								<ul>
									<li><img src="images/news.png" width="50" alt=""></li>
									<li>
										<a href="medication_news_manage"><h4>Manage News</h4></a>
										<p>We provide the latest medical news, plus recent press announcements from major medical organizations.</p>
									</li>
								</ul>
							</div>
							<div class="col-md-6 servc-info">
								<ul>
									<li><img src="images/event.png" width="50" alt=""></li>
									<li>
										<a href="medication_events_manage"><h4>Manage Events</h4></a>
										<p>We provide events, lectures and seminars for citizens who are interested in health and medication.</p>
									</li>
								</ul>
							</div>
							<div class="clearfix"> </div>
						</div>
						<br>

						<!-- <h3>Pharmacy Doctors</h3>
						<div class="">
							<div class="col-md-6 servc-info">
								<ul>
									<li><img src="images/stethoscope.png" width="50" alt=""></li>
									<li>
										<a href="medication_doctor_find"><h4>Find a Doctor</h4></a>
										<p>Want to meet some pharmacy doctors? Enter the name, specialty or pharmacy name to find them.</p>
									</li>
								</ul>
							</div>
							<div class="col-md-6 servc-info">
								<ul>
									<li><img src="images/doctor.png" width="50" alt=""></li>
									<li>
										<a href="medication_doctor_list"><h4>View Doctor List</h4></a>
										<p>View the list of our registered pharmacy doctors.</p>
									</li>
								</ul>
							</div>
							<div class="clearfix"> </div>
						</div>
						<br>

						<div class="">
						<h3>News & Events</h3>
						<div class="">
							<div class="col-md-6 servc-info">
								<ul>
									<li><img src="images/news.png" width="50" alt=""></li>
									<li>
										<a href="medication_news"><h4>Medical News</h4></a>
										<p>We provide the latest medical news, plus recent press announcements from major medical organizations.</p>
									</li>
								</ul>
							</div>
							<div class="col-md-6 servc-info">
								<ul>
									<li><img src="images/event.png" width="50" alt=""></li>
									<li>
										<a href="medication_events"><h4>Medical Events</h4></a>
										<p>We provide events, lectures and seminars for citizens who are interested in health and medication.</p>
									</li>
								</ul>
							</div>
							<div class="clearfix"> </div>
						</div> -->
							
							
						<!-- <div class="row srvc-row">
							<div class="col-sm-6 col-md-4 srvc-bottom-grids">
								<div class="thumbnail">
									<a href="singlepage.html" class="swipebox" title="">
										<img src="images/img19.jpg" class="img-responsive zoom-img " alt="">
									</a>
									<div class="caption srvc-caption">
										<h3><a href="singlepage.html">News 1</a></h3>
										<p>Cras justo odiodapibus ac facilisis egestas eget</p>
									</div>
								</div>
							</div>
							<div class="col-sm-6 col-md-4 srvc-bottom-grids">
								<div class="thumbnail">
									<a href="singlepage.html" class="swipebox"  title="">
										<img src="images/img20.jpg" class="img-responsive zoom-img " alt="">
									</a>
									<div class="caption srvc-caption">
										<h3><a href="singlepage.html">News 2</a></h3>
										<p>Cras justo odiodapibus ac facilisis egestas eget</p>
									</div>
								</div>
							</div>
							<div class="col-sm-6 col-md-4 srvc-bottom-grids">
								<div class="thumbnail">
									<a href="singlepage.html" class="swipebox"  title="">
										<img src="images/img21.jpg" class="img-responsive zoom-img" alt="">
									</a>
									<div class="caption srvc-caption">
										<h3><a href="singlepage.html">News 3</a></h3>
										<p>Cras justo odiodapibus ac facilisis egestas eget</p>
									</div>
								</div>
							</div>
							<div class="clearfix"> </div>
							<div class="col-sm-6 col-md-4 srvc-bottom-grids">
								<div class="thumbnail">
									<a href="singlepage.html" class="swipebox"  title="">
										<img src="images/img22.jpg" class="img-responsive zoom-img " alt="">
									</a>
									<div class="caption srvc-caption">
										<h3><a href="singlepage.html">Event 1</a></h3>
										<p>Cras justo odiodapibus ac facilisis egestas eget</p>
									</div>
								</div>
							</div>
							<div class="col-sm-6 col-md-4 srvc-bottom-grids">
								<div class="thumbnail">
									<a href="singlepage.html" class="swipebox"  title="">
										<img src="images/img2.jpg" class="img-responsive zoom-img " alt="">
									</a>
									<div class="caption srvc-caption">
										<h3><a href="singlepage.html">Event 2</a></h3>
										<p>Cras justo odiodapibus ac facilisis egestas eget</p>
									</div>
								</div>
							</div>
							<div class="col-sm-6 col-md-4 srvc-bottom-grids">
								<div class="thumbnail">
									<a href="singlepage.html" class="swipebox"  title="">
										<img src="images/img23.jpg" class="img-responsive zoom-img" alt="">
									</a>
									<div class="caption srvc-caption">
										<h3><a href="singlepage.html">Event 3</a></h3>
										<p>Cras justo odiodapibus ac facilisis egestas eget</p>
									</div>
								</div>
							</div>
							<div class="clearfix"> </div>
						</div> -->
						
						
						
						</div>
						<!-- Content End -->

						<div class="single-post-info"></div>



					</div>
				</div>
				<!-- Medication Main End -->
			</div>
		</div>
	</div>
	<!-- Body End -->

	<!--footer-->
	<div class="footer"> 
		<div class="footer-text">
			<div class="container">
				<h3>This is footer</h3>
				<p>This is footer.This is footer.This is footer.This is footer.This is footer.This is footer.This is footer.</p>
			</div>
		</div>	
		<!--<div class="map">-->
			<!--<iframe src="https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d492961.1701893511!2d77.26071847271531!3d15.144106478541513!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1sen!2sin!4v1432977452715" style="border:0"></iframe>-->
		<!--</div>-->
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
				<p>Copyright &copy; 2015 MultiHealth. All rights reserved.</p>
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