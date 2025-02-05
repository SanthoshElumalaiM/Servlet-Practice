package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SignUp extends GenericServlet
{
	Connection c=null;	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	String name=req.getParameter("name");
	String email=req.getParameter("email");
	long pwd=Long.parseLong(req.getParameter("pwd"));
	long phoneNO=Long.parseLong(req.getParameter("tel"));
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		c=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db","root","root");
		PreparedStatement ps=c.prepareStatement("insert into signup values(?,?,?,?) ");
		
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setLong(3, pwd);
		ps.setLong(4, phoneNO);
		
		ps.executeUpdate();
	
		
	} catch (Exception e) {
		e.printStackTrace();
		
	}
	finally {
		try {
			if(c!=null) {
				c.close();
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	
	PrintWriter out=res.getWriter();
	out.print("<h1>Data saved Successfully.......<h1>");
	
	}
}
