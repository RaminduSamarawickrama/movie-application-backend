package com.movieapplicationbackend.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan( basePackages = {"com.movieapplicationbackend.entity"})
@EnableJpaRepositories( basePackages = {"com.movieapplicationbackend.repository"})
@ComponentScan(basePackages="com.movieapplicationbackend")
public class MovieApplicationBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieApplicationBackendApplication.class, args);
    }

}
