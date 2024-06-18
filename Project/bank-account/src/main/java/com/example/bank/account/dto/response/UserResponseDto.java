package com.example.bank.account.dto.response;


import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponseDto {
    private Integer id;
    private String firstName;
    private String lastName;
    private String username;
    private LocalDate dateOfBirth;
    private Integer age;
    private String mobile;
    private String email;
}
