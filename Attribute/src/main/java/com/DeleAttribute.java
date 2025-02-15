package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("DeleAttributes")
public class DeleAttribute extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Object name=req.getAttribute("name");
		PrintWriter out =resp.getWriter();
		
		
		if (name!=null)
		{
			name=null;
			out.print("<h1>Attribute Deleted Successfully</h1>");
		}
	}

}
