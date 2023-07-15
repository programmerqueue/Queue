<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String s = request.getParameter("uname");
	out.println("welcome is " + s);
	session.setAttribute("user", s);
	%>
	<a href="second.jsp">second page</a>
</body>
</html>