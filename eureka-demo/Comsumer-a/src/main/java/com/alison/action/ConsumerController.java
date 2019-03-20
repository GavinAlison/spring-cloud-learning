package com.alison.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ConsumerController {

    private final static Logger log = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/queryInfo", method = RequestMethod.GET)
    public String infoDesc(@RequestParam String name, @RequestParam String desc) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("name", name);
        params.put("desc", desc);
        log.info("name=" + name + ", desc" + desc);
        return restTemplate.getForEntity("http://service-a/queryInfo?name={name}&desc={desc}", String.class, params).getBody();
    }
}
