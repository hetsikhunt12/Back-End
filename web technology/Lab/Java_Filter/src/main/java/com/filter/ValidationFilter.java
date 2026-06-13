package com.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter("/ValidationFilter")
public class ValidationFilter extends HttpFilter implements Filter {
       
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		 String name = request.getParameter("name");

	        if(name == null || name.equals("")) {
	            PrintWriter out = response.getWriter();
	            out.println("Name field cannot be empty");
	        }
	        else {
	            chain.doFilter(request, response);
	        }
	}


}
