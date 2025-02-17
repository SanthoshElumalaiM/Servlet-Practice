<%@page import="DAO.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% List<User> list=(List<User>)request.getAttribute("list"); %>

<table border="2px">
	<tr>
		<th>ID</th>
		<th>FISTNAME</th>
		<th>LASTNAME</th>
		<th>GENDER</th>
		<th>EMAIL</th>
		<th>PASWORD</th>
		<th>PHONENO</th>
	</tr>
</table>

<% for(User u:list){ %>
	<tr>
		<td> <%=u.getId() %></td>
		<td> <%=u.getFirstName() %></td>
		<td> <%=u.getLastName() %></td>
		<td> <%=u.getGender() %></td>
		<td> <%=u.getEmail() %></td>
		<td> <%=u.getPassword() %></td>
		<td> <%=u.getPhoneNo() %></td>
	</tr>
<%} %>
</body>
</html>