package com.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath:spring-dubbo-consumer.xml"})
public class DubboconsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboconsumerApplication.class, args);
	}
}
