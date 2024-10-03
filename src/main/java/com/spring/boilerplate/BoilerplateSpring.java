package com.spring.boilerplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BoilerplateSpring {

	public static void main(String[] args) {
		SpringApplication.run(BoilerplateSpring.class, args);
	}

}
