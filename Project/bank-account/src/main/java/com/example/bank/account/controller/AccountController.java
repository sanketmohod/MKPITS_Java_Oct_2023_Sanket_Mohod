package com.example.bank.account.controller;

import com.example.bank.account.dto.request.AccountRequestDto;
import com.example.bank.account.dto.response.AccountResponseDto;
import com.example.bank.account.service.IUserService;
import com.example.bank.account.validator.UserValidator;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
@RestController
public class AccountController {
    @Autowired
    IUserService userService;
    @Autowired
    UserValidator userValidator;

    //get accounts  by id
    @GetMapping(path = "/accounts/{userId}")
    public ResponseEntity<Object> getAccountDetails(@PathVariable("userId") Integer userId) {
        AccountResponseDto accountResponse = userService.getAccountById(userId);
        return ResponseEntity.ok(accountResponse);
    }
    //get all accounts
    @GetMapping(path = "/accounts", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAllAccountsData() {
        List<AccountResponseDto> accountResponseList= userService.getAllAccounts();
        return ResponseEntity.ok(accountResponseList);

    }
    //delete account details
    @DeleteMapping(path = "/accounts/{id}")
    public ResponseEntity<Object> deleteAccountsDetails(@PathVariable("id") Integer id) {
        AccountResponseDto accountResponse = userService.deleteAccountsById(id);
        if(accountResponse !=null){
            return new ResponseEntity<>("User with ID "+id +"deleted successfully", HttpStatus.OK);
        }else{
            return new ResponseEntity<>("User with ID "+id +"Not Found", HttpStatus.NOT_FOUND);
        }
    }
    //update Accounts Details
    @PutMapping(path = "/accounts/{id}")
    public ResponseEntity<Object> updateAccounts(@PathVariable("id") Integer id, @RequestBody AccountRequestDto accountRequestDto) {
        accountRequestDto.setId(id);
        AccountRequestDto accountsDtoReturn = userService.updateAccounts(accountRequestDto);
        return ResponseEntity.ok(accountsDtoReturn);
    }



}
