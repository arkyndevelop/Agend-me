package br.com.agend.me.domain.client;

import br.com.agend.me.core.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "CLIENTS")
public class Client extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "CLIENTS_ID")
    private UUID clients_id;


    public Client(String name, String cpf, String email, String cellphone, String password, Instant dateRegister) {
        super(name, cpf, email, cellphone, password, dateRegister);
    }


}
