package com.alison.action.config;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(locations = "classpath:email.properties", prefix = "email", ignoreUnknownFields = false)
@Component
@Data
public class EmailPO {

    private String username;

    private String password;

    private String server;

    private int port;

}
