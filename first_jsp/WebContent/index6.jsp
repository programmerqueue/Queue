<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="obj" class="com.demo.Calculator"
		class="com.demo.Calculator" type="com.demo.Calculator">
	</jsp:useBean>
	<%
	int m = obj.cube(3);
	out.println("Cube is :" + m);
	%>
</body>
</html>