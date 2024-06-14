package com.example.demo.dto.response;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserPostResponseDto {
    private Integer id;
    private String username;
    private String firstName;
}