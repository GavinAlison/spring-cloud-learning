package com.alison.action;

import com.alison.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    ComputerService computerService;

    @RequestMapping(value = "/add")
    public String add() {
       return  computerService.addService();
    }
}
