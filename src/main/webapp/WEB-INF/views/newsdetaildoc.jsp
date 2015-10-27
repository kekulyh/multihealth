<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>MultiHealth:: Mental</title>
<link href="css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
<link href="css/style.css" type="text/css" rel="stylesheet" media="all">
<link href="css/commons.css" type="text/css" rel="stylesheet" media="all">
</head>
<!--web-font-->
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800'
	rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Lobster'
	rel='stylesheet' type='text/css'>
<!--//web-font-->
<!-- Custom Theme files -->

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
		function commid1(){
			 var cname = document.getElementById("commname").value;
			
			 document.getElementById("reptitle").value = "Reply To:"+cname;
			 
		}
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
						<li><a href="index2" class="active">Home</a></li>
						
						<li><a href="solveconsult">User's Consultation</a></li>
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
	<!--contact-->

	<div class="contact">
		<div class="container">
			<div class="row">

				<div class="col-md-4 about-text-left">
					<img src="${news.newsimg }" class="img-responsive" /> <em>${news.imgdescp }</em>
				</div>

				<div class="col-md-8 about-text-right">
					<h4>${news.title }</h4>

					<form action="addtimetable" method="post"
						enctype="multipart/form-data" onsubmit="return on_submit()">
						<p class="text-justify">
							<strong>${news.breiefdescription }</strong>
						</p>
						<p class="text-justify">${news.contents }</p>
						<p class="text-right">${news.ndate }</p>
						<button class="btn btn-success" type="submit">Return</button>
					</form>
				</div>
				<div class="col-md-12 col-sm-12">
					<div class="blog-post blog-single-post">
						<!-- Comments -->
						<div class="post-coments">
							<h4>Comments (${total})</h4>

							<ul class="post-comments">
								<br>
								<c:forEach var="comm" items="${nlist }">
									<li>
										<div class="comment-wrapper">
											<div class="comment-author">
												<img src="${ comm.user.attachment}" alt="User Pic">
												${comm.user.name}
											</div>
											<div class="panel panel-default">
												<div class="panel-body">${comm.commcontents }</div>
											</div>

											<!-- Comment Controls -->
											<div class="comment-actions">
												<span class="comment-date">${comm.ncdate}</span>

												<!-- collapse reply button -->
												<a class="btn btn-info btn-xs comment-reply-btn"
													role="button" data-toggle="collapse"
													href="#collapse${comm.id}" aria-expanded="false"
													aria-controls="collapse"> <i class="glyphicon glyphicon-share-alt"></i> Reply
												</a>
												<div class="collapse" id="collapse${comm.id}">
													<div class="well">

														<form role="form"
															action="<%=request.getContextPath() %>/addnewcomm1?commid=${comm.id}"
															method="post">

															<div class="form-group">
																<label for="comment-message"><i
																	class="glyphicon glyphicon-comment"></i> </label>
																<textarea class="form-control" rows="3" id="newscommsrep"
																	name="newscommsrep"></textarea>
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
							<!-- Pagination -->
							<div class="pagination-wrapper ">
								<ul class="pagination pagination-sm">
									<li class="disabled"><a
										href="viewnewsmore?cpage=${cpage-1}">Previous</a></li>
									
									<li><a href="#">${cpage }</a></li>
									<li><a href="viewnewsmore?cpage=${cpage+1}">Next</a></li>
								</ul>
							</div>
							<!-- Pagination end -->

							<!-- Comments Form -->
							<h4>Leave a Comment</h4>
							<div class="comment-form-wrapper">
								<form role="form" action="addnewscomm" method="post">


									<div class="form-group">
										<label for="comment-message"><i
											class="glyphicon glyphicon-comment"></i> <b>Your Message</b></label>
										<textarea class="form-control" rows="5" id="concomms"
											name="newscomms"></textarea>
									</div>
									<div class="form-group">
										<button type="submit" class="btn btn-primary pull-right">Send</button>
									</div>
									<div class="clearfix"></div>
								</form>
							</div>
							<!-- End Comment Form -->
						</div>
						<!-- End Comments -->
						<div class="single-post-info"></div>
					</div>



				</div>
			</div>
			<!-- Commons end -->
			
			
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
