package com.us;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class SessionManagServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		resp.setContentType("text/html");
		PrintWriter o = resp.getWriter();
		HttpSession s1 = req.getSession(false);
		if (s1 != null) {
			resp.sendRedirect("a.html");
		} else {
			req.getRequestDispatcher("index1.html").include(req, resp);
		}
	}
}
