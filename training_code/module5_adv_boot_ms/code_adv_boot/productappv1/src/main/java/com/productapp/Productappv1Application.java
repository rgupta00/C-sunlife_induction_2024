package com.productapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.sql.DataSource;

@SpringBootApplication
public class Productappv1Application implements CommandLineRunner {

	@Autowired
	private DataSource dataSource;

	public static void main(String[] args) {

		ApplicationContext ctx=
				SpringApplication.run(Productappv1Application.class, args);
//		String beansNames[]=ctx.getBeanDefinitionNames();
//		for(String beansName: beansNames){
//			System.out.println(beansName);
//		}
	}

	@Override
	public void run(String... args) throws Exception {
		if(dataSource!=null){
			System.out.println("conn datasource is working!");
		}
	}
}
