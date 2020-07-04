package com.example.serviceribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 服务与服务的通讯是基于http restful的
 * Spring Cloud 有两种服务调用方式：
 * 1. ribbon+restTemplate
 * 2. feign
 *
 * ribbon是一个负载均衡客户端，可以很好的控制htt和tcp的一些行为。Feign默认集成了ribbon。
 *
 */
@SpringBootApplication
public class ServiceRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRibbonApplication.class, args);
    }

}
