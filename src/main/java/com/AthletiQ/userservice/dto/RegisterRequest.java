package com.AthletiQ.userservice.dto;

import lombok.Data;

@Data
public class RegisterRequest
{
    private String firstName;
    private String lastname;
    private String email;
    private String password;
}
