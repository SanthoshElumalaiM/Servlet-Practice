<%@page import="DAO.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FecthAll</title>
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
		<th>DELETE</th>
		<th>UPDATE</th>
	</tr>
	<% for(User u:list)
{%>
	<tr>
	<td> <%=u.getId() %></td>
	<td> <%=u.getFirstName() %></td>
	<td> <%=u.getLastName() %></td>
	<td> <%=u.getGender() %></td>
	<td> <%=u.getEmail() %></td>
	<td> <%=u.getPassword() %></td>
	<td> <%=u.getPhoneNo() %></td>
	<td> <a href="delete?id=<%= u.getId()%>">delete</a></td>
	<td> <a href="get?id=<%= u.getId()%>">Update</a></td>
	</tr>
		
<%} %>
	
</table>

</body>
</html>