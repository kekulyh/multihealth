<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">
var xmlhttp;  

function ajaxfun()  
{  
      
    if (window.XMLHttpRequest)  
      {// code for IE7+, Firefox, Chrome, Opera, Safari  
      xmlhttp=new XMLHttpRequest();  
      }  
    else  
      {// code for IE6, IE5  
      xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");  
      }  
    return xmlhttp;  
}  
  
window.onload=function()  
{  
      
    document.getElementById("username1").onblur=function()  
    {  
        var name=document.getElementsByName("username")[0].value;  
        xmlhttp=ajaxfun();  
        xmlhttp.onreadystatechange=check;  
        //xmlhttp.open("get","http://localhost:8080/ajaxtest/AjaxServlet?username="+name+"&time="+new Date().toTimeString(),true);  
        //以下是get方法传值  
        /*xmlhttp.open("get","./AjaxServlet?username="+name+"&time="+new Date().toTimeString(),true);  
        xmlhttp.send(null);*/  
          
        /*  
         * 如果需要像 HTML 表单那样使用 POST 传递数据，请使用 setRequestHeader() 来添加 HTTP 头。  
         * 然后在 send() 方法中规定您希望发送的数据：  
         */  
        xmlhttp.open("post","./AjaxServlet?username="+name+"&time="+new Date().toTimeString(),true);  
        xmlhttp.setRequestHeader("Content-Type","application/x-www-form-urlencoded")  
        xmlhttp.send("a=100&b=222");  
          
    }  
      
}  
function check()  
{  
    alert(xmlhttp.status);  
    if(xmlhttp.readyState==4 && xmlhttp.status==200)  
    {  
        alert(xmlhttp.status);  
        document.getElementById("span").innerHTML=xmlhttp.responseText;  
    }  
}  
</script> 
<body>
<form action="/ajaxtest/RegisteServlet" method="get">  
   name:<input type="text" name="username" id="username1"/><span id="span"></span><br>  
 pwd:<input type="password" name="userpass"/><br>  
 pwd1:<input type="password" name="userpass2"/><br>  
 <input type="submit" value="submit"/>  
    
  <input type="button" name="username" id="username1" value="click"/>  
  </form>
</body>
</html>