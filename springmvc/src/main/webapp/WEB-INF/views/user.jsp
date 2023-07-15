<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>help page</title>
</head>
<body>
	<h1>This is user page</h1>
	<h1>Called by help controller</h1>
	<h1>url/help</h1>
	<%
	/* String name = (String) request.getAttribute("Name");
	Integer rollno = (Integer) request.getAttribute("RollNo");  */
	/* LocalDateTime time = (LocalDateTime) request.getAttribute("time");  */
	%>
	<h1>
		Name is ${Name}
		<%-- <%=name%> --%>
	</h1>
	<h1>
		Roll_No is ${RollNo}
		<%-- <%=rollno%> --%>
	</h1>
	<h1>

		Date and Time is ${time}
		<%-- <%=time.toString()%> --%>
	</h1>
	<hr>
	<c:forEach var="item" items="${No}">
		<h1>${item}</h1>
	</c:forEach>

</body>
</html>