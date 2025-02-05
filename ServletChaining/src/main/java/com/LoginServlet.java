package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uemail=req.getParameter("email");
		String upwd=req.getParameter("password");
		
		String email="sant@gmail.com";
		String pwd="123";
		PrintWriter out=resp.getWriter();
		if(uemail.equals(email))
		{
			if(upwd.equals(pwd)) 
			{
				RequestDispatcher dispatcher=req.getRequestDispatcher("Calculator.html");
				dispatcher.forward(req, resp);
			}
			else {
				out.print("<h1>Incorrect password</h1>");
				RequestDispatcher dispatcher=req.getRequestDispatcher("login.html");
				dispatcher.include(req, resp);
			}
		}
		else 
		{
			out.print("<h1>Invalid Maild</h1>");
			RequestDispatcher dispatcher=req.getRequestDispatcher("login.html");
			dispatcher.include(req, resp);
		}
	}

}
