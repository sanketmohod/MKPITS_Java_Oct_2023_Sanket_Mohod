package com.example.demo.dto.request;


import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)

public class UserRequestDto {
    private Integer id;
    @NotNull(message = "'username' cannot be null")
    @Size(min = 6, max = 45, message = "'username' can be minimum 6 character and maximum 45 characters")
    private String username;
    @NotNull(message = "'password' can not be null")
    @Size(min = 6, max = 12, message = "'password' cam be minimum 6 character amd maximum 12 characters")
    @Pattern(regexp ="^(?=.[A-Za-z])(?=.\\d)(?=.[@$!%#?&])[A-Za-z\\d@$!%*#?&]{8}$", message = "Min 1 uppercase letter. Min 1 lowercase letter.Min 1 special character.Min 1 number.Min 8 characters.")
    private String password;
    @NotNull(message = "'firstName' can not be null")
    @Size(max = 20, message = "'firstName' cam be maximum 20 characters")
    @Pattern(regexp = "[a-zA-Z]+", message = "'firstName' can only contain alphabets")
    private String firstName;
    @NotNull(message = "'lastName' can not be null")
    @Size(max = 20, message = "'lastName' cam be maximum 20 characters")
    @Pattern(regexp = "[a-zA-Z]+", message = "'lastName' can only contain alphabets")
    private String lastName;
    private LocalDate dateOfBirth;
    @NotNull(message = "'mobile' can not be null")
    @Size(message = "'mobile' having 10 digit")
    @Pattern(regexp = "^[0-9]+", message = "'mobile number' can only contain number")
    private String mobile;
    @NotNull(message = "'email' can not be null")
    @Size(min = 10, max = 50, message = "'email' cam be minimum 10 character amd maximum 50 characters")
    @Pattern(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}", message = "'email' contain Ex:- xyz3@gmail.com")
    @Email
    private String email;
}
