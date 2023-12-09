package com.example.eurekaclientcurrency;

import com.example.eurekaclientcurrency.Entity.Currency;
import com.example.eurekaclientcurrency.Repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EurekaClientCurrencyApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientCurrencyApplication.class, args);
    }


}
