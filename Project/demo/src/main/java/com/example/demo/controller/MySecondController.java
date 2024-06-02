package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MySecondController {
    @RequestMapping("/second")
    public String getMySecondController(){
        return  "My second controller";
    }
}
