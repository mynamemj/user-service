package com.example.userservice.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class RequestLogin {
    @NotNull(message = "Email cannot be null")
    @Size(min=2, message = "Email not be less then two characters")
    private String email;

    @NotNull(message = "Password cannot be null")
    @Size(min=8,message = "Password must be grater then 8 characters")
    private String pasword;

}
