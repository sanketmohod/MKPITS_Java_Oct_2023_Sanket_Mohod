package com.example.bank.account.dto.request;


import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotNull;
import lombok.*;

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
    private String accountHolder;
    private String lastName;
    private String mobile;
    private Double balance;
    private Integer age;
    private String email;
    private String gender;
    private Double rateOfInterest;
    private String accountType;
    private LocalDate dateOfBirth;
}
