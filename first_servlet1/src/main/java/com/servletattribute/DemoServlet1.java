package com.servletattribute;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet1
 */
//@WebServlet("/DemoServlet1")
public class DemoServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {

			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			String parameter = request.getParameter("name");
			pw.println("Value of Parameter : " + parameter);
			pw.println("<br>");
			ServletContext context = getServletContext();
			context.setAttribute("company", "oracle");
			pw.println("Welcome to First Servlet");
			pw.println("<br>");
			pw.println("<a href ='servlet2'>visit</a>");
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
