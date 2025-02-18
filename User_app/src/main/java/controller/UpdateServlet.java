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
@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id")) ;
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String gender=req.getParameter("gender");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		long phoneNo=Long.parseLong(req.getParameter("phoneNo"));
		
		User u=new User();
		u.setId(id);
		u.setFirstName(fname);
		u.setLastName(lname);
		u.setGender(gender);
		u.setEmail(email);
		u.setPassword(password);
		u.setPhoneNo(phoneNo);
		UserDao dao=new UserDao();
		try {
			dao.update(u);
			RequestDispatcher dispatcher=req.getRequestDispatcher("fetchAll");
			dispatcher.forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
