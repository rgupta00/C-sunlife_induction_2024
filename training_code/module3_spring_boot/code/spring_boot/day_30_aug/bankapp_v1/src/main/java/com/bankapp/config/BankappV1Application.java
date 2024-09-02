package com.bankapp.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*
@SpringBootApplication= @SpringBootConfiguration
						+@EnableAutoConfiguration
						+@ComponentScan


 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.bankapp"})
public class BankappV1Application {

	public static void main(String[] args) {
		SpringApplication.run(BankappV1Application.class, args);
	}

}
