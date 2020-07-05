package com.example.serviceribbon.service.impl;

import com.example.serviceribbon.service.IHelloService;
import com.netflix.discovery.converters.Auto;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Description
 * Date 2020/7/5 9:51
 * Created by kwz
 */
@Service
public class HelloService implements IHelloService {

    @Setter(onMethod_ = @Autowired)
    private RestTemplate restTemplate;

    /**
     * Description
     * 直接通过注册中心注册的服务名进行访问
     * Param [name]
     * return java.lang.String
     */
    @Override
    public String helloService(String name) {
        return restTemplate.getForObject("http://SERVICE-CLIENT/hi?name=" + name, String.class);
    }
}
