package com.alison.action;

import org.apache.juli.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

@RestController
public class ConsumerController {

    private Logger log = LoggerFactory.getLogger(ConsumerController.class);


    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/add")
    public int add(@RequestParam Integer a, @RequestParam Integer b) {
        ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
        log.info("/add, host=" + serviceInstance.getHost() + ", port=" + serviceInstance.getPort() + ", service_id=" + serviceInstance.getServiceId());
        BigDecimal _a = new BigDecimal(a);
        BigDecimal _b = new BigDecimal(b);
        BigDecimal _c = _a.add(_b);
        return _c.intValue();
    }

}
