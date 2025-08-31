package br.com.agend.me.domain.medic.dto;

import br.com.agend.me.domain.medic.Medic;

import java.time.Instant;
import java.util.Date;

public record MedicResponseReportForAdm(
        String name,
        String cpf,
        Integer crm,
        String specialty,
        String email,
        String cellphone,
        Instant dateRegister
) {
    public static MedicResponseReportForAdm fromEntity(Medic medic){
        return new MedicResponseReportForAdm(
                medic.getName(),
                medic.getCpf(),
                medic.getMedic_crm(),
                medic.getSpecialty(),
                medic.getEmail(),
                medic.getCellphone(),
                medic.getDateRegister()
        );
    }
}
