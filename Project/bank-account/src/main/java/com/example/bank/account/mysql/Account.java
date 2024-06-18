package com.example.bank.account.mysql;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "account")
public class Account {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "account_id")
    private Integer id;
    @Column(name = "customer_id")
    private Integer userId;
    @Column(name = "account_holder")
    private String accountHolder;
    @Column(name = "account_type")
    private String accountType;
    @Column(name = "account_number")
    private String accountNumber;
    @Column(name = "rate_of_interest")
    private Double rateOfInterest;
    @Column(name = "balance")
    private Double balance;
    @Column(name = "created_by")
    private Integer createdBy;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "updated_by")
    private Integer updatedBy;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
