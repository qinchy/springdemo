package com.qinchy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath:spring-dubbo-provider.xml"})
public class SpringdemoBizApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdemoBizApplication.class, args);
	}
}
