package com.continew.uniqbackend.SurveyWrite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@SpringBootApplication
@EnableScheduling
@EnableEurekaClient
public class SurveyWriteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SurveyWriteApplication.class, args);
	}

}
