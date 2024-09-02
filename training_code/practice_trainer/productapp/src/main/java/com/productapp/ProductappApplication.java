package com.productapp;

import com.productapp.repo.Product;
import com.productapp.repo.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class ProductappApplication implements CommandLineRunner {

	@Autowired
	private ProductDao productDao;

	public static void main(String[] args) {
		SpringApplication.run(ProductappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		productDao.save(new Product("laptop", BigDecimal.valueOf(100000.00)));
		productDao.save(new Product("laptop cover", BigDecimal.valueOf(1000.00)));

	}
}
