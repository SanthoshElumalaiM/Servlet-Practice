package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.User;
import DAO.UserDao;
@WebServlet("/fetchAll")
public class FetchAllServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		UserDao dao=new UserDao();
		
		try {
			List<User> list=dao.fetchAll();
			req.setAttribute("list", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
