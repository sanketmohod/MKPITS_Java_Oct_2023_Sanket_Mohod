package com.example.demo.service.impl;

import com.example.demo.dto.UserDto1;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    public UserDto1 getAllUsers(){
        UserDto1 userDto=new UserDto1();
        userDto.setId(11);
        userDto.setUsername("user2");
        userDto.setAge(25);
        return userDto;
    }


}