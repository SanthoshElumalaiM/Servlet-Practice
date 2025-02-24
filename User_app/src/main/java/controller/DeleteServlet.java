package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.UserDao;
@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		UserDao dao=new UserDao();
		try {
			dao.deleById(id);
			RequestDispatcher dispatcher=req.getRequestDispatcher("fetchAll");
			dispatcher.forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}

}
