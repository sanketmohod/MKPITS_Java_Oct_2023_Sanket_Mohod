package com.example.bank.account.dto.request;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserRequestDto {
    private Integer id;
    private String username;
    private String firstName;
    private String lastName;
    private String mobile;
    private String email;
    private Double balance;
    private String accountNumber;
    private String gender;
    private LocalDate dateOfBirth;
}
