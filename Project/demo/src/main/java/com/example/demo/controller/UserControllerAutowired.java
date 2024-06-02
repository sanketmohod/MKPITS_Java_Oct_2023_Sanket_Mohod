package com.example.demo.controller;


import com.example.demo.dto.UserDto;
import com.example.demo.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserControllerAutowired {

    @Autowired
    UserService userService;
    @RequestMapping("/autowire")
    public ResponseEntity<Object> getUserAutowire(){
        System.out.println("Service Autowired : "+userService.hashCode());
        UserDto userDto = userService.getAllUsers();
        return ResponseEntity.ok().body(userDto);
    }
}
