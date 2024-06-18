package com.example.bank.account.dto.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserPostResponse {
    private Integer id;
    private String username;
    private String accountType;
    private Double balance;
}
