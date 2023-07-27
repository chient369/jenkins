package com.vti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.vti.*")
public class JenkinsWithNewRelicApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsWithNewRelicApplication.class, args);
	}

}
