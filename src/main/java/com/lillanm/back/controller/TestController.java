package com.lillanm.back.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @CrossOrigin
    @GetMapping
    public String test(){
        log.info("test");
        System.out.println("test");
        return "这是一个返回值";
    }
}
