<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${doctors}" var="list">
 	<c:out value="${list.name }"/> 
 	<i><c:out value="${list.description}"/></i>
 	<c:out value="${list.registerData}"/> 
 	
 	<br><br>
 </c:forEach>
</body>
</html>