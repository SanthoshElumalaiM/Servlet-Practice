package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import java.util.Date;
public class DynamicServlet extends GenericServlet {
	@Override
	public void service(ServletRequest req,ServletResponse res)throws IOException,ServletException 
	{
		Date d=new Date();
		String html="<html>"
				+ "<body>"
				+ "<h1>Current Date and Time = "+d+"</h1>"
				+ "</body>"
				+ "</html>";
		PrintWriter out=res.getWriter();
		out.print(html);
	}

}
