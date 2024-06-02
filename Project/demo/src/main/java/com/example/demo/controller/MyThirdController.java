package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyThirdController {
    @RequestMapping("/third")
    public String getMyThirdController(){
        return " My third controller";
    }
}
