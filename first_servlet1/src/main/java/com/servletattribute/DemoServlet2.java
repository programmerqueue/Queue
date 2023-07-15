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
 * Servlet implementation class DemoServlet2
 */
//@WebServlet("/DemoServlet2")
public class DemoServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			ServletContext context1 = getServletContext();
			String attribute = (String) context1.getAttribute("company");
			pw.println("Welcome to : " + attribute);
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
