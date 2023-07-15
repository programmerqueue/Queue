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
	out.println("Welcome :" + s);
	ServletContext context = getServletContext();
	String driver = context.getInitParameter("dname1");
	out.println("driver is :" + driver);
	%>
</body>
</html>