package com.alison.action.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Data
@Component
@ConfigurationProperties(prefix = "demo.book")
public class BookComponent {
    private String name;
    private String writer;
    private String description;
}
