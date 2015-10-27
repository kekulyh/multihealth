<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>MultiHealth:: Mental</title>
<link href="css/bootstrap.css" type="text/css" rel="stylesheet"
	media="all">
<link href="css/style.css" type="text/css" rel="stylesheet" media="all">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
</head>
<!--web-font-->
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800'
	rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Lobster' rel='stylesheet' type='text/css'>
<link href="css/commons.css" type="text/css" rel="stylesheet" media="all">
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
<!--//end-smoth-scrolling-->
</head>
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
						<li><a href="index.jsp">Home</a></li>
						<li><a href="about.jsp">About</a></li>
						<li><a href="services.jsp">Services</a></li>
						<li><a href="news.jsp">News</a></li>
						<li><a href="contact.jsp" class="active">Contact</a></li>
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
				<div class="clearfix"></div>
			</div>
			<!--//header-->
		</div>
	</div>
	<!--header-->
	<!--contact-->
	
	<div class="section">
		<div class="container">
		
			<div class="row">
		
		<div class="col-md-3 col-sm-3 blog-sidebar">
		<div class="blog-post blog-single-post">
					<h4>Search a Medicine</h4>
										
					<!-- Search Medicine SideBar -->
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
					<!-- Search Medicine SideBar End -->
					
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
						<li><a href="#">Medical Events</a></li>

					</ul>

				</div>
		
		</div>
		<div class="col-md-9 col-sm-9">
		<div class="blog-post blog-single-post">
			<h1>Consult Contents</h1>
			<div class="contact-form">
				<form action="consultlist">
					<input type="text" value="${con.title }" name="title"
						readonly="readonly">


					<textarea type="text" name="contents" readonly="readonly">${con.contents }</textarea>
					<input type="text" value="${con.cdate }" name="cdate"
						readonly="readonly"> <input type="text"
						value="${con.anonymous  }" name="cdate" readonly="readonly">

					<input type="submit" value="Return">
				</form>
				<br />
				
				


				
			

<c:forEach var="comm" items="${list }">

					

						<div class="post-comments">

							<div class="comment-wrapper">
								<div class="comment-author">
									<img src="${ comm.user.attachment}" alt="User Pic">${comm.user.name }
								</div>
								<div class="comment-action">
									<div class="panel panel-default">
										<div class="panel-body">
										${comm.commconcents }</div>
									</div>
									<div align="right">
										<span class="comment-date">${comm.commdate}</span> <a herf="#"
											class="btn btn-info btn-xs comment-reply-btn" role="button"
											data-toggle="collapse" data-target="#collapseExample"
											aria-expanded="false" aria-controls="collapseExample"> <i
											class="glyphicon glyphicon-share-alt"></i>Reply
										</a>
									</div>
									<div class="collapse" >
													<div class="well">
												  		
												  		<form role="form" action="medication_medicine_single" method="post">
															<div class="form-group">
																<input class="hidden" name="medicineId" value="${m.medicineId}"/>
																<input class="hidden" name="medicineCommentId" value="${comment.medicineCommentId}"/>
															</div>
															
															<div class="form-group">
																<label for="comment-message"><i class="glyphicon glyphicon-comment"></i> <b>Reply</b></label>
																<textarea class="form-control" rows="3" id="comment-message" name="comment-message"></textarea>
															</div>
															<div class="form-group">
																<button type="submit" class="btn btn-primary pull-right">Send</button>
															</div>
															<div class="clearfix"></div>
														</form>
														
												  	</div>
												</div>
								</div>
							</div>

						</div>

					
</c:forEach>
</div>



</div>

						<div class="post-coments">
							<h4>Comments (NUm)</h4>
							<ul class="post-comments">
								
								<c:forEach var="comm" items="${list }">
									<li>
										<div class="comment-wrapper">
											<div class="comment-author"><img src="${ comm.user.attachment}" alt="User Pic"> ${comm.user.name}</div>
											<div class="panel panel-default">
												<div class="panel-body">
													${comm.commconcents }
												</div>
											</div>
											
											<!-- Comment Controls -->
											<div class="comment-actions">
												<span class="comment-date">${comm.commdate}</span>
												
												<!-- collapse reply button -->
												<a class="btn btn-primary" role="button" data-toggle="collapse" href="#" aria-expanded="false" aria-controls="collapseExample">
 <i class="glyphicon glyphicon-share-alt"></i> Reply 
</a>
													
											
												<div class="collapse" id="collapseExample">
													<div class="well">
												  		
												  		<form role="form" action="medication_medicine_single" method="post">
															<div class="form-group">
																<input class="hidden" name="medicineId" value="${m.medicineId}"/>
																<input class="hidden" name="medicineCommentId" value="${comment.medicineCommentId}"/>
															</div>
															
															<div class="form-group">
																<label for="comment-message"><i class="glyphicon glyphicon-comment"></i> <b>Reply</b></label>
																<textarea class="form-control" rows="3" id="comment-message" name="comment-message"></textarea>
															</div>
															<div class="form-group">
																<button type="submit" class="btn btn-primary pull-right">Send</button>
															</div>
															<div class="clearfix"></div>
														</form>
														
												  	</div>
												</div>
												<!-- collapse reply button end -->
												
											</div>
											<!-- Comment Controls end -->
											
										</div>
									</li>
								</c:forEach>
								
							</ul>
							
							
							
							
							
						<h4>Leave a Comment</h4>
							<div class="comment-form-wrapper">
								<form role="form" action="medication_medicine_single" method="post">
									<div class="form-group">
										<input class="hidden" name="medicineId" value="${m.medicineId}"/>
									</div>
									
									<div class="form-group">
										<label for="comment-message"><i class="glyphicon glyphicon-comment"></i> <b>Your Message</b></label>
										<textarea class="form-control" rows="5" id="comment-message" name="comment-message"></textarea>
									</div>
									<div class="form-group">
										<button type="submit" class="btn btn-primary pull-right">Send</button>
									</div>
									<div class="clearfix"></div>
								</form>
							</div>
							<!-- End Comment Form -->
						</div>
						<div align="center">
						<ul class="pagination pagination-centered" >


										<li ><a href="viewcondetail?cpage=${cpage-1}">Prev</a> <a
											href="viewcondetail?cpage=1&state=1">1</a>
										</td>
										<a href="viewcondetail?cpage=2&state=1">2</a>
										<a href="viewcondetail?cpage=3&state=1">3</a>
										<a href="#">4</a>
										<a href="viewcondetail?cpage=${cpage+1}">Next</a>
										</li>
									</ul></div>
						
				
				<div class="modal" id="mymodal">
					<div class="modal-dialog">
						<div class="modal-content">
							
								<button type="button" class="close" data-dismiss="modal">
									<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
								</button>
								<form action="addconcomm1" method="post" id="form1" name="form1">
								<input type="text" readonly="readonly" name="reptitle" id="reptitle">
							
							<div class="modal-body">
								
									<div class="clearfix"></div>
									<textarea type="text" name="concommsrep"
										onFocus="this.value = '' ;"
										onBlur="if (this.value == '') {this.value = 'Message...';}"
										required=""> Message... </textarea>



									<div class="modal-footer">
										<button type="button" class="btn btn-default"
											data-dismiss="modal">Close</button>
										<button type="submit" class="btn btn-primary">Save</button>
								
							</div>
						</div>
						</form>
					</div>

					<!-- /.modal-content -->
					
				</div>
				<!-- /.modal-dialog -->
			</div>
			<!-- /.modal -->
			
			<br />

			
		</div>
		</div>
		
	</div>
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

			$().UItoTop({
				easingType : 'easeOutQuart'
			});

		});
	</script>
	<a href="#" id="toTop" style="display: block;"> <span
		id="toTopHover" style="opacity: 1;"> </span></a>
	<!--//smooth-scrolling-of-move-up-->
	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="js/bootstrap.js"></script>
	<script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>
	<script
		src="http://cdn.bootcss.com/bootstrap/2.3.1/js/bootstrap-transition.js"></script>
	<script
		src="http://cdn.bootcss.com/bootstrap/2.3.1/js/bootstrap-modal.js"></script>
	<script>
		$(function() {
			$(".btn").click(function() {
				$("#mymodal").modal("toggle");
			});
		});
	</script>
</body>
</html>
