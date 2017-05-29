package io.javabrain.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourceApiApp {
	public static void main(String[] args) {
		System.out.println("Starting main method...");
		SpringApplication.run(CourceApiApp.class, args);
	}
}
