package com.alison.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class BlogPO {
    @Value("${blog.name}")
    private String name;
    @Value("${blog.title}")
    private String title;
    @Value("${blog.desc}")
    private String desc;
    @Value("${blog.value}")
    private String value;
    @Value("${blog.number}")
    private Integer number;
    @Value("${blog.bignumber}")
    private Long BigNumber;
    @Value("${blog.extend_1}")
    private Integer extend_1;
    @Value("${blog.extend_2}")
    private Integer extend_2;

}
