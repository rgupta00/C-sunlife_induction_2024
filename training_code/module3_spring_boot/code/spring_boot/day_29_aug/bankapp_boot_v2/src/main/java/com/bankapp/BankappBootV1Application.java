package com.bankapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

@SpringBootApplication
public class BankappBootV1Application implements CommandLineRunner {

	@Autowired
	private DataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(BankappBootV1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		if(dataSource!=null){
			System.out.println("-------ds is createc--------");
		}else
			System.out.println("---------ds is not created----");
	}
}
