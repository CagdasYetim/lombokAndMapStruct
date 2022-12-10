package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Objects;
import java.util.UUID;


@Getter
@Setter
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AppUser appUser = (AppUser) o;
        return id != null && Objects.equals(id, appUser.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}