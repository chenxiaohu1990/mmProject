package com.example.mmproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.mmproject.user.")
public class MmProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MmProjectApplication.class, args);
    }

}
