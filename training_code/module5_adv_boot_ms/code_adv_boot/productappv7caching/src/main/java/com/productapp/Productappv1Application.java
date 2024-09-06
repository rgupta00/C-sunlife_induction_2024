package com.productapp;

import com.productapp.dto.InfoDto;
import com.productapp.entities.Product;
import com.productapp.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.math.BigDecimal;
@EnableConfigurationProperties({InfoDto.class})
@EnableAspectJAutoProxy //hey sb i want go for aop
@SpringBootApplication
@EnableScheduling
public class Productappv1Application implements CommandLineRunner{

	@Autowired
	private ProductRepo productRepo;

	public static void main(String[] args) {
				SpringApplication.run(Productappv1Application.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		productRepo.save(new Product("laptop", BigDecimal.valueOf(130000)));
		productRepo.save(new Product("rich dad poor dad",
				BigDecimal.valueOf(2300)));
	}
}
