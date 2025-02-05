package com;

import java.io.IOException;

import javax.servlet.*;

public class LifeCycle extends GenericServlet {
	@Override
	public void init() throws ServletException {
		System.out.println("This is init mathod");
		super.init();
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("This is service mathod");
		
	}
	@Override
	public void destroy() {
		System.out.println("This is destroy mathod");
		super.destroy();
	}

	
}
