package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.*;

public class DeleByEmail extends GenericServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String email=req.getParameter("email");
		Connection c=null;
		PrintWriter out =res.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db","root","root");
			PreparedStatement ps=c.prepareStatement("delete from signup where email=?");
			ps.setString(1, email);
			ps.executeUpdate();
			
			out.print("<h1>Data deleted Successfully</h1>");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		finally {
			try {
				if(c!=null)
				{
					c.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		
	}
}
