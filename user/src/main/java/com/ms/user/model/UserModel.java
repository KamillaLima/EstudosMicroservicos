package com.ms.user.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "tb_users")
@Getter
@Setter
public class UserModel implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID userId;
    //usamos o UUID pra evitar possíveis conflitos com Id's sequenciais ,
    private String name;
    private String email;

}
