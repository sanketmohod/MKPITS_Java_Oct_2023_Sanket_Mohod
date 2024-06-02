package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.service.impl.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    UserService userServiceConstructor = new UserService();
    UserService getUserServiceSetter = new UserService();

    public UserController(UserService userServiceConstructor){
        this.userServiceConstructor = userServiceConstructor;
    }

    public void setGetUserServiceSetter(UserService getUserServiceSetter) {
        this.getUserServiceSetter = getUserServiceSetter;
    }

    @RequestMapping("/user")
    public ResponseEntity<Object> getUserController(){
        UserDto userDto = userServiceConstructor.getAllUsers();
        System.out.println("Service Constructor : "+userServiceConstructor.hashCode());
        return ResponseEntity.ok(userDto);
    }


    @RequestMapping("/setter")
    public ResponseEntity<Object> getUserSetter(){
        UserDto userDto = getUserServiceSetter.getAllUsers();
        System.out.println("Service Setter : "+getUserServiceSetter.hashCode());
        return ResponseEntity.ok(userDto);
    }
}
