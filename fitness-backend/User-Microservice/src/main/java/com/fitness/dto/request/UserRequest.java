package com.fitness.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {

    @NotBlank(message = "Email should not be blank")
    @Email(message = "Email format incorrect")
    private String email;

    @NotBlank(message = "Password should not be blank")
    @Size(min = 6, message = "Password should atleast have 6 characters")
    private String password;

    @NotBlank(message = "User name should not be empty")
    @Size(min = 2, message = "Username should atleast have 2 characters")
    private String firstName;

    private String lastName;
}
