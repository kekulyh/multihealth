<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>MultiHealth:: Mental</title>
<link href="css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
<link href="css/style.css" type="text/css" rel="stylesheet" media="all">
<link rel="stylesheet" href="css/lanrenzhijia.css" type="text/css" />
<!--web-font-->
<link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
<link href='http://fonts.googleapis.com/css?family=Lobster' rel='stylesheet' type='text/css'>
<!--//web-font-->
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
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
						<li><a href="index">Home</a></li>
						<li><a href="music">Music</a>
						<li><a href="register">Sign Up</a></li>
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
				
				<div class="clearfix"> </div>
			</div>	
			<!--//header-->								
		</div>
	</div>					
	<!--header-->
	<!--about-->
	<div class="about"> 
		<div class="container">
			<h3>Soft Music</h3>
			
					<div class="music-player">
  <div class="info">
    <div class="left"> <a href="javascript:;" class="icon-shuffle"></a> <a href="javascript:;" class="icon-heart"></a> </div>
    <div class="center">
      <div class="jp-playlist">
        <ul>
          <li></li>
        </ul>
      </div>
    </div>
    <div class="right"> <a href="javascript:;" class="icon-repeat"></a> <a href="javascript:;" class="icon-share"></a> </div>
    <div class="progress jp-seek-bar"> <span class="jp-play-bar" style="width: 0%"></span> </div>
  </div>
  <div class="controls">
    <div class="current jp-current-time">00:00</div>
    <div class="play-controls"> 
    	<a href="javascript:;" class="icon-previous jp-previous" title="previous"></a> 
        <a href="javascript:;" class="icon-play jp-play" title="play"></a> 
        <a href="javascript:;" class="icon-pause jp-pause" title="pause"></a> 
        <a href="javascript:;" class="icon-next jp-next" title="next"></a> 
     </div>
    <div class="volume-level jp-volume-bar"> 
    	<span class="jp-volume-bar-value" style="width: 0%"></span> 
        	<a href="javascript:;" class="icon-volume-up jp-volume-max" title="max volume"></a> 
            <a href="javascript:;" class="icon-volume-down jp-mute" title="mute"></a> 
    </div>
  </div>
  <div id="jquery_jplayer" class="jp-jplayer"></div>
</div>
<script src="http://www.lanrenzhijia.com/ajaxjs/jquery.min.js"></script>
<script src='js/jquery.jplayer.min.js'></script>
<script src='js/jplayer.playlist.min.js'></script>
<script src="js/lanrenzhijia.js"></script>	
			
		</div><!-- /container -->			
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
		<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
	<!--//smooth-scrolling-of-move-up-->
	<!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="js/bootstrap.js"></script>
</body>
</html>	