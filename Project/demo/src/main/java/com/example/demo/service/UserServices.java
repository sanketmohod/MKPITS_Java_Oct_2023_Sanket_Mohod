package com.example.demo.service;


import com.example.demo.dto.UserDatabaseDto;
import com.example.demo.mysql.UserModel;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServices{

    @Autowired
    UserRepository userRepository;

    public UserDatabaseDto getAllUsers() {
        Optional<UserModel> userModel = userRepository.findById(1);
        UserDatabaseDto userDto = new UserDatabaseDto();
        if(userModel.isPresent()) {
            userDto =  convertUserModelToUserDatabaseDto(userModel.get());
        }
        return userDto;
    }

    private UserDatabaseDto convertUserModelToUserDatabaseDto(UserModel userModel) {
        UserDatabaseDto userDto = new UserDatabaseDto();
        userDto.setId(userModel.getId());
        
        userDto.setUsername(userModel.getUsername());
        userDto.setFirstName(userModel.getFirstName());
        userDto.setLastName(userModel.getLastName());
        userDto.setMobile(userModel.getMobile());
        userDto.setEmail(userModel.getEmail());
        return userDto;
    }
}
