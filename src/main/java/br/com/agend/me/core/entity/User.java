package br.com.agend.me.core.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {

    @Column(nullable = false, length = 40)
    @Size(min = 3)
    private String name;

    @Column(nullable = false, unique = true)
    private String cpf;

    @Column(nullable = false, unique = true)
    @Size(min = 10)
    private String email;

    @Column(nullable = false, unique = true)
    private String cellphone;

    @Column(nullable = false)
    @Size(min = 8)
    private String password;

    @Column(nullable = false, updatable = false)
    private Instant dateRegister = Instant.now();
}
