package com.pattern.builder;

import domain.BankAccount;
import domain.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuilderApplication {

	public static void main(String[] args) {

//		Bank Account Project

		BankAccount account = new BankAccount.BankAccountBuilder("1234")
				.withOwner("John Doe")
				.withBalance(1000)
				.withInterest(1.5)
				.build();
		System.out.println(account);

		System.out.println();

//		Configuration Project

		Configuration configuration = new Configuration.ConfigurationBuilder("localhost", 8081)
				.withPassword("admin")
				.withPassword("password")
				.useSSL(true)
				.build();
		System.out.println(configuration);
	}

}
