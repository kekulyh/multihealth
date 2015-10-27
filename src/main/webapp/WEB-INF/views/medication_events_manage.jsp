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



<!-- Confirm Delete Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" 
   aria-labelledby="myModalLabel" aria-hidden="true">
   <div class="modal-dialog">
      <div class="modal-content">
         <div class="modal-header">
            <button type="button" class="close" 
               data-dismiss="modal" aria-hidden="true">
                  &times;
            </button>
            <h4 class="modal-title" id="myModalLabel">
               Confirmation
            </h4>
         </div>
         <div class="modal-body">
            Are you sure you want to remove this medicine?
         </div>
         <div class="modal-footer">
            <button type="button" class="btn btn-default" 
               data-dismiss="modal">Cancel
            </button>
            <a id="deleteButton" type="button" class="btn btn-primary" >
               Confirm Remove
            </a>
         </div>
      </div><!-- /.modal-content -->
</div><!-- /.modal -->
</div>
<!-- Confirm Delete Modal End -->

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

					</ul>
					 -->
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
							<h3>Manage Events</h3>
						</div>


						<div class="single-post-info"></div>

						<!-- Events List -->
						<div class="">
							
							<div class="col-md-1"></div>

							<div class="col-md-10 servc-info">
								
								<!-- Delete Success message -->
								<div class="alert alert-success alert-dismissable hide" id="deleteSuccess">
		                            <button type="button" class="close" data-dismiss="alert" aria-label="Close">
		                                <span aria-hidden="true">&times;</span>
		                            </button>
		                            <strong>Remove Success!</strong>
		                        </div>
		                        
		                        <script type="text/javascript">
		                            $("#${sessionScope.deleteSuccess}").attr("class","alert alert-success");
		                            //清除session中的属性，刷新页面不会再出现提示message
		                            <%session.removeAttribute("deleteSuccess");%>
		                        </script>
								<!-- Delete Success message end -->
								
								<!-- manage control -->
								<div class="comment-form-wrapper">
									<label><i class="glyphicon glyphicon-plus"></i> <a href="medication_events_add">Add Event</a></label>&nbsp;&nbsp;&nbsp;&nbsp;
									<!-- <label><i class="glyphicon glyphicon-remove"></i> <a href="medication_events_add">Bulk Remove Events</a></label> -->
								</div>
								<!-- manage control end -->
								
								<br>
								
								<div class="panel panel-info" style="height: 300px; overflow: auto">
									<div class="panel-heading">
										<h3 class="panel-title text-center">Events List</h3>
									</div>
									
									<table class="table">
										<thead>
											<tr>
												<th>
												  <label>
												    <input type="checkbox" id="checkkAll" value="checkAll">
												  </label>
												</th>
												<th>Event Title</th>
												<th>Event Editor</th>
												<th>Event Edit Date</th>
												<th class="text-center">Edit</th>
											</tr>
										</thead>
										<tbody>
											<c:forEach var="medicationEventsManageList" items="${medicationEventsManageList}">
												<tr>
													<td>
														<label>
														    <input type="checkbox" name="subcheck" value="${medicationEventsManageList.medicationEventsId}">
														</label>
													</td>
													<td>${medicationEventsManageList.medicationEventsTitle}</td>
													<td>${medicationEventsManageList.medicationEventsEditor}</td>
													<td>${medicationEventsManageList.medicationEventsEditDate}</td>
													<td class="text-center"><i class="glyphicon glyphicon-pencil"></i><a href="<%=request.getContextPath()%>/medication_events_edit?medicationEventsId=${medicationEventsManageList.medicationEventsId}"> Edit</a>&nbsp;&nbsp;&nbsp;&nbsp;<i class="glyphicon glyphicon-remove"></i><a href="javascript:void(0)" onclick="dodel(${medicationEventsManageList.medicationEventsId})" data-toggle="modal" data-target="#myModal" id="modal${medicationEventsManageList.medicationEventsId}"> Remove</a></td>
												</tr>
												
												<script type="text/javascript">
												function dodel(id){
													$(".btn-primary").attr('href','<%=request.getContextPath()%>/medication_events_delete?medicationEventsId='+id);
												}
												</script>
												
												
											</c:forEach>
										</tbody>
									</table>
									
									
									
									<!-- Checkbox Select All function -->
									<script>
								    	$("#checkkAll").click(function() {
							    		  $("input[name='subcheck']").prop("checked", this.checked);
							    		});
							    		
							    		$("input[name='subcheck']").click(function() {
							    		  var $subs = $("input[name='subcheck']");
							    		  $("#checkkAll").prop("checked" , $subs.length == $subs.filter(":checked").length ? true :false);
							    		});
									</script>
									
								</div>
								
								
								
								
								
								
								
								
								
								
								
								
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