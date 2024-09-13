package com.productapp;

import com.productapp.repo.Product;
import com.productapp.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductappMongoApplication implements CommandLineRunner {

	@Autowired
	private ProductRepo productRepo;

	public static void main(String[] args) {
		SpringApplication.run(ProductappMongoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		productRepo.save(new Product("laptop",67000));
	}
}
