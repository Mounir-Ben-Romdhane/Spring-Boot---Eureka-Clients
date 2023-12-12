package com.example.ms.eurekaclientreclamation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientReclamationApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientReclamationApplication.class, args);
	}

}
