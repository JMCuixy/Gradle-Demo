package com.example.gradle.demo.one;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class One {


    @RequestMapping("/hello")
    public String mvc(){
        return "hello world";
    }
}
