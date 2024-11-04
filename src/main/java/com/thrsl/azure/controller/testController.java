package com.thrsl.azure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @GetMapping("/message")
    public String data(){
        return "This is my first application on azure !";
    }
    @GetMapping("/")
    public String data1(){
        return "This is my first application on azure1 !";
    }
    @GetMapping("/test")
    public String data2(){
        return "This is my first application on azure2 !";
    }
}
