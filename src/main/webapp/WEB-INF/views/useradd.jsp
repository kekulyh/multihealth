<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add a user on this page</title>
<script language="javascript">
	function addComponent(){
		var uploadHtml = document.createElement("<input type='file' name='myfile'/>");
		document.getElementById("files").appendChild(uploadHtml);
		uploadHtml = document.createElement("<p/>");
		document.getElementById("files").appendChild(uploadHtml);
		
	}
</script>
</head>
<body>
	<form action="useradd" method="post" enctype="multipart/form-data">
	Name:<input type="text" name="name"/></br>
	Password:<input type="password" name="password"/></br>
	Tel:<input type="text" name="tel"/></br>
	Email:<input type="text" name="email"/></br>
	<span id="files"><input type="file" name="myfile" /></span>
	
	<input type="submit" value="Add"/>
	</form>

</body>
</html>