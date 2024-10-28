package com.yquintero.taller3.models;


import com.yquintero.taller3.models.Interfaces.UsuarioInterface;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "usuario")
@Data
public class Usuario implements UsuarioInterface {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "id_persona")
    private Persona idPersona;

}
