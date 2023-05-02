package com.example.spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication


@EnableJpaAuditing
@EnableJpaRepositories
@EnableTransactionManagement


public class MySampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySampleApplication.class, args);
    }

}
