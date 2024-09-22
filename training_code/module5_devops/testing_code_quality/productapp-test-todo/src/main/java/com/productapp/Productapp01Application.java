package com.productapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

public class Productapp01Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Productapp01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//productRepo.save(new Product("laptop",120000));
	}
}
