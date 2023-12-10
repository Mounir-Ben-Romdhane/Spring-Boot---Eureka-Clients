package com.example.categoryclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CategoryClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(CategoryClientApplication.class, args);
    }

}
