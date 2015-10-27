<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="js/bootstrap.js"></script>
<link href="css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
<link href="css/style.css" type="text/css" rel="stylesheet" media="all">
</head>
<body>
	<form action="${pageContext.request.contextPath}/upload2"  method="post" enctype="multipart/form-data">

 						  <div class="alert alert-danger alert-dismissable hide" id="usernameExist">
                            <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                            <strong>ERROR! Your username has been registered. Please change a username.</strong>
                        </div>
                        <script type="text/javascript">
                        
                            $("#${alertRegister}").attr("class","alert alert-danger");
                            window.alert("${alertRegister}");
                        </script>
					 
					
					 <div class="form-group">
                            <label for="register-username"><i class="icon-user"></i> <b>Username</b></label>
                            <input class="form-control" id="register-username" type="text" placeholder="Username" name="register-username">
                        </div>

								
										
						
						
                        <input id="file-4" type="file" class="file"  name="thefile" >
                    
                        <button class="btn btn-success" type="submit">Submit</button>
					
				
				
				
				</form>
</body>
</html>