
package com.pro.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pro.bean.UserBean;
import com.pro.dao.InsertDao;
import com.pro.daoImpl.InsertDaoImpl;

/**
 * Servlet implementation class InsertController
 */
@WebServlet("/InsertController")
public class InsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserBean userBean = new UserBean();
		InsertDao daoImpl = new InsertDaoImpl();
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("password");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String age = request.getParameter("age");
		String button = request.getParameter("submit");
		userBean.setUname(uname);
		userBean.setPwd(pwd);
		userBean.setEmail(email);
		userBean.setContact(contact);
		userBean.setAge(Integer.parseInt(request.getParameter("age")));
		if (button.equals("Save")) {
			daoImpl.insert(userBean);
		} else if (button.equals("update")) {
			userBean.setId(Integer.parseInt(request.getParameter("id")));
			System.out.println(button);
		}
		response.sendRedirect("crud.jsp");
	}

}
