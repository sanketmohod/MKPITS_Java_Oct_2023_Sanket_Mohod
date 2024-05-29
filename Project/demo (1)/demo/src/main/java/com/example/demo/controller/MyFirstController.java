package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstController {
    @RequestMapping("/first")
    public String getMyFirstController(){
        return "My first controller";
    }
}
