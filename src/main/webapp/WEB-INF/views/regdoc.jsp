<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Metge a Medical Category Flat bootstrap Responsive
	website Template | About :: w3layouts</title>
<link href="css/bootstrap.css" type="text/css" rel="stylesheet"
	media="all">
<link href="css/style.css" type="text/css" rel="stylesheet" media="all">
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
<script type="application/x-javascript">
	
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 

</script>
<!-- //Custom Theme files -->
<!-- js -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="js/modernizr.custom.63321.js"></script>
<!-- //js -->
<!-- start-smoth-scrolling-->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
<script type="text/javascript" src="js/bootstrap3-validation.js"></script>
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event) {
			event.preventDefault();
			$('html,body').animate({
				scrollTop : $(this.hash).offset().top
			}, 1000);
		});
	});
</script>






<script type="text/javascript">
	$(function() {
		//1. 简单写法：
		$("#form1").validation({
			icon : true
		});
		
		//.注册
		$("#submit1").on('click', function(event) {
			// 2.最后要调用 valid()方法。
			//  valide(object,msg),提示信息显示，object位置后面增加提示信息。如不填object 则自动找最后一个button submit.
			//  valide(msg)

			//第一种提示写法
			if ($("#form1").valid(this, 'Content Error!') == false) {
				return false;
			}

			//第二种提示写法，回调方法你自己提示就随意你了。
			//if ($("#form1").valid(this,function(err){alert(err)})==false){
			//  return false;
			//}

		})
		$("#form2").validation();
		//.注册
		$("#submit2").on('click', function(event) {
			// 2.最后要调用 valid()方法。
			if ($("#form2").valid() == false) {
				alert('填写信息不完整。');
				return false;
			}
		});

	})
</script>
<style>
.error {
	color: #ff0000;
	font-weight: bold;
}
</style>
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
						<li><a href="index">Home</a></li>
						<li><a href="music">Music</a>

							<li><div class="dropdown" >
								<a id="dLabel" data-target="#" 
									data-toggle="dropdown" role="button" aria-haspopup="true"
									aria-expanded="false"> Sign Up <span class="caret"></span>
								</a>

								
							<ul class="dropdown-menu" aria-labelledby="dLabel" style="background: rgba(0, 0, 0, 0)">
								
								<li><a href="register" style="outline-color: black;">User</a></li>
								<li><a href="registerdoc">Doctor</a></li>
								</ul>
							</div>
							</li>
						
						<li><a href="newslist">News</a></li>

					</ul>

					<!-- script-for-menu -->
					<script>
						$("span.menu").click(function() {
							$("ul.nav1").slideToggle(300, function() {
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
	<!--about-->
	<div class="about">
		<div class="container">
			<h3>Doctor Register</h3>
			<div class="about-text">
				<div class="container">

					<form class="form-horizontal" id="form1" action="${pageContext.request.contextPath}/upload" role="form" enctype="multipart/form-data" method="post">

					 

						<div class="form-group">
							<label for="name" class="col-sm-4 control-label">Username</label>
							<div class="col-sm-6">
								<input type="text" class="form-control" id="name"
									check-type="required" required-message="Please enter your name"
									name="name">
							</div>
						</div>

						<div class="form-group">
							<label for="name" class="col-sm-4 control-label">Tel</label>
							<div class="col-sm-6">
								<input type="text" class="form-control" id="name"
									check-type="mobile" name="tel">
							</div>
						</div>
						<div class="form-group">
							<label for="mail" class="col-sm-4 control-label">Email</label>
							<div class="col-sm-6">
								<input type="text" class="form-control" id="mail"
									check-type="mail required" name="email">
							</div>

						</div>


						<div class="form-group">
							<label for="pw1" class="col-sm-4 control-label" >Password</label>
							<div class="col-sm-6">
								<input type="password" class="form-control" id="pw1"
									check-type="required" minlength="6" name="password">
							</div>
						</div>
						<div class="form-group">
							<label for="vercode" class="col-sm-4 control-label">Brief Description</label>
							<div class="col-sm-6">
								<textarea class="form-control" id="vercode"
									check-type="required" rows="3" name="brief"></textarea>

							</div>
						</div>
						<div class="form-group">
							<label for="vercode" class="col-sm-4 control-label">Degree</label>
							<div class="col-sm-6">
								<textarea class="form-control" id="vercode"
									check-type="required" rows="3" name="degree"></textarea>

							</div>
						</div>
						<div class="form-group">
							<label for="vercode" class="col-sm-4 control-label">Description</label>
							<div class="col-sm-6">
								<textarea class="form-control" id="vercode"
									check-type="required" rows="3" name="description"></textarea>

							</div>
						</div>
						<div class="form-group ">
							<label for="exampleInputFile" class="col-sm-4 control-label">Upload
								The Photo</label>

							<div class="col-md-6 col-sm-6">
								<input type="file" id="exampleInputFile" class="form-control"
									check-type="required" name="myfile">
							</div>
						</div>
<br><br>
						<div class="form-group">
							<div class="col-sm-offset-5 col-sm-5">
								<div align="center">
									<button type="submit" id="submit1"
										class="btn btn-primary col-sm-3">Submit</button>
									&nbsp;&nbsp;
									<button type="reset" class="btn btn-primary col-sm-3">Reset</button>
								</div>
							</div>
						</div>

					</form>
				</div>









			


			</div>

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
</body>
</html>
