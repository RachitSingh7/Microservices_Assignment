package com.deloitte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CarsMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarsMicroservicesApplication.class, args);
	}

	@Bean
	public RestTemplate getRestemplate() {
		return new RestTemplate();
	}
}
