package com.session.cookie.loginandlogout;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
//@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		RequestDispatcher dispatcher = request.getRequestDispatcher("link.jsp");
		dispatcher.include(request, response);
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		if (password.equals("admin123")) {
			out.println("You are successfully logged in!");
			out.println("<br>Welcome, " + name);
			Cookie cookie = new Cookie("name", name);
			response.addCookie(cookie);
		} else {
			out.println("sorry, username or password error!");
			RequestDispatcher dispatcher2 = request.getRequestDispatcher("login.jsp");
			dispatcher2.include(request, response);
		}

		out.close();
	}

}
