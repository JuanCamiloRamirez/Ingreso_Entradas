package com.insoft.registro.dto;

import lombok.Data;

@Data
public class PersonaDTO {

    private int idPersona;
    private String tipoDocumento;
    private String numeroDocumento;
    private String nombre;
    private String apellido;
    private String cargo;

}
