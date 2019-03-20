package com.alison.action;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloAction {

    @RequestMapping("/hello")
    public  String index(){
        return "hello world";
    }
}
