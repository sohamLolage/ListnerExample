package com.listner;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class MyHttpSessionListner
 *
 */
@WebListener
public class MyHttpSessionListner implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public MyHttpSessionListner() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    	System.out.println("i am in session creat listner");
    	HttpSession session = se.getSession();
    	System.out.println("Session id : "+session.getId());
    	session.setMaxInactiveInterval(5);
    	
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    	
    	
    	System.out.println("i am in session destroy listner");
    	
    }
	
}
