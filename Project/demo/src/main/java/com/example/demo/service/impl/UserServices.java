package com.example.demo.service.impl;


import com.example.demo.dto.UserDto;
import com.example.demo.mysql.UserCredential;
import com.example.demo.mysql.UserModel;
import com.example.demo.repository.UserCredentialRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.IUserService;
import com.google.common.hash.Hashing;
import jakarta.transaction.Transactional;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserServices implements IUserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserCredentialRepository userCredentialRepository;


    @Override
    public UserDto getUserById(Integer id) {
        Optional<UserModel> userModel = userRepository.findById(id);
        UserDto userDto = new UserDto();
        if (userModel.isPresent()) {
            userDto = convertUserModelToUserDto(userModel.get());
        }
        return userDto;
    }

    @Override
    public List<UserDto> getAllUsers() {

        List<UserModel> userModelList = (List<UserModel>) userRepository.findAll();
        List<UserDto> userDtoList = new ArrayList<>();
        for(UserModel userModel: userModelList){
            UserDto userDto = convertUserModelToUserDto(userModel);
            userDtoList.add(userDto);
        }
        return userDtoList;
    }

    @Override
    public UserDto updateUser(UserDto userDto) {
        Optional<UserModel> userModelOptional = userRepository.findById(userDto.getId());
        if(userModelOptional.isEmpty()) {
            System.out.println("User data with id: " + userDto.getId() + " not found");
        } else {
            UserModel userModel = convertUserDtoToUserModel(userDto, userModelOptional.get());
            userModel.setId(userDto.getId());
            userModel = userRepository.save(userModel);
            return convertUserModelToUserDto(userModel);
        }
        return userDto;
    }

    @Override
    public UserDto updatePartialUser(UserDto userDto) {
        Optional<UserModel> userModelOptional = userRepository.findById(userDto.getId());
        if(userModelOptional.isEmpty()) {
            System.out.println("User data with id: " + userDto.getId() + " not found");
        } else {
            UserModel user = userModelOptional.get();
            user.setFirstName(userDto.getFirstName() != null && !userDto.getFirstName().equals(user.getFirstName()) ? userDto.getFirstName() : user.getFirstName());
            user.setLastName(userDto.getLastName() != null && !userDto.getLastName().equals(user.getLastName()) ? userDto.getLastName() : user.getLastName());
            user.setEmail(userDto.getEmail() != null && !userDto.getEmail().equals(user.getEmail()) ? userDto.getEmail() : user.getEmail());
            user.setMobile(userDto.getMobile() != null && !userDto.getMobile().equals(user.getMobile()) ? userDto.getMobile() : user.getMobile());
            user.setUpdatedBy(2);
            user.setUpdatedAt(LocalDateTime.now());
            userRepository.save(user);
            return convertUserModelToUserDto(user);
        }
        return userDto;
    }


    @Override
    @Transactional
    public UserDto createUser(UserDto userDto) {

        // Below code saves data in users table
        UserModel userModel = new UserModel();
        userModel = convertUserDtoToUserModel(userDto, userModel);
        userModel.setCreatedBy(1);
        userModel.setCreatedAt(LocalDateTime.now());
        userModel = userRepository.save(userModel);

        // Below code saves data in user_credentials table
        UserCredential userCredential = new UserCredential();
        String uuid = UUID.randomUUID().toString();
        System.out.println("UUID: " + uuid);

        final String computedPassword = Hashing.sha256().hashString(userDto.getPassword(), StandardCharsets.UTF_8).toString() + uuid;
        userCredential.setUserId(userModel.getId());
        userCredential.setUsername(userDto.getUsername());
        userCredential.setPassword(computedPassword);
        userCredential.setPasswordSalt(uuid);
        userCredential.setLoginDateTime(LocalDateTime.now());
        userCredential.setCreatedBy(1);
        userCredential.setCreatedAt(LocalDateTime.now());
        userCredential.setUpdatedBy(1);
        userCredential.setUpdatedAt(LocalDateTime.now());
        userCredentialRepository.save(userCredential);
        return convertUserModelToUserDto(userModel);
    }



    private UserModel convertUserDtoToUserModel(UserDto userDto, UserModel userModel) {
        userModel.setUsername(userDto.getUsername());
        userModel.setFirstName(userDto.getFirstName());
        userModel.setLastName(userDto.getLastName());
        userModel.setMobile(userDto.getMobile());
        userModel.setEmail(userDto.getEmail());
        userModel.setUpdatedBy(1);
        userModel.setUpdatedAt(LocalDateTime.now());
        return userModel;
    }




    private UserModel convertUserDtoToUserModel(UserDto userDto) {
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

    private UserDto convertUserModelToUserDto(UserModel userModel) {
        UserDto userDto = new UserDto();
        userDto.setId(userModel.getId());

        userDto.setUsername(userModel.getUsername());
        userDto.setFirstName(userModel.getFirstName());
        userDto.setLastName(userModel.getLastName());
        userDto.setMobile(userModel.getMobile());
        userDto.setEmail(userModel.getEmail());
        return userDto;
    }
}
