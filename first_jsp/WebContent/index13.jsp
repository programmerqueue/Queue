<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="amount" scope="session" value="${20000*5}" />
	<p>
		Before Remove Value is:
		<c:out value="${amount}" />
	</p>
	<c:remove var="amount" />
	<p>
		After Remove Value is:
		<c:out value="${amount}" />
	</p>
</body>
</html>