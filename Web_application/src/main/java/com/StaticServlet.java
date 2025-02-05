package com;

import java.io.*;

import javax.servlet.*;

public class StaticServlet extends GenericServlet {

	public void service(ServletRequest req,ServletResponse res)throws IOException,ServletException
	{
		String html="<html><body><h1>This is static resources</h1></body></html>";
		PrintWriter out=res.getWriter();
		out.print(html);
	}
}
