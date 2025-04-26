package com.conflict;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConflictApplication {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = 30;
		char c = 'c';
		char d = 'd';
		char e = 'e';
		SpringApplication.run(ConflictApplication.class, args);

	}

}
