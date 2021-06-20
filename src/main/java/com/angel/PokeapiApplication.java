package com.angel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class PokeapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PokeapiApplication.class, args);
    }

}
