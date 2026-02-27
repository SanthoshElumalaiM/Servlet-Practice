package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
//import javax.servlet.ServletConfig;

public class servletConfig extends GenericServlet {
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//		ServletConfig config=getServletConfig();
		ServletConfig config= getServletConfig();
		String name=config.getInitParameter("name");
		
		PrintWriter out=res.getWriter();
		out.print("<h1>name is "+name+"</h1>");
		
	}

}