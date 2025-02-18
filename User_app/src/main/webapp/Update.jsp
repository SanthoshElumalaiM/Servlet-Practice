<%@page import="DAO.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update</title>
</head>
<style>
    *{
        margin: 0;
        padding: 0;
        box-sizing:border-box;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    }
    .outer{
        height: 100vh;
        background-color: blanchedalmond;
        display: flex;
        justify-content: center;
        align-items: center;
    }
    .outer>.inner{
        width: 400px;
        background-color: white;
        border-radius: 20px;
        
    }
    form{
        margin: 20px 30px;
    }
    form>label{
        display: block;
        font-weight: bold;
        margin-top: 10px;
        

        
    }
    form>input{
        display: block;
        font-weight: bold;
        width: 100%;
        margin-top: 10px;
        padding: 10px;
        border:2px solid #ccc;
        border-radius: 10px;
    }
    form>button{
        width: 100%;
        margin-top: 10px;
        padding: 10px;
        border: 3px solid #ddd;
        border-radius:10px
        
        
    }
</style>
<body>
<% User u=(User) request.getAttribute("user"); %>
   <div class="outer">
    <div class="inner">
       
        <form action="update" >
            <h2>Sigup</h2>
            <label for="">Enter id</label>
            <input type="text" id="id" name="id" value="<%=u.getId()%>" readonly="readonly">
            <label for="">Enter FirstName</label>
            <input type="text" id="firstNames" name="fname" value="<%=u.getFirstName()%>">
            <label for="">Enter LastName</label>
            <input type="text" id="lastName" name="lname" value="<%=u.getLastName()%>">
            <label for="">Enter Gender</label>
            <input type="text" id="gender" name="gender" value="<%=u.getGender()%>">
            <label for="">Enter gmail</label>
            <input type="email" id="userName" name="email" value="<%=u.getEmail()%>">
            <label for="">Enter password</label>
            <input type="password" id="userPass" name="password" value="<%=u.getPassword()%>">
            <label for="">Enter phoneNO</label>
            <input type="tel" id="phone" name="phoneNo" value="<%=u.getPhoneNo()%>">
            <button>Signin</button>
        </form>
    </div>
   </div>
   
</body>
</html>