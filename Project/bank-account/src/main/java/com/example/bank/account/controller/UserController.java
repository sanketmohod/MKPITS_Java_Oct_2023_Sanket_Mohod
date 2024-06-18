package com.example.bank.account.controller;


import com.example.bank.account.dto.request.UserRequestDto;
import com.example.bank.account.dto.response.ErrorResponseDto;
import com.example.bank.account.dto.response.UserPostResponse;
import com.example.bank.account.dto.response.UserResponseDto;
import com.example.bank.account.mysql.Users;
import com.example.bank.account.service.IUserService;
import com.example.bank.account.service.implement.UserService;
import com.example.bank.account.validator.UserValidator;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Map;

@RestController

public class UserController {
    @Autowired
    IUserService userService;

    @Autowired
    UserValidator userValidator;
    //get user by id
    @GetMapping(path = "/users/{id}")
    public ResponseEntity<Object> getUser(@PathVariable("id") Integer id) {
        UserResponseDto userResponseDto = userService.getUserById(id);
        return ResponseEntity.ok(userResponseDto);

    }
    //get all user
    @GetMapping(path = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAllUsers() {
        List<UserResponseDto> userResponseDtoList = userService.getAllUsers();
        return ResponseEntity.ok(userResponseDtoList);

    }
    //delete user
    @DeleteMapping(path = "/users/{id}")
    public ResponseEntity<Object> deleteUser(@PathVariable("id") Integer id) {
        UserResponseDto userResponseDto = userService.deleteUserById(id);
        if(userResponseDto !=null){
            return new ResponseEntity<>("User with ID "+id +"deleted successfully", HttpStatus.OK);
        }else{
            return new ResponseEntity<>("User with ID "+id +"Not Found", HttpStatus.NOT_FOUND);
        }

    }

    //update user
    @PutMapping(path = "/v1/users/{id}")
    public ResponseEntity<Object> updateUser(@PathVariable("id") Integer id, @RequestBody UserRequestDto userRequestDto) {
        userRequestDto.setId(id);
        UserRequestDto userDtoReturn = userService.updateUser(userRequestDto);
        return ResponseEntity.ok(userRequestDto);
    }

    // partial update
    @PatchMapping(path = "/users/{id}")
    public Users partialUpdateUser(@PathVariable Integer id, @RequestBody Map<String, Object> updates){
        return userService.partialUpdateUser(id, updates);
    }

    //create user - Transactional
    @PostMapping(path = "/users/accounts")
    public ResponseEntity<Object> createUser(@Valid @RequestBody UserRequestDto userRequestDto) {
        boolean isValidAge = userValidator.validateAge(userRequestDto.getDateOfBirth());
        if(!isValidAge) {
            ErrorResponseDto errorResponseDto = ErrorResponseDto.builder()
                    .errorMessage("Age should be greater than 18 yrs")
                    .httStatusCode(HttpStatus.BAD_REQUEST.value())
                    .build();
            return ResponseEntity.badRequest().body(errorResponseDto);
        }
        UserPostResponse userPostResponse = userService.createUser(userRequestDto);
        return ResponseEntity.created(URI.create("/users/accounts" + userPostResponse.getId())).body(userPostResponse);
    }


}
