package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;

public class Servlet2 extends GenericServlet {
@Override
public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	ServletConfig config=getServletConfig();
	String email=config.getInitParameter("email");
	PrintWriter out=res.getWriter();
	out.print("<h1>email= "+email+"</h1>");
}
}
