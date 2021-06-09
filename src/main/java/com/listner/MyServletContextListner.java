package com.listner;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class MyServletContextListner
 *
 */
@WebListener
public class MyServletContextListner implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public MyServletContextListner() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
        System.out.println("i am in ServletContextListener destroy method");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	 System.out.println("i am in ServletContextListener Initialized method");
    	 sce.getServletContext().setAttribute("fname", "Soham");
    	 
    }
	
}
