package com.pattern.builder;

import domain.BankAccount;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuilderApplication {

	public static void main(String[] args) {

		BankAccount account = new BankAccount.BankAccountBuilder("1234")
				.withOwner("John Doe")
				.withBalance(1000)
				.withInterest(1.5)
				.build();
		System.out.println(account);
	}

}
