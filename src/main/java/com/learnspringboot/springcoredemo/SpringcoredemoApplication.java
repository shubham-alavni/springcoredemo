package com.learnspringboot.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// This tells Spring to scan the package
// com.learnspringboot.util
// @SpringBootApplication(scanBasePackages = { "com.learnspringboot.springcoredemo", "com.learnspringboot.util" })
@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
