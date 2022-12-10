package com.example.demo;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Objects;
import java.util.UUID;


@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "app_user")
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "name", nullable = false)
    private String name;

    @Size(min = 4, max = 30)
    @NotEmpty(message = "does not make any sense")
    @NotNull(message = "password should be filled")
    @Column(name = "password")
    private String password;

    @Email
    @NotBlank
    @NotEmpty
    @NotNull
    @Column(name = "mail", nullable = false)
    private String mail;

}