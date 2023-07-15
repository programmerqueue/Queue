<%@page import="com.aijaz.pojo.Person"%>
<%@page import="java.util.List"%>
<%@page import="com.aijaz.daoImpl.RegisterDaoImpl"%>
<%@page import="com.aijaz.dao.RegisterDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>Register Form</h1>
		<form action="RegisterController" method="post">
			<table border="1">
				<tr>
					<td>PersonId</td>
					<td><input type="text" name="pid" id="pid" disabled=true ></td>
				</tr>
				<tr>
					<td>FirstName</td>
					<td><input type="text" name="fName" id="fName"></td>
				</tr>
				<tr>
					<td>LastName</td>
					<td><input type="text" name="lName" id="lName"></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="address" id="address"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" id="submit" name="submit"></td>
				</tr>
			</table>
		</form>
	</div>
	<br>
	<hr>
	<table align="center" border="1">
		<tr>
			<th>personId</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Address</th>
			<th>Action</th>
		</tr>
		<%
		RegisterDao rdao = new RegisterDaoImpl();
		List<Person> list = rdao.getAllPerson();
		for (Person p : list) {
		%>
		<tr>
			<td><%=p.getPersonId()%></td>
			<td><%=p.getFirstName()%></td>
			<td><%=p.getLastName()%></td>
			<td><%=p.getAddress()%></td>
			<td><button onclick="myFunction(<%=p.getPersonId()%>,'<%=p.getFirstName()%>','<%=p.getLastName()%>','<%=p.getAddress()%>')">Update</button>
			<a href="RegisterController?personId=<%=p.getPersonId()%>">delete</a>
			</td>
		</tr>
		<%
		}
		%>
	</table>
	<script type="text/javascript">
	function myFunction(pid,fname,lname,address) {
		document.getElementById("pid").value = pid;
		document.getElementById("pid").disabled = false;
		 document.getElementById("fName").value = fname;
		 document.getElementById("lName").value = lname;
		 document.getElementById("address").value = address;
		 document.getElementById("submit").value = 'Update';
// 		  document.getElementById("demo").style.color = "red";
		}
	</script>
</body>
</html>