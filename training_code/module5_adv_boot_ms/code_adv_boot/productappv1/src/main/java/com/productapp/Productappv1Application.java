package com.productapp;

import com.productapp.repo.Product;
import com.productapp.repo.ProductRepo;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.sql.DataSource;
import java.math.BigDecimal;

@SpringBootApplication
public class Productappv1Application implements CommandLineRunner{

	@Autowired
	private ProductRepo productRepo;

	public static void main(String[] args) {
				SpringApplication.run(Productappv1Application.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
//		productRepo.save(new Product("laptop", BigDecimal.valueOf(130000)));
//		productRepo.save(new Product("rich dad poor dad",
//				BigDecimal.valueOf(2300)));
	}
}
