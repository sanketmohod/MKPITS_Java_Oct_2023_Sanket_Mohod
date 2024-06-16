package com.example.bank.account.service;

import com.example.bank.account.dto.request.UserRequestDto;
import com.example.bank.account.dto.response.UserResponseDto;
import com.example.bank.account.mysql.Users;

import java.util.List;
import java.util.Map;

public interface IUserService {
    public UserRequestDto getUserById(Integer id);
    public List<UserRequestDto> getAllUsers();
    public UserResponseDto createUser(UserRequestDto userRequestDto);
    public void deleteUser(Integer id);
    public UserRequestDto updateUser(UserRequestDto userRequestDto);
    public  Users partialUpdateUser(Integer id, Map<String, Object> updates);

}
