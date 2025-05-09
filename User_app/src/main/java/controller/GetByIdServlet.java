package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.User;
import DAO.UserDao;

@WebServlet("/get")
public class GetByIdServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("id"));
		
		UserDao dao=new UserDao();
		
		try {
			
			User u=dao.getById(id);
			
			req.setAttribute("user",u);
			RequestDispatcher dispatcher=req.getRequestDispatcher("Update.jsp");
			dispatcher.forward(req, resp);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
