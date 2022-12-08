package com.continew.uniqbackend.respondreadservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Configuration
@EnableScheduling
@EnableEurekaClient
@EnableCaching
@RestController
public class RespondReadServiceApplication {

	@RequestMapping("/test")
	public String testRR(){
		return "Respond Read Service activate";
	}
	public static void main(String[] args) {
		SpringApplication.run(RespondReadServiceApplication.class, args);
	}

}
