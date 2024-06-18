package com.example.bank.account.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountResponseDto {
    private Integer userId;
    private String holderName;
    private String accountType;
    private Double rateOfInterest;
    private Double balance;
}
