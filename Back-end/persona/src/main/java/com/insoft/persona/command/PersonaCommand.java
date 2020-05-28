package com.insoft.persona.command;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@NoArgsConstructor
public class PersonaCommand {

    private int idPersona;
    private String tipoDocumento;
    private String numeroDocumento;
    private String nombre;
    private String apellido;
    private String cargo;

}
