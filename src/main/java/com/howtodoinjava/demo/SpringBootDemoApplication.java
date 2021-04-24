package com.howtodoinjava.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication 
public class SpringBootDemoApplication {

	public static void main(String[] args) {
	System.out.println("***Running***");
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
}
