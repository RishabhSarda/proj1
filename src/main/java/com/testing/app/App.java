package com.testing.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.testing.app.service","com.testing.app.service.impl","com.testing.app.*"})
@EnableJpaRepositories(basePackages = {"com.testing.app.dao"})
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
