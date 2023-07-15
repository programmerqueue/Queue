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
	out.println("Welcome s :" + s);
	ServletConfig config1 = getServletConfig();
	String driver = config1.getInitParameter("name");
	out.println("driver name is :" + driver);
	%>
</body>
</html>