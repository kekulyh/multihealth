<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Metge a Medical Category Flat bootstrap Responsive website Template | About :: w3layouts</title>
<link href="css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
<link href="css/style.css" type="text/css" rel="stylesheet" media="all">
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
					<a href="index.jsp"><img src="images/logo.png" alt="logo" /></a>
				</div>
				<div class="top-nav">
					<span class="menu"><img src="images/menu-icon.png" alt="" /></span>
					<ul class="nav1">
						<li><a href="index.jsp">Home</a></li>
						<li><a href="about.jsp" class="active">About</a></li>
						<li><a href="services.jsp">Services</a></li>
						<li><a href="news.jsp">News</a></li>
						<li><a href="contact.jsp">Contact</a></li>
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
	<!--about-->
	<div class="about">
		<div class="container">

			<div class="about-text">
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
				
			</div>
		
		
		
		
                    <c:forEach var="comm" items="${nlist }">
				<table  class="table">
				<tbody>
				<tr>
					<textarea type="text" readonly="readonly"> ${comm.commcontents } </textarea>
					<input type="text" value="${comm.user.name }" readonly="readonly">
					<input type="text" value="${comm.ncdate }" readonly="readonly">
					<input type="hidden" value="${comm.user.name }" name="commname" id="commname">
				</tr>
				<tr>
					<button class="btn btn-primary" type="button" onclick="commid1()" >Replay</button>
				</tr>
				</tbody>
				</table>	
				
				</c:forEach>
                    
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
                    <ul class="pagination pagination-centered">
                        <li><a href="viewnewsmore?cpage=${cpage-1}">Prev</a></li>
                        <li class="active">
                            <a href="#">1</a>
                        </li>
                        <li><a href="#">2</a></li>
                        <li><a href="#">3</a></li>
                        <li><a href="#">4</a></li>
                        <li><a href="viewnewsmore?cpage=${cpage-1}">Next</a></li>
                    </ul>
                
		
		
		
		
			<div class="contact">
		<div class="container">
			<h2>Want to say something?</h2>			
			<div class="contact-form">
				<form action="addnewscomm" method="post">
					
					<div class="clearfix"> </div>
					<textarea type="text" onFocus="this.value = '' ;" onBlur="if (this.value == '') {this.value = 'Message...';}" required="" name="newscomms"> Message... </textarea>
					<input type="submit" value="Submit">
				</form>
			</div>
			<div class="contact-grids">
				
			</div> 
		</div>
	</div>
			
		
		</div>
		<!-- /container -->
	</div>
	<!--footer-->
	<div class="footer"> 
		<div class="footer-text">
			<div class="container">
				<h3>Get in touch</h3>
				<p>Blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident.</p>
			</div>
		</div>	
		<div class="map">
			<iframe src="https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d492961.1701893511!2d77.26071847271531!3d15.144106478541513!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1sen!2sin!4v1432977452715" style="border:0"></iframe>
		</div>
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
				<p>Copyright © 2015 Metge. All rights reserved | Design by <a href="http://w3layouts.com">W3layouts</a></p>
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