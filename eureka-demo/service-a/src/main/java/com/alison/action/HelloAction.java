package com.alison.action;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloAction {
    private static final Logger log = LoggerFactory.getLogger(HelloAction.class);
    @Autowired
    private DiscoveryClient discoveryClient;

    //    @RequestBody告诉从body里取值，请求方的Content-Type要设置为application/json，否则报415错误
    @RequestMapping(value = "/addInfo", method = RequestMethod.POST)
    public String addInfo(@RequestBody Info info) {
        return info.getName() + "," + info.getDesc();
    }

    @RequestMapping(value = "/queryInfo", method = RequestMethod.GET)
    public String queryInfo(@RequestParam String name, @RequestParam String desc) {
        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
        log.info("/queryInfo, host="+instance.getHost()+", port="+instance.getPort()+", service_id="+instance.getServiceId());
        return name + "," + desc;
    }

    @RequestMapping("/hello")
    public String index() {
        ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
        log.info("/hello, host:" + serviceInstance.getHost() + ", service_id: " + serviceInstance.getServiceId());
        return "hello world!";
    }

}
