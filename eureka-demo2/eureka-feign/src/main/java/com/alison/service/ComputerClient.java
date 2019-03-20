package com.alison.service;

import com.alison.Controller.ComputerClientHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//使用@FeignClient注解中的fallback属性指定回调类,回调类需要实现该接口
// value指定service的名称
@FeignClient(value="computer-service", fallback = ComputerClientHystrix.class)
public interface ComputerClient {

    @RequestMapping(method = RequestMethod.GET, value = "/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);

}
