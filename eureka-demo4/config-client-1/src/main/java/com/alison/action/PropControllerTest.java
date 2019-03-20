package com.alison.action;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RefreshScope
@RestController
public class PropControllerTest {
    @Value("${from}")
    private String from;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    @RequestMapping("/from")
    public String from() {
        return this.from;
    }


    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/refreshCli", method = RequestMethod.GET)
    public String refreshClient() {
        restTemplate.postForEntity("http://localhost:7002/refresh/", null, String.class);
        return "ok!";
    }

}
