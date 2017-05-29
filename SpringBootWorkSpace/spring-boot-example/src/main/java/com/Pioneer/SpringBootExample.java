package com.Pioneer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootExample {
	public static void main(String[] args) {
		System.out.println("Execution Started.............................");
		SpringApplication.run(SpringBootExample.class, args);
		System.out.println("Terminating Program...........................");

	}
}
