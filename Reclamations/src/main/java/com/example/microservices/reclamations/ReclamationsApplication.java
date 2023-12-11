package com.example.microservices.reclamations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ReclamationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReclamationsApplication.class, args);
	}

}
