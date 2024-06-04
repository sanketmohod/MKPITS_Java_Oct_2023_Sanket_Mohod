package com.example.demo.service;


import com.example.demo.dto.UserDatabaseDto;
import com.example.demo.dto.UserDto;


public interface IUserService {

    public UserDatabaseDto getUserById(Integer id);

    public UserDatabaseDto createUser(UserDatabaseDto userDto);
}
