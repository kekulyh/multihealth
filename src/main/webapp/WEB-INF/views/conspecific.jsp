<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>MultiHealth:: Mental</title>
<link href="css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
<link href="css/style.css" type="text/css" rel="stylesheet" media="all">
<!--web-font-->
<link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Lobster' rel='stylesheet' type='text/css'>
<link href="css/commons.css" type="text/css" rel="stylesheet" media="all">
<!--//web-font-->
<!-- Custom Theme files -->

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
					<a href="index.jsp"><img src="images/logo.png" alt="logo"/></a>
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
				<!-- End Sidebar -->


<!-- Content -->
				<div class="col-md-9 col-sm-9">
					<div class="blog-post blog-single-post">

						<!-- Title -->
						<div class="text-center">
							<h3>MentalHealth Consulation</h3>
						</div>

						<div class="single-post-info"></div>

						<!-- Medicine Detail -->
						<div>
							<h4>Consult Content</h4>
							<br>
							

							<div id="myTabContent" class="tab-content">
								
									<p class="text-center"><strong>${con.title }</strong></p>

								<div class="post-coments">
									
									<ul class="post-comments">

										<div class="comment-wrapper">
											<div class="comment-author">
												<img src="${ con.user.attachment}" alt="User Pic">
												${con.anonymous  }
											</div>
											<div class="panel panel-default">
												<div class="panel-body">${con.contents }</div>
											</div>

											<!-- Comment Controls -->
											<div class="comment-actions">
												<span class="comment-date">${con.cdate}</span>
                                            </div>
                                           </div>
                                           </ul>
                                           </div>
                                           </div>

										</div>
										<!-- Medicine Detail End -->
										<div class="single-post-info"></div>


<c:forEach var="comm" items="${docconlist }">
								<div id="myTabContent" class="tab-content">
								
								<div class="post-coments">
									
									<ul class="post-comments">

										<div class="comment-wrapper">
											<div class="comment-author">
												<img src="${ comm.doctor.attachment}" alt="User Pic">
												${comm.doctor.name }
											</div>
											<div class="panel panel-default">
												<div class="panel-body">${comm.doccomms }</div>
											</div>

											<!-- Comment Controls -->
											<div class="comment-actions">
												<span class="comment-date">${comm.doccondate}</span>
                                            </div>
                                           </div>
                                           </ul>
                                           </div>
                                           </div>


</c:forEach>


										<!-- Comments -->
										<div class="post-coments">
											<h4>Comments (${count})</h4>
											
											<ul class="post-comments">
<br>
												<c:forEach var="comm" items="${list }">
													<li>
														<div class="comment-wrapper">
															<div class="comment-author">
																<img src="${ comm.user.attachment}" alt="User Pic">
																${comm.user.name}
															</div>
															<div class="panel panel-default">
																<div class="panel-body">${comm.commconcents }</div>
															</div>

															<!-- Comment Controls -->
															<div class="comment-actions">
																<span class="comment-date">${comm.commdate}</span>

																<!-- collapse reply button -->
																<a class="btn btn-info btn-xs comment-reply-btn"
																	role="button" data-toggle="collapse"
																	href="#collapse${comm.id}" aria-expanded="false"
																	aria-controls="collapse"> <i
																	class="glyphicon glyphicon-share-alt"></i> Reply
																</a>
																<div class="collapse" id="collapse${comm.id}">
																	<div class="well">

																		<form role="form"
																			action="<%=request.getContextPath() %>/addconcomm1?commid=${comm.id}"
																			method="post">

																			<div class="form-group">
																				<label for="comment-message"><i
																					class="glyphicon glyphicon-comment"></i> </label>
																				<textarea class="form-control" rows="3"
																					id="concommsrep" name="concommsrep"></textarea>
																			</div>
																			<div class="form-group">
																				<button type="submit"
																					class="btn btn-primary pull-right">Send</button>
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
														href="viewcondetail?cpage=${cpage-1}">Previous</a></li>
													<li class="active"><a href="#">1</a></li>
													<li><a href="#">2</a></li>
													<li><a href="#">3</a></li>
													<li><a href="#">4</a></li>
													<li><a href="#">5</a></li>
													<li><a href="viewcondetail?cpage=${cpage+1}">Next</a></li>
												</ul>
											</div>
											<!-- Pagination end -->

											<!-- Comments Form -->
											<h4>Leave a Comment</h4>
											<div class="comment-form-wrapper">
												<form role="form" action="addconcomm"
													method="post">
													

													<div class="form-group">
														<label for="comment-message"><i
															class="glyphicon glyphicon-comment"></i> <b>Your
																Message</b></label>
														<textarea class="form-control" rows="5"
															id="concomms" name="concomms"></textarea>
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
				<!-- Content End -->
			</div>
		</div>
	</div>
	<!-- Body End -->












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