package com.example.bank.account.service;

import com.example.bank.account.dto.request.AccountRequestDto;
import com.example.bank.account.dto.request.UserRequestDto;
import com.example.bank.account.dto.response.AccountResponseDto;
import com.example.bank.account.dto.response.UserPostResponse;
import com.example.bank.account.dto.response.UserResponseDto;
import com.example.bank.account.mysql.Users;

import java.util.List;
import java.util.Map;

public interface IUserService {



    // Users methods
    public UserResponseDto getUserById(Integer id);

    public List<UserResponseDto> getAllUsers();

    public UserResponseDto deleteUserById(Integer id);

    public Users partialUpdateUser(Integer id, Map<String, Object> updates);


    public UserRequestDto updateUser(UserRequestDto userRequestDto);

    public UserPostResponse createUser(UserRequestDto userRequestDto) ;


    // Account Methods

    public AccountResponseDto getAccountById(Integer userId);

    public List<AccountResponseDto> getAllAccounts();

    public AccountResponseDto deleteAccountsById(Integer id);

    public AccountRequestDto updateAccounts(AccountRequestDto accountRequestDto);

}
