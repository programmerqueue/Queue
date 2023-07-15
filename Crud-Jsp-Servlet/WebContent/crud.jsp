<%@page import="java.util.Iterator"%>
<%@page import="com.pro.bean.UserBean"%>
<%@page import="java.util.List"%>
<%@page import="com.pro.dao.InsertDao"%>
<%@page import="com.pro.daoImpl.InsertDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>

</head>
<body>
	<h1 align="center">Registration Form</h1>
	<form action="InsertController" method="post">
		<table align="center" border="1">
			<tr>
				<td>id</td>
				<td><input type="text" name="id" id="id" readonly="readonly"></td>
			</tr>
			<tr> 
				<td>Username</td>
				<td><input type="text" name="uname" id="uname"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" id="password"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="email" name="email" id="email"></td>
			</tr>
			<tr>
				<td>Contact</td>
				<td><input type="text" name="contact" id="contact"></td>
			</tr>
			<tr>
				<td>Age</td>
				<td><input type="text" name="age" id="age"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Save" name="submit" id="submit"></td>
			</tr>
		</table>
	</form>
	<hr>
	<table align="center" border="1">
		<tr>
			<th>ID</th>
			<th>USERNAME</th>
			<th>EMAIL</th>
			<th>PASSWORD</th>
			<th>CONTACT</th>
			<th>AGE</th>
			<th>ACTIONS</th>
		</tr>
		<%
		UserBean userBean = null;
		InsertDao insertDao = new InsertDaoImpl();
		List<UserBean> list = insertDao.getValues();
		Iterator<UserBean> itr = list.iterator();
		while (itr.hasNext()) {
			userBean = itr.next();
		%>
		<tr>
			<td><%=userBean.getId()%></td>
			<td><%=userBean.getUname()%></td>
			<td><%=userBean.getPwd()%></td>
			<td><%=userBean.getEmail()%></td>
			<td><%=userBean.getContact()%></td>
			<td><%=userBean.getAge()%></td>
			<td><a href="#"
				onclick="update(<%=userBean.getId()%>,'<%=userBean.getUname()%>','<%=userBean.getPwd()%>','<%=userBean.getContact()%>','<%=userBean.getEmail()%>','<%=userBean.getAge()%>')">Update</a></td>
			<td><a href="InsertController?id=<%=userBean.getId()%>">Delete</a></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>