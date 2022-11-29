package com.continew.uniqbackend.respondwriteservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@SpringBootApplication
@EnableScheduling
@EnableEurekaClient

public class RespondWriteServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(RespondWriteServiceApplication.class, args);
	}

}
