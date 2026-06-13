package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/LifeCycleServlet")
public class LifeCycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 public void init() {
	        System.out.println("Servlet Initialized");
	    }
	 protected void service(HttpServletRequest request,
             HttpServletResponse response)
             throws ServletException, IOException {

		 PrintWriter out = response.getWriter();
		 out.println("Service Method Called");
	 }

	 public void destroy() {
		 System.out.println("Servlet Destroyed");
	 }

}
