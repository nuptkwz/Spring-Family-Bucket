package com.example.servicefeign.controller;

import com.example.servicefeign.feign.IFeignService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description
 * Date 2020/7/5 12:31
 * Created by kwz
 */
@RestController
public class HelloFeignController {

    @Setter(onMethod_ = @Autowired)
    private IFeignService feignService;

    @GetMapping("feignHello")
    public String sayHello(@RequestParam("name") String name) {
        return feignService.sayHelloFromEurekaClientOne(name);
    }
}
