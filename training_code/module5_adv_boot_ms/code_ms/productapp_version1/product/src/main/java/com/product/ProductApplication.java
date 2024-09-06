package com.product;

import com.product.dto.ConfigDto;
import com.product.repo.Product;
import com.product.repo.ProductRepo;
import com.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(ConfigDto.class)
@SpringBootApplication
public class ProductApplication implements CommandLineRunner {

	@Autowired
	private ProductService productService;

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		productService.addProduct(new Product("HP laptop", 60000));
		productService.addProduct(new Product("LG TV", 70000));
	}
}
