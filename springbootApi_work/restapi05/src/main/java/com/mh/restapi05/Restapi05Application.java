package com.mh.restapi05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcAuditing;

@SpringBootApplication
@EnableJdbcAuditing
public class Restapi05Application {

	public static void main(String[] args) {
		SpringApplication.run(Restapi05Application.class, args);
	}

}
