package com.example.bank.account.dto.response;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ErrorResponseDto {
    private int httStatusCode;
    private String errorMessage;
}
