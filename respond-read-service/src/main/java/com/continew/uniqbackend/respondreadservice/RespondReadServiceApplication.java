package com.continew.uniqbackend.respondreadservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@Configuration
@EnableScheduling
@EnableEurekaClient
public class RespondReadServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RespondReadServiceApplication.class, args);
	}

}