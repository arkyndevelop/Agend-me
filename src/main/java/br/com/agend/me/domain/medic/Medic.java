package br.com.agend.me.domain.medic;

import br.com.agend.me.core.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "MEDICS")
public class Medic extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(nullable = false, unique = true, name = "MEDICS_ID")
    private UUID medics_id;

    @Column(nullable = false, unique = true, name = "MEDIC_CRM")
    private Integer medic_crm;

    @Column(nullable = false, name = "SPECIALTY")
    private String specialty;

    public Medic(String name, String cpf, String email, String cellphone, String password, Instant dateRegister) {
        super(name, cpf, email, cellphone, password, dateRegister);
    }
}
