package com.data.mongo.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = { "com.mongo.repositories" })
@ComponentScan(basePackages = { "com.mongo.controllers" })
public class SpringBootDataMongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataMongoDbApplication.class, args);
	}

}
