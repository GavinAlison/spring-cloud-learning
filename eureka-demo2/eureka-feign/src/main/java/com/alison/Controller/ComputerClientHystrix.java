package com.alison.Controller;

import com.alison.service.ComputerClient;
import org.springframework.stereotype.Component;

@Component
public class ComputerClientHystrix   implements ComputerClient {

    @Override
    public Integer add(Integer a, Integer b) {
        return -9999;
    }
}
