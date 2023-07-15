package com.aijaz.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aijaz.dao.RegisterDao;
import com.aijaz.daoImpl.RegisterDaoImpl;
import com.aijaz.pojo.Person;

/**
 * Servlet implementation class RegisterController
 */
//@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("dogetMehod");
//		System.out.println(req.getParameter("personId"));
		RegisterDao rdDao=new RegisterDaoImpl();
		rdDao.deleteOneValue(Integer.parseInt(req.getParameter("personId")));
		resp.sendRedirect("index.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("in registor controller....");
//		String fName=request.getParameter("fName");
//		String lName=request.getParameter("lName");
//		String address=request.getParameter("address");
//		System.out.println(fName+" "+lName+" "+address);
		Person person=new Person();
		person.setAddress(request.getParameter("address"));
		person.setFirstName(request.getParameter("fName"));
		person.setLastName(request.getParameter("lName"));
		System.out.println(person);
		RegisterDao rdDao=new RegisterDaoImpl();
		if(request.getParameter("submit").equalsIgnoreCase("Update")) {
			person.setPersonId(Integer.parseInt(request.getParameter("pid")));
			rdDao.updatePerson(person);
		}else {
			rdDao.savePerson(person);
		}
		response.sendRedirect("index.jsp");
	}

}
