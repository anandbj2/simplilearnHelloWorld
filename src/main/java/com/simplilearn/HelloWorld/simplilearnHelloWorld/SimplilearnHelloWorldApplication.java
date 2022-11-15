package com.simplilearn.HelloWorld.simplilearnHelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimplilearnHelloWorldApplication {

	public static void main(String[] args) {
		System.out.println("In Main method..");
		SpringApplication.run(SimplilearnHelloWorldApplication.class, args);
	}

}
