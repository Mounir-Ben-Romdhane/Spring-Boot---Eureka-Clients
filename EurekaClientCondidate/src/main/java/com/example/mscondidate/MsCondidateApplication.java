package com.example.mscondidate;

import com.example.mscondidate.Entity.Condidat;
import com.example.mscondidate.Repository.CondidatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MsCondidateApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsCondidateApplication.class, args);
    }

    @Autowired
    private CondidatRepository condidatRepository;

    @Bean
    ApplicationRunner init() {
        return (args) -> {
            //save
            condidatRepository.save(new Condidat("Mariem","ch","ma@esprit.tn"));
            condidatRepository.save(new Condidat("Sarra","ab","sa@esprit.tn"));
            condidatRepository.save(new Condidat("Mohamed","ba","ba@esprit.tn"));
            //fetch
            condidatRepository.findAll().forEach(System.out::println);
        };
    }
}
