package com.requestdispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
//@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String n1 = request.getParameter("userName");
		String n2 = request.getParameter("userPass");
		if (n1.equals("servlet")) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("servlet2");
			requestDispatcher.forward(request, response);

		} else {
			pw.println("Sorry UserName or Password Error!");
			RequestDispatcher requestDispatcher1 = request.getRequestDispatcher("/dispatcher.jsp");
			requestDispatcher1.include(request, response);
		}
	}

}
