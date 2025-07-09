package com.learning.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringbootProjApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstSpringbootProjApplication.class, args);
		System.out.println("Hello World");

		Alien obj = new Alien(); // Not managed by Spring
		obj.code(); // output: coding...

		Alien obj1 = context.getBean(Alien.class); // managed by Spring
		obj1.code(); // output: coding...
	}

}
