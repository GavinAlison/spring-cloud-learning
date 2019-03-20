package com.alison.Controller;

import com.alison.service.ComputerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {


    @Autowired
    ComputerClient computerClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(){
        return computerClient.add(10, 20);
    }
}
