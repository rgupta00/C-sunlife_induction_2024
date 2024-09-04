package com.demo;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class SCLDemo implements ServletContextListener {

	 public void contextInitialized(ServletContextEvent sce)  { 
       System.out.println("===========context is inilized====");  
	  }
   
    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println("===========context is destroyed====");  
        
    }

   
	
}
