package com.app.controller;

import java.io.IOException;

import com.app.model.Model;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/register")
public class Register extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
//		  System.out.println("in register");
//		    ServletContext context=   getServletContext();
		      
		// Get form data
		String uname = request.getParameter("uname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String city = request.getParameter("ucity");

		// Model object
		Model m = new Model();
		m.setuName(uname);
		m.setEmail(email);
		m.setuPassword(password);
		m.setuCity(city);

		// DB operation
		int row = m.register();

		// Session handling
		HttpSession session = request.getSession();
		session.setAttribute("uname", uname);

		// Navigation
		if (row > 0) {
			response.sendRedirect("Success.jsp");
		} else {
			response.sendRedirect("Failure.jsp");
		}
	}
}