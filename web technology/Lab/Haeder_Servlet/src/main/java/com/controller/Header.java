package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/Header")
public class Header extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        response.setHeader("Custom-Header","TOPS Technologies");

        PrintWriter out = response.getWriter();

        out.println("<h2>HTTP Request Headers</h2>");

        Enumeration<String> headers = request.getHeaderNames();

        while(headers.hasMoreElements()) {
            String name = headers.nextElement();
            out.println(name + " : " + request.getHeader(name) + "<br>");
        }
	}

}
