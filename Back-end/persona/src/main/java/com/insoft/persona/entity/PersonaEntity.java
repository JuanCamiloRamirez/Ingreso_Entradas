package com.insoft.persona.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table( name = "PERSONA")
@NoArgsConstructor
public class PersonaEntity {

    @Id
    @GeneratedValue
    @Column( name = "idPersona")
    private int idPersona;
    @Column( name = "nombre")
    private String nombre;
    @Column( name = "apellido")
    private String apellido;
    @Column( name = "tipoDocumento")
    private String tipoDocumento;
    @Column( name = "numeroDocumento")
    private String numeroDocumento;
    @Column( name = "cargo")
    private String cargo;

}
