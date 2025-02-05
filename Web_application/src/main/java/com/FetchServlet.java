package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;

public class FetchServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		
		PrintWriter out=res.getWriter();
		out.print("<h1>Id ="+id+" ,Name ="+name+"</h1>");
		
		
	}
}
