package com.continew.uniqbackend.respondwriteservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@SpringBootApplication
@EnableScheduling
@EnableEurekaClient
public class RespondWriteServiceApplication {


	public static void main(String[] args) {
		SpringApplication.run(RespondWriteServiceApplication.class, args);
	}

}
