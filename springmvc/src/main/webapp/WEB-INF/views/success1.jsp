<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>${demo }</h2>
	<p>${desc }</p>
	<hr>
	<h2>User_email:${user.email }</h2>
	<h2>User_name:${user.userName }</h2>
	<h2>User_password:${user.password }</h2>

</body>
</html>