package com.alison.action.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class BookProperties {
    @Value("${demo.book.name}")
    private String name;
    @Value("${demo.book.writer}")
    private String writer;
}
