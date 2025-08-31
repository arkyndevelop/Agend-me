package br.com.agend.me.domain.medic.dto;

import br.com.agend.me.core.dto.UserRequestDTO;
import br.com.agend.me.domain.medic.Medic;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;

public record MedicRequestRegister(
        @NotBlank(message = "Nome não pode ficar em branco!")
        String name,

        @NotBlank(message = "CPF não pode ficar em branco!")
        @CPF(message = "CPF inválido!")
        String cpf,

        @NotNull(message = "CRM não pode ficar vazio!")
        Integer medic_crm,

        @NotBlank(message = "Especialidade não pode ficar em branco!")
        String specialty,

        @NotBlank(message = "E-mail não pode ficar em branco!")
        @Email(message = "E-mail inválido!")
        String email,

        @NotBlank(message = "Celular não pode ficar em branco!")
        String cellphone,

        @NotBlank(message = "Senha não pode ficar em branco!")
        String password

) implements UserRequestDTO {

    public Medic toMedic(){
        Medic medic = new Medic();

        medic.setName(name);
        medic.setCpf(cpf);
        medic.setMedic_crm(medic_crm);
        medic.setSpecialty(specialty);
        medic.setEmail(email);
        medic.setCellphone(cellphone);
        medic.setPassword(password);


        return medic;
    }
}
