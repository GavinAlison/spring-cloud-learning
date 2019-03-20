package com.alison;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ComputerServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(ComputerServiceApp.class, args);
    }

}
