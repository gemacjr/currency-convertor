package com.swiftbeard.currencyconvertor;

import com.swiftbeard.currencyconvertor.domain.Rate;
import com.swiftbeard.currencyconvertor.repository.RateRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class CurrencyConvertorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CurrencyConvertorApplication.class, args);
    }


    @Bean
    public CommandLineRunner data(RateRepository repository) {
        return (args) -> {
            repository.save(new Rate("EUR",0.88857F,new Date()));
            repository.save(new Rate("JPY",102.17F,new Date()));
            repository.save(new Rate("MXN",19.232F,new Date()));
            repository.save(new Rate("GBP",0.75705F,new Date()));
        };
    }
}
