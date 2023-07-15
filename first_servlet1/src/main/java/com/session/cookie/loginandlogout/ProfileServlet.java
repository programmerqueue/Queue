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
 * Servlet implementation class ProfileServlet
 */
//@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		RequestDispatcher dispatcher = request.getRequestDispatcher("link.jsp");
		dispatcher.include(request, response);
		Cookie[] cookies = request.getCookies();
		if(cookies!=null) {
			String name = cookies[0].getValue();
			if(!name.equals("")||name!=null){  
	            out.print("<b>Welcome to Profile</b>");  
	            out.print("<br>Welcome, "+name);  
	        }  
	        }else{  
	            out.print("Please login first");  
	            request.getRequestDispatcher("login.jsp").include(request, response);  
	        }  
	        out.close();  
		}
		
	}


