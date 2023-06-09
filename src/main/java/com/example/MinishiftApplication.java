package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MinishiftApplication {

	public static void main(String[] args) {
		System.out.println("Iniciado");
		System.out.println("Iniciado 2");
		SpringApplication.run(MinishiftApplication.class, args);
	}

}
