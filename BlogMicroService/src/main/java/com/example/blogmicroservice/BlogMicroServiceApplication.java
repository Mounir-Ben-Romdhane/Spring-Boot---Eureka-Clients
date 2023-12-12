package com.example.blogmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
public class BlogMicroServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogMicroServiceApplication.class, args);
    }


}
