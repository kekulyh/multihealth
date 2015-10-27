<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>  
<script type="text/javascript" src="js/bootstrap.min.js" ></script>
<link href="css/bootstrap.css" type="text/css" rel="stylesheet">
<link href="css/style.css" type="text/css" rel="stylesheet">
<link href="css/medication.css" type="text/css" rel="stylesheet">
<script src="js/bootstrap3-validation.js" type="text/javascript"></script>
<link href="css/fileinput.css" type="text/css" rel="stylesheet">
<script src="js/fileinput.js" type="text/javascript"></script>
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

<script src="js/modernizr.custom.63321.js"></script>

<!-- <script src="js/respond.min.js" type="text/javascript"></script> 
<script src="js/html5.js" type="text/javascript"></script> -->

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

<!-- Validation Script -->
<script type="text/javascript">
$(function(){
	$("#formInformation").validation();
	//.注册
		$("#submit2").on('click',function(event){
			// 2.最后要调用 valid()方法。
			if ($("#formInformation").valid(this,'Contents are not valid. Please check your input.')==false){
				return false;
		}
	});
})
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
					<!--  <h4>Search a Medicine</h4>
					
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
							<h3>Manage Doctor</h3>
						</div>


						<div class="single-post-info"></div>

						<!-- Medicine List -->
						<div class="">
							<h3 class="text-center">Information Details</h3>
							<div class="col-md-1"></div>

							<div class="col-md-10 servc-info">
							
							
								<form role="form" id="formInformation" class="form-horizontal" action="medication_doctor_manage" method="post">
									<div class="form-group hide">
									  <input type="text" class="form-control" id="pharmacyDoctorId" name="pharmacyDoctorId" value="${d.pharmacyDoctorId}">
									</div>
									<div class="form-group">
										<label for="pharmacyDoctorName" class="col-md-2 control-label">Name</label>
										<div class="col-md-7">
										<input type="text" class="form-control" id="pharmacyDoctorName" name="pharmacyDoctorName" placeholder="Pharmacy Doctor Name" check-type="required" value="${d.pharmacyDoctorName}">
										</div>
										<div class="clearfix"> </div>
									</div>
									<div class="form-group">
										<label for="pharmacyDoctorAge" class="col-md-2 control-label">Age</label>
										<div class="col-md-7">
										<input type="text" class="form-control" id="pharmacyDoctorAge" name="pharmacyDoctorAge" placeholder="Pharmacy Doctor Age" check-type="number" value="${d.pharmacyDoctorAge}">
										</div>
										<div class="clearfix"> </div>
									</div>
									<div class="form-group">
										<label for="pharmacyDoctorGender" class="col-md-2 control-label">Gender</label>
										<div class="col-md-7">
										<input type="text" class="form-control" id="pharmacyDoctorGender" name="pharmacyDoctorGender" placeholder="Pharmacy Doctor Gender" check-type="required" value="${d.pharmacyDoctorGender}">
										</div>
										<div class="clearfix"> </div>
									</div>
									<div class="form-group">
										<label for="pharmacyDoctorSpecialty" class="col-md-2 control-label">Specialty</label>
										<div class="col-md-7">
										<input type="text" class="form-control" id="pharmacyDoctorSpecialty" name="pharmacyDoctorSpecialty" placeholder="Pharmacy Doctor Specialty" check-type="required" value="${d.pharmacyDoctorSpecialty}">
										</div>
										<div class="clearfix"> </div>
									</div>
									<div class="form-group">
										<label for="pharmacyDoctorTel" class="col-md-2 control-label">Tel</label>
										<div class="col-md-7">
										<input type="text" class="form-control" id="pharmacyDoctorTel" name="pharmacyDoctorTel" placeholder="Pharmacy Doctor Tel" check-type="number" value="${d.pharmacyDoctorTel}">
										</div>
										<div class="clearfix"> </div>
									</div>
									<div class="form-group">
										<label for="pharmacyDoctorPharmacy" class="col-md-2 control-label">Pharmacy</label>
										<div class="col-md-7">
										<input type="text" class="form-control" id="pharmacyDoctorPharmacy" name="pharmacyDoctorPharmacy" placeholder="Pharmacy Doctor Name" check-type="required" value="${d.pharmacyDoctorPharmacy}">
										</div>
										<div class="clearfix"> </div>
									</div>
									<div class="form-group">
										<label for="pharmacyDoctorPharmacyAddress" class="col-md-2 control-label">Pharmacy Address</label>
										<div class="col-md-7">
										<input type="text" class="form-control" id="pharmacyDoctorPharmacyAddress" name="pharmacyDoctorPharmacyAddress" placeholder="Pharmacy Doctor Pharmacy Address" check-type="required" value="${d.pharmacyDoctorPharmacyAddress}">
										</div>
										<div class="clearfix"> </div>
									</div>
									<div class="form-group">
										<label for="pharmacyDoctorDescription" class="col-md-2 control-label">Description</label>
										<div class="col-md-7">
										<textarea  class="form-control" id="pharmacyDoctorDescription" name="pharmacyDoctorDescription" placeholder="Pharmacy Doctor Description" check-type="required" rows="2" >${d.pharmacyDoctorDescription}</textarea>
										</div>
										<div class="clearfix"> </div>
									</div>
									
									
									<!-- 
									
									
									<div class="form-group ">
									  <label for="medicineImage">Upload Medicine Image</label>
									  <input type="File" id="medicineImage1" class="form-control" check-type="required">
									  <p class="help-block">Upload the image of pills or medicine wrappings.</p>
									</div>
									
									
									
									
									
								    Include initial preview count
								    <div class="form-group ">
									  <label for="medicineImage">Upload Medicine Image</label>
									  <input id="input-fcount-1" multiple type="file" class="file-loading" accept="image/*">
									  <p class="help-block">Upload the image of pills or medicine wrappings.</p>
									</div>
								    
								    <script>
								    $("#input-fcount-1").fileinput({
								        uploadUrl: "/file-upload-batch/2",
								        maxFileCount: 4,
								        validateInitialCount: true,
								        overwriteInitial: false,
								        initialPreview: [
								            "<img style='height:160px' src='http://placeimg.com/200/150/nature/1'>",
								            "<img style='height:160px' src='http://placeimg.com/200/150/nature/2'>",
								            "<img style='height:160px' src='http://placeimg.com/200/150/nature/3'>",
								        ],
								        initialPreviewConfig: [
								            {caption: "Nature-1.jpg", width: "120px", url: "/site/file-delete", key: 1},
								            {caption: "Nature-2.jpg", width: "120px", url: "/site/file-delete", key: 2}, 
								            {caption: "Nature-3.jpg", width: "120px", url: "/site/file-delete", key: 3}, 
								        ],
								        allowedFileExtensions: ["jpg", "png", "gif"]
								    });
								    </script>
									
									 -->
									
									
									
									<div class="form-group text-center">
										<button type="submit" class="btn btn-primary" id="submit2">Submit</button>
									</div>
								</form>
								
								<!-- bootstrap validation -->
								
							</div>

							<div class="col-md-1"></div>
							<div class="clearfix"> </div>
						</div>
						<!-- Medicine List End -->
							
						
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