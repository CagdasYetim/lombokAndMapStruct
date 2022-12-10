package com.example.demo;

import lombok.Data;

import javax.validation.constraints.*;
import java.io.Serializable;

/**
 * A DTO for the {@link AppUser} entity
 */
@Data
public class AppUserDto implements Serializable {
    private final String name;
    @Size(min = 4, max = 30)
    @NotEmpty(message = "does not make any sense")
    @NotNull(message = "password should be filled")
    private final String password;
    @Email
    @NotBlank
    @NotEmpty
    @NotNull
    private final String mail;
}