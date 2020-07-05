package com.example.serviceribbon.controller;

import com.example.serviceribbon.service.IHelloService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description
 * Date 2020/7/5 10:06
 * Created by kwz
 */
@RestController
@RequestMapping("ribbon")
public class RibbonController {

    @Setter(onMethod_ = @Autowired)
    private IHelloService iHelloService;

    @GetMapping("/hello")
    private String helloRibbon(@RequestParam String name){
        return iHelloService.hiService(name);
    }
}
