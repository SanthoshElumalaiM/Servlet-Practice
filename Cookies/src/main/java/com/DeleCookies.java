package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/deleCookie")
public class DeleCookies  extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Cookie arr[]=req.getCookies();
		PrintWriter out=resp.getWriter();
		boolean b=true;
		for(Cookie c:arr)
		{
			if(c.getName().equals("pwd")) {
				c.setMaxAge(0);
				resp.addCookie(c);
				b=false;
			}
		}
		if(b)
		{
			out.print("<h1>Cookie is Not Found</h1>");
		}
		else {
			out.print("<h1>Cookie is deleted</h1>");
		}
	}
}
