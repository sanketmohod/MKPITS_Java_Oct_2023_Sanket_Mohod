package com.example.demo.service.impl;


import com.example.demo.dto.UserDatabaseDto;
import com.example.demo.mysql.UserModel;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class UserServices implements IUserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDatabaseDto getUserById(Integer id) {
        Optional<UserModel> userModel = userRepository.findById(id);
        UserDatabaseDto userDto = new UserDatabaseDto();
        if (userModel.isPresent()) {
            userDto = convertUserModelToUserDatabaseDto(userModel.get());
        }
        return userDto;
    }

    @Override
    public UserDatabaseDto createUser(UserDatabaseDto userDto) {
        UserModel userModel = convertUserDatabaseDtoToUserModel(userDto);
        userModel = userRepository.save(userModel);
        return convertUserModelToUserDatabaseDto(userModel);
    }

    private UserModel convertUserDatabaseDtoToUserModel(UserDatabaseDto userDto) {
        UserModel userModel = new UserModel();
        userModel.setUsername(userDto.getUsername());
        userModel.setFirstName(userDto.getFirstName());
        userModel.setLastName(userDto.getLastName());
        userModel.setMobile(userDto.getMobile());
        userModel.setEmail(userDto.getEmail());
        userModel.setCreatedBy(1);
        userModel.setCreatedAt(LocalDateTime.now());
        userModel.setUpdatedBy(1);
        userModel.setUpdatedAt(LocalDateTime.now());
        return userModel;
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
