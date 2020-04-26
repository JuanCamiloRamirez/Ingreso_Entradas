package com.appingresos.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table( name = "REGISTRO")
@NoArgsConstructor
public class RegistroEntity {

    @Id
    @Column( name = "idRegistro")
    private int idRegistro;
    @Column( name = "documento")
    private String documento;
    @Column( name = "fechaEntrada")
    private Date fechaEntrada;
    @Column( name = "fechaSalida")
    private Date fechaSalida;
}
