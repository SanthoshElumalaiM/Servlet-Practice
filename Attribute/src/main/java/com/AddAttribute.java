package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/AddAttribute")
public class AddAttribute extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name="sant";
		req.setAttribute("name",name );
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("/GetAttribute");
		dispatcher.forward(req, resp);
		PrintWriter out =resp.getWriter();
		out.print("<h1>Request Attribute</h1>");
	}

}
