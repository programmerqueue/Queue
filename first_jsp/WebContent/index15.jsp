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
	<c:set var="income" scope="session" value="${4000*5}"></c:set>
	<c:if test="${income>8000}">
		<p>
			My income is :
			<c:out value="${income}"></c:out>
	</c:if>
</body>
</html>