package com.alison;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplicationBuilder appBuilder = new SpringApplicationBuilder(EurekaServerApplication.class);
        appBuilder.web(true).run(args);
    }
}
