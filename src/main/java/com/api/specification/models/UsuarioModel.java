package com.api.specification.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Data
@Table(name = "TB_USUARIO")

@Entity
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID usuarioId;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private Integer idade;


    private String status;
}
