package com.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Header")
public class Header extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setHeader("Custom-Header", "TOPS Technologies");
		PrintWriter out = response.getWriter();
		out.print("<h2>HTTP Request Header<h2>");
		Enumeration<String> headers = request.getHeaderNames();
		  while(headers.hasMoreElements()) {
	            String name = headers.nextElement();
	            out.println(name + " : " + request.getHeader(name) + "<br>");
	        }
	}

}
