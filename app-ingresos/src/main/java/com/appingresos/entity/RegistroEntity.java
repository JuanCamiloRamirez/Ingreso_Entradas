package com.appingresos.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table( name = "REGISTRO")
@NoArgsConstructor
public class RegistroEntity {

    @Id
    @GeneratedValue
    @Column( name = "idRegistro")
    private int idRegistro;
    @Column( name = "documento")
    private String documento;
    @Column( name = "fechaEntrada")
    private String fechaEntrada;
    @Column( name = "fechaSalida")
    private String fechaSalida;
    @Column( name = "finalizado")
    private boolean finalizado;
}
