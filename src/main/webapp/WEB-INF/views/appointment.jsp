<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>MultiHealth:: Mental</title>
<link href="css/bootstrap.css" type="text/css" rel="stylesheet"
	media="all">
<link href="css/style.css" type="text/css" rel="stylesheet" media="all">
<link href="css/commons.css" type="text/css" rel="stylesheet" media="all">
<!--web-font-->
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800'
	rel='stylesheet' type='text/css'>
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
<link href='http://fonts.googleapis.com/css?family=Lobster'
	rel='stylesheet' type='text/css'>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet" type="text/css" href="css/default.css">

<!--//web-font-->
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Metge Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
	Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //Custom Theme files -->
<!-- js -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
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
<%
  		String msg = (String)request.getAttribute("msg");
  		if(msg != null){
  			out.print("<script>window.alert('"+msg+"');</script>");
  			request.getSession().removeAttribute(msg);
  		}
   %>
<body>
	<!--banner-->
	<div class="banner bnr-text">
		<!--header-->
		<div class="container">
			<div class="header">
				<div class="header-logo">
					<a href="index.jsp"><img src="images/logo.png" alt="logo" /></a>
				</div>
				<div class="top-nav">
					<span class="menu"><img src="images/menu-icon.png" alt="" /></span>
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
				<div class="home-social">
					
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
	<!--header-->
	
	
	
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
					
					<h4>Appointment</h4>
					<ul class="recent-posts">
						<li><a href="gotoapp" >Make An Appointment</a></li>
						<li><a href="userapplist">My Appointments</a></li>

					</ul>
					<h4>Personal Information</h4>
					<ul class="blog-categories">
						<li><a href="personallistcon">My Consultations</a></li>
						<li><a href="consultproblem">Make A Consultation</a></li>
					</ul>
					<h4>News & Events</h4>
					<ul class="blog-categories">
						<li><a href="newslist">Mental Health News</a></li>
					</ul>

				</div>
		
				



				<div class="col-md-9 col-sm-9">
					<div class="blog-post blog-single-post">
					<h3>Make An Appointment</h3>
					<h4>Doctor List</h4>
					<p>
					<form action="upload2" method="post" onsubmit="return on_submit()">

						<table
							class="table table-striped table-bordered bootstrap-datatable datatable responsive">
							<thead>
								<tr>
									<th>Doctor Name</th>
									<th>Date Registered</th>
									<th>Brief Description</th>
									<th>Actions</th>
								</tr>
							</thead>
							<tbody>
								<tr>
								<c:forEach var="doctor" items="${doctors }">
									<td>${doctor.name }</td>
									<td class="center">${doctor.registerData }</td>
									<td class="center">${doctor.brief }</td>

									<td class="center"><a class="btn btn-success" href="<%=request.getContextPath() %>/view?did=${doctor.id}">
											<i class="glyphicon glyphicon-zoom-in icon-white"></i> View
									</a> <a class="btn btn-info" href="<%=request.getContextPath() %>/reserve?did=${doctor.id}"> <i
											class="glyphicon glyphicon-edit icon-white"></i> Reserve
									</a> </td>
								
								</tr>
								</c:forEach>
								<tr>
							</tbody>
						</table>

					
					</form>
					</p>
</div>
				</div>
				<div class="clearfix"></div>
		
</div>

		</div>
		<!-- /container -->
	</div>
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
	<a href="#" id="toTop" style="display: block;"> <span
		id="toTopHover" style="opacity: 1;"> </span></a>
	<!--//smooth-scrolling-of-move-up-->
	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="js/bootstrap.js"></script>
</body>
</html>
