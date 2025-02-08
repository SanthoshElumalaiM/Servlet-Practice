package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uemail=req.getParameter("email");
		String upassword=req.getParameter("password");
		
		String email="Sant@gmail.com";
		String pass="123";
		
		PrintWriter out=resp.getWriter();
		if(uemail.equals(email))
		{
			if(upassword.equals(pass))
			{
				HttpSession s=req.getSession(true);//Overloaded Method
				out.print("<h1>Login successfully</h1>");
			}
			else {
				out.print("<h1>Invalid Password</h1>");
				RequestDispatcher dispatcher=req.getRequestDispatcher("loginPage.html");
				dispatcher.include(req, resp);
			}
		}
		else {
			out.print("<h1>Email is Not valid</h1>");
			RequestDispatcher dispatcher=req.getRequestDispatcher("loginPage.html");
			dispatcher.include(req, resp);
		}
	}
}
