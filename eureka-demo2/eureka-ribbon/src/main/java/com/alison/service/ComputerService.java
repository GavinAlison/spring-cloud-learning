package com.alison.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ComputerService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "addServiceFallbackMethod")
    public String addService() {
        return restTemplate.getForEntity("http://computer-service/add?a=1&b=100", String.class).getBody();
    }

    public String addServiceFallbackMethod() {
        return "error";
    }
}
