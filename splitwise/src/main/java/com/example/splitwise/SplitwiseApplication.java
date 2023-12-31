package com.example.splitwise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SplitwiseApplication {

	/**
	 * Entry point for spring boot java application
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SplitwiseApplication.class, args);
		SplitWise splitWise = new SplitWise();
		splitWise.demo();
	}

}
