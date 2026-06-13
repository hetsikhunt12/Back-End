package com.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class MyListener1 implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce)  { 
    	System.out.println("Application Started");
    }

    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println("Application Stopped");
    }
	
}
