package com.us;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class s1 extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		resp.setContentType("text/html");
		PrintWriter o = resp.getWriter();
		String name=req.getParameter("var1");
		String password=req.getParameter("var2");

		if(name.equals("mohan"))
		{
			if(password.equals("123"))
			{
				req.getRequestDispatcher("a.html").include(req, resp);
					
		HttpSession s1 = req.getSession();
		s1.setAttribute("name", name);
		s1.setAttribute("password", password);
			}
			else
			{
				
				req.getRequestDispatcher("index1.html").include(req, resp);
				o.println(" password incorrect");
			}
	}
		else
		{
			
			req.getRequestDispatcher("index1.html").include(req, resp);
			o.println(" Username incorrect");
		}
		}

}
