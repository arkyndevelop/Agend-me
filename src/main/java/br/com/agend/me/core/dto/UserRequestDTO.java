package br.com.agend.me.core.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.br.CPF;



public interface UserRequestDTO {

    @NotBlank(message = "Campo nome não pode ser vazio!")
    @Size(min = 3, max = 60)
    String name();


    @NotBlank(message = "Campo CPF não pode ser vazio!")
    @CPF(message = "CPF Invalido!")
    String cpf();

    @NotBlank(message = "Campo E-mail não pode ser vazio!")
    @Email(message = "Campo E-mail invalido!")
    String email();

    @NotBlank(message = "Campo telefone não pode ser vazio!")
    @Size(max = 14)
    String cellphone();

    @NotBlank(message = "Campo senha não pode ser vazio!")
    @Size(min = 8)
    String password();




}
