package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Generic")
public class Generic extends jakarta.servlet.GenericServlet {
	private static final long serialVersionUID = 1L;
	public void service(ServletRequest req,
            ServletResponse res)
            throws ServletException, IOException {

PrintWriter out = res.getWriter();
out.println("Generic Servlet Example");
}
	
}
