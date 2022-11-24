package com.continew.uniqbackend.surveyread;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SurveyreadApplication {

	public static void main(String[] args) {
		SpringApplication.run(SurveyreadApplication.class, args);
	}

}
