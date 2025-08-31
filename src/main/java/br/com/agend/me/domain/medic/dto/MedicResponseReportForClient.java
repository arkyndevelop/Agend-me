package br.com.agend.me.domain.medic.dto;

import br.com.agend.me.domain.medic.Medic;

public record MedicResponseReportForClient(
        String name,
        Integer crm,
        String specialty,
        String email,
        String cellphone
) {
    public static MedicResponseReportForClient fromEntity(Medic medic) {
        return new MedicResponseReportForClient(
                medic.getName(),
                medic.getMedic_crm(),
                medic.getSpecialty(),
                medic.getEmail(),
                medic.getCellphone()
        );
    }
}
