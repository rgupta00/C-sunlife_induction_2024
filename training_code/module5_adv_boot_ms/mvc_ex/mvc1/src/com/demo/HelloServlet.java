package com.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	private int counter =1;
	
    public HelloServlet() {
      System.out.println("it is a ctr");
    }


	@Override
	public void init() throws ServletException {
		 System.out.println("it is init method");
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.print("hello to servlet "+LocalDateTime.now()+": "+ counter);
		counter++;
	
		System.out.println("it is a doget method");
	}
	
	@Override
	public void destroy() {
		 System.out.println("it is destroy method");
	}


}
