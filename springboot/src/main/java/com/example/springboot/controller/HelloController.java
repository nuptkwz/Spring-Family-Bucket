package com.example.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description
 * Date 2020/7/6 20:26
 * Created by kwz
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping
    public String index() {
        return "hello spring boot";
    }
}
