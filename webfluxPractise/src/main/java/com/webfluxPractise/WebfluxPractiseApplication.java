package com.webfluxPractise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@SpringBootApplication
@EnableR2dbcRepositories
public class WebfluxPractiseApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebfluxPractiseApplication.class, args);
	}

}
