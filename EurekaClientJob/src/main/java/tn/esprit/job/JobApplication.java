package tn.esprit.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import tn.esprit.job.repository.JobRepository;

@SpringBootApplication
@EnableEurekaClient
public class JobApplication {

    public static void main(String[] args) {
        SpringApplication.run(JobApplication.class, args);
    }
    @Autowired
    private JobRepository repository ;
    @Bean
    ApplicationRunner init(){
        return (args -> {

            repository.findAll().forEach(System.out::println);
        }) ;
    }
}
