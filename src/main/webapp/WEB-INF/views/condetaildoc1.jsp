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
<link href='http://fonts.googleapis.com/css?family=Lobster'
	rel='stylesheet' type='text/css'>
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
						
						
						<li><a href="newslist">News</a></li>
						<li><a href="personallistcon">Personal Information</a></li>
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
	<!--contact-->
	<div class="contact">
		<div class="container">
			<h3>Consult Contents</h3>
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
				
				


				<div class="about-text">
				<h2>Doctor Said</h2>
				<c:forEach var="comm" items="${docconlist }">
							<table class="table">
								<tbody>
									<tr>
										<td width="200px"><div class="col-sm-4">
												<img class="img-circle" alt="40x40"
													src="${ comm.doctor.attachment}" width="140px" height="150px">
												<em >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${comm.doctor.name }&nbsp;${comm.doccondate}</em>
								
											</div></td>
										<td><textarea type="text" name="concomms"
												readonly="readonly" rows="100"> ${comm.doccomms } </textarea></td>
									</tr>
									
									
									

									
									
									<!-- <ul class="pager">
											<li><a href="viewcondetail?cpage=${cpage-1}">&laquo;Prev</a>
											<a href="viewcondetail?cpage=${cpage+1}">Next&raquo;</a></li>
										</ul>-->
								


								</tbody>
							</table>

						</c:forEach>
						
						
						
						
				<h2>Other Users' Reply</h2>
					
						<br />
						<c:forEach var="comm" items="${list }">
							<table class="table">
								<tbody>
									<tr>
										<td width="200px"><div class="col-sm-4">
												<img class="img-circle" alt="40x40"
													src="${ comm.user.attachment}" width="140px" height="150px">
												<em >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${comm.user.name }&nbsp;${comm.commdate}</em>
								
											</div></td>
										<td><textarea type="text" name="concomms"
												readonly="readonly" rows="100"> ${comm.commconcents } </textarea></td>
									</tr>
									<tr>
									<td></td>
									<td><button class="btn btn-primary" type="button"
										onclick="commid1()">Replay</button></td>
									</tr>
									<input type="hidden" value="${comm.user.name }" name="commname"
										id="commname">
									
									

									
									
									<!-- <ul class="pager">
											<li><a href="viewcondetail?cpage=${cpage-1}">&laquo;Prev</a>
											<a href="viewcondetail?cpage=${cpage+1}">Next&raquo;</a></li>
										</ul>-->
								


								</tbody>
							</table>

						</c:forEach>
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

			<h2>Do You Want To Solve This Problem</h2>
			
			<form action="adddoccomm" method="post">
				<div class="clearfix"></div>
				<textarea type="text" name="docconcomms" onFocus="this.value = '' ;"
					onBlur="if (this.value == '') {this.value = 'Message...';}"
					required=""> Message... </textarea>
					<input type="submit" value="Submit">
				

			</form>
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
