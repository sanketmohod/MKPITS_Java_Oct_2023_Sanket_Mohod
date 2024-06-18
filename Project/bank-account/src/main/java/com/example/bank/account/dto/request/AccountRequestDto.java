package com.example.bank.account.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountRequestDto {
    private Integer id;
    private Integer userId;
    private String accountHolder;
    private String accountType;
    private String accountNumber;
    private Double rateOfInterest;
    private Double balance;

}
