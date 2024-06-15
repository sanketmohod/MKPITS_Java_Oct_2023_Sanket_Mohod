package com.example.demo.controller;

import com.example.demo.dto.request.UserRequestDto;
import com.example.demo.dto.response.ErrorResponseDto;
import com.example.demo.dto.response.UserPostResponseDto;
import com.example.demo.service.IUserService;

import com.example.demo.validator.UserValidator;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    IUserService userService;
    @Autowired
    UserValidator userValidator;

    //    @RequestMapping(value="/v1/users/{id}",method= RequestMethod.GET)
    @GetMapping(path = "/v1/users/{id}")
    public ResponseEntity<Object> getUser(@PathVariable("id") Integer id) {
        UserRequestDto userRequestDto = userService.getUserById(id);
        boolean isNotFound = userValidator.validateId(userRequestDto.getId());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(userRequestDto);

    }

    @CrossOrigin
    @PutMapping(path = "/v1/users/{id}")
    public ResponseEntity<Object> updateUser(@PathVariable("id") Integer id, @RequestBody UserRequestDto userRequestDto) {
        userRequestDto.setId(id);
        UserRequestDto userRequestDtoReturn = userService.updateUser(userRequestDto);
        return ResponseEntity.ok(userRequestDto);
    }

    @CrossOrigin
    @DeleteMapping(path = "/v1/users/{id}")
    public ResponseEntity<Object> deleteUser(@PathVariable("id") Integer id) {
        UserRequestDto userRequestDto = userService.deleteUserById(id);
        if(userRequestDto !=null){
            return new ResponseEntity<>("User with ID " +id+ " deleted successfully", HttpStatus.OK);
        }else{
            return new ResponseEntity<>("User with ID "+id +"Not Found", HttpStatus.NOT_FOUND);
        }

    }

    @PatchMapping(path = "/v1/users/{id}")
    public ResponseEntity<Object> updatePartialUser(@PathVariable("id") Integer id, @RequestBody UserRequestDto userRequestDto) {
        userRequestDto.setId(id);
        UserRequestDto userRequestDtoReturn = userService.updatePartialUser(userRequestDto);
        return ResponseEntity.ok(userRequestDto);
    }

    @CrossOrigin
    @GetMapping(path = "/v1/users", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAllUsers() {
        List<UserRequestDto> userRequestDtoList = userService.getAllUsers();
        return ResponseEntity.ok(userRequestDtoList);

    }

    @CrossOrigin
    @PostMapping(path = "/v1/users")
    public ResponseEntity<Object> createUser(@Valid @RequestBody UserRequestDto userRequestDto) {
        boolean isValidAge = userValidator.validateAge(userRequestDto.getDateOfBirth());
        if(!isValidAge) {
            ErrorResponseDto errorResponseDto = ErrorResponseDto.builder()
                    .errorMessage("Age should be 18+ years")
                    .httStatusCode(HttpStatus.BAD_REQUEST.value())
                    .build();
            return ResponseEntity.badRequest().body(errorResponseDto);
        }
        UserPostResponseDto userResponseDto = userService.createUser(userRequestDto);
        return ResponseEntity.created(URI.create("/v1/users/" + userResponseDto.getId())).body(userResponseDto);
    }

}
