package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/s1")
public class Servlet1 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		PrintWriter out=resp.getWriter();
//		out.print("<h1> This is Servlet 1</h1>");
		RequestDispatcher dispatcher=req.getRequestDispatcher("s2");
		dispatcher.forward(req, resp);
		System.out.println();
		
	}

}
