package com.example.matematicaAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan
@ComponentScan
@EnableJpaRepositories
@SpringBootApplication
public class matematicaAPI {

		public static void main(String[] args) {
		SpringApplication.run(matematicaAPI.class, args);
	}

}
