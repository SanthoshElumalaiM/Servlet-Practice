package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.User;
import DAO.UserDao;
@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		UserDao dao=new UserDao();
		PrintWriter out=resp.getWriter();
		try {
			
			User u=dao.getByEmail(email);
			if(u!=null)
			{
				if(password.equals(u.getPassword()))
				{
//					RequestDispatcher dispatcher=req.getRequestDispatcher("Calculator.html");
					RequestDispatcher dispatcher=req.getRequestDispatcher("fetchAll");
					dispatcher.forward(req, resp);
				}
				else {
					
					out.print("<h1 style='color:red'>Invalid Password</h1>");
					RequestDispatcher dispatcher=req.getRequestDispatcher("Login.html");
					dispatcher.include(req, resp);
				}
			}
			else 
			{
				out.print("<h1 style='color:red' >Invalid Email Id</h1>");
				RequestDispatcher dispatcher=req.getRequestDispatcher("Login.html");
				dispatcher.include(req, resp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
