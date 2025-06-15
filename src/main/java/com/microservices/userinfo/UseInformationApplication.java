package com.microservices.userinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UseInformationApplication {

	public static void main(String[] args) {
		SpringApplication.run(UseInformationApplication.class, args);
		System.out.println("user service");
	}
}
