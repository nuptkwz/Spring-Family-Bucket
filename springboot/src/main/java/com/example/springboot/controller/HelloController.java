package com.example.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description
 * 相比于spring mvc, spring boot优点在于：
 * 1.不需要做任何的web.xml配置
 * 2.不需要做任何spring mvc的配置; springboot为你做了。
 * 3.不用配置tomcat，springboot内嵌了tomcat
 * Date 2020/7/6 20:26
 * Created by kwz
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @Value("${personal.hello}")
    private String hello;

    @Value("${personal.uuid}")
    private String personalUuid;

    @GetMapping
    public String index() {
        return "hello spring boot";
    }

    @GetMapping("/config")
    public String getConfig() {
        return hello + " " + personalUuid;
    }
}
