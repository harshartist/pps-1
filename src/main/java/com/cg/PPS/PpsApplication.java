package com.cg.PPS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PpsApplication.class, args);
		System.err.println("This is job management service !!");
	}

}
