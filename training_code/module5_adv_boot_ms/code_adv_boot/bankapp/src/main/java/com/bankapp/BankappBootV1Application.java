package com.bankapp;

import com.bankapp.entities.Account;
import com.bankapp.repo.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;
import java.math.BigDecimal;

@SpringBootApplication
public class BankappBootV1Application implements CommandLineRunner{

	@Autowired
	private AccountRepo accountRepo;

	public static void main(String[] args) {
		SpringApplication.run(BankappBootV1Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
//		accountRepo.save(new Account("raj", BigDecimal.valueOf(2000),"raj@gmail.com",
//				"4656556560"));
//		accountRepo.save(new Account("ekta", BigDecimal.valueOf(2000),"ekta@gmail.com",
//				"4006556560"));

	}
}
