package com.example.demo.service.impl;


import com.example.demo.dto.request.UserRequestDto;
import com.example.demo.dto.response.UserPostResponseDto;
import com.example.demo.mysql.UserCredential;
import com.example.demo.mysql.UserModel;
import com.example.demo.repository.UserCredentialRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.IUserService;
import com.google.common.hash.Hashing;
import jakarta.transaction.Transactional;
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
    public UserRequestDto getUserById(Integer id) {
        Optional<UserModel> userModel = userRepository.findById(id);
        UserRequestDto userRequestDto = new UserRequestDto();
        if (userModel.isPresent()) {
            userRequestDto = convertUserModelToUserDto(userModel.get());
        }
        return userRequestDto;
    }

    @Override
    public List<UserRequestDto> getAllUsers() {

        List<UserModel> userList = (List<UserModel>) userRepository.findAll();
        List<UserRequestDto> userRequestDtoList = new ArrayList<>();
        for(UserModel user : userList){
            UserRequestDto userRequestDto = convertUserModelToUserDto(user);
            userRequestDtoList.add(userRequestDto);
        }
        return userRequestDtoList;
    }

    @Override
    public UserRequestDto updateUser(UserRequestDto userRequestDto) {
        Optional<UserModel> userModelOptional = userRepository.findById(userRequestDto.getId());
        if(userModelOptional.isEmpty()) {
            System.out.println("User data with id: " + userRequestDto.getId() + " not found");
        } else {
            UserModel user = convertUserDtoToUserModel(userRequestDto, userModelOptional.get());
            user.setId(userRequestDto.getId());
            user = userRepository.save(user);
            return convertUserModelToUserDto(user);
        }
        return userRequestDto;
    }

    @Override
    public UserRequestDto updatePartialUser(UserRequestDto userRequestDto) {
        Optional<UserModel> userModelOptional = userRepository.findById(userRequestDto.getId());
        if(userModelOptional.isEmpty()) {
            System.out.println("User data with id: " + userRequestDto.getId() + " not found");
        } else {
            UserModel user = userModelOptional.get();
            user.setFirstName(userRequestDto.getFirstName() != null && !userRequestDto.getFirstName().equals(user.getFirstName()) ? userRequestDto.getFirstName() : user.getFirstName());
            user.setLastName(userRequestDto.getLastName() != null && !userRequestDto.getLastName().equals(user.getLastName()) ? userRequestDto.getLastName() : user.getLastName());
            user.setEmail(userRequestDto.getEmail() != null && !userRequestDto.getEmail().equals(user.getEmail()) ? userRequestDto.getEmail() : user.getEmail());
            user.setMobile(userRequestDto.getMobile() != null && !userRequestDto.getMobile().equals(user.getMobile()) ? userRequestDto.getMobile() : user.getMobile());
            user.setUpdatedBy(2);
            user.setUpdatedAt(LocalDateTime.now());
            userRepository.save(user);
            return convertUserModelToUserDto(user);
        }
        return userRequestDto;
    }

    @Override
    @Transactional
    public UserPostResponseDto createUser(UserRequestDto userRequestDto) {

        // Below code saves data in users table
        UserModel user = new UserModel();
        user = convertUserDtoToUserModel(userRequestDto, user);
        user.setCreatedBy(1);
        user.setCreatedAt(LocalDateTime.now());
        user = userRepository.save(user);

        // Below code saves data in user_credentials table
        UserCredential userCredential = new UserCredential();
        String uuid = UUID.randomUUID().toString();
        System.out.println("UUID: " + uuid);
        final String computedPassword = Hashing.sha256()
                .hashString(userRequestDto.getPassword(), StandardCharsets.UTF_8).toString() + uuid;
        userCredential.setUserId(user.getId());
        userCredential.setUsername(userRequestDto.getUsername());
        userCredential.setPassword(computedPassword);
        userCredential.setPasswordSalt(uuid);
        userCredential.setLoginDateTime(LocalDateTime.now());
        userCredential.setCreatedBy(1);
        userCredential.setCreatedAt(LocalDateTime.now());
        userCredential.setUpdatedBy(1);
        userCredential.setUpdatedAt(LocalDateTime.now());
        userCredentialRepository.save(userCredential);

        UserPostResponseDto userResponseDto = new UserPostResponseDto();
        userResponseDto.setId(user.getId());
        userResponseDto.setFirstName(user.getFirstName());
        userResponseDto.setUsername(userCredential.getUsername());
        return userResponseDto;
    }

    @Override
    public UserRequestDto deleteUserById(Integer id) {
        Optional<UserModel> userModel = userRepository.findById(id);

        if(userModel.isEmpty()) {
            System.out.println("User Data with id " + id + "not found");
            return null;
        }
        else {
            userRepository.deleteById(id);
            System.out.println("User Data with id "+id+" deleted successfully");
            return convertUserModelToUserDto(userModel.get());
        }
    }

    private UserModel convertUserDtoToUserModel(UserRequestDto userRequestDto, UserModel user) {
        user.setFirstName(userRequestDto.getFirstName());
        user.setLastName(userRequestDto.getLastName());
        user.setMobile(userRequestDto.getMobile());
        user.setEmail(userRequestDto.getEmail());
        user.setUpdatedBy(1);
        user.setDateOfBirth(userRequestDto.getDateOfBirth());
        user.setUpdatedAt(LocalDateTime.now());
        return user;
    }

    private UserRequestDto convertUserModelToUserDto(UserModel user) {
        UserRequestDto userRequestDto = new UserRequestDto();
        userRequestDto.setId(user.getId());
        userRequestDto.setFirstName(user.getFirstName());
        userRequestDto.setLastName(user.getLastName());
        userRequestDto.setMobile(user.getMobile());
        userRequestDto.setEmail(user.getEmail());
        userRequestDto.setDateOfBirth(user.getDateOfBirth());
        return userRequestDto;
    }
}
