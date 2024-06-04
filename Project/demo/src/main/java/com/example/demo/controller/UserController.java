package com.example.demo.controller;

import com.example.demo.dto.UserDatabaseDto;
import com.example.demo.dto.UserDto;
import com.example.demo.service.UserServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

   @Autowired
   UserServices userService;

    @RequestMapping("/users/database")
    public ResponseEntity<Object> getUserController(){
        UserDatabaseDto userDto = userService.getAllUsers();
        System.out.println("Service Constructor : "+userService.hashCode());
        return ResponseEntity.ok(userDto);
    }

}
