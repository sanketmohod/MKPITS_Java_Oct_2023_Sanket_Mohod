package com.example.bank.account.controller;


import com.example.bank.account.dto.request.UserRequestDto;
import com.example.bank.account.dto.response.ErrorResponseDto;
import com.example.bank.account.dto.response.UserResponseDto;
import com.example.bank.account.mysql.Users;
import com.example.bank.account.service.IUserService;
import com.example.bank.account.service.implement.UserService;
import com.example.bank.account.validator.UserValidator;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    IUserService userService;

    @GetMapping
    public List<UserRequestDto> getAllUsers(){
        return  userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public UserRequestDto getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }

    @PostMapping("/users")
    public ResponseEntity<Object> createUser(@Valid @RequestBody UserRequestDto userRequestDto) {
        boolean isValidAge = userValidate.validateAge(userRequestDto.getDateOfBirth());
        if(!isValidAge) {
            ErrorResponseDto errorResponseDto = ErrorResponseDto.builder()
                    .errorMessage("Age should be 18+ years")
                    .httStatusCode(HttpStatus.BAD_REQUEST.value())
                    .build();
            return ResponseEntity.badRequest().body(errorResponseDto);
        }
        UserResponseDto userResponseDto = userService.createUser(userRequestDto);
        return ResponseEntity.created(URI.create("/v1/users/" + userResponseDto.getId())).body(userResponseDto);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id){
        userService.deleteUser(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateUser(@PathVariable("id") Integer id, @RequestBody UserRequestDto userRequestDto) {
        userRequestDto.setId(id);
        UserRequestDto userRequestDtoReturn = userService.updateUser(userRequestDto);
        return ResponseEntity.ok(userRequestDto);
    }

    @PatchMapping("/{id}")
    public Users partialUpdateUser(@PathVariable Integer id, @RequestBody Map<String, Object> updates){
        return userService.partialUpdateUser(id, updates);
    }
}
