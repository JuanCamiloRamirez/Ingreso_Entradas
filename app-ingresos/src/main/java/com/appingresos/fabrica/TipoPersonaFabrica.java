package com.appingresos.fabrica;

import com.appingresos.command.PersonaCommand;
import com.appingresos.entity.PersonaEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TipoPersonaFabrica {

    public List<PersonaCommand> entityToCommand(List<PersonaEntity> listaPersonaEntity) {
        List<PersonaCommand> listaPersonaCommand = new ArrayList<>();
        listaPersonaEntity.forEach(e -> listaPersonaCommand.add(entityToCommand(e)));
        return listaPersonaCommand;
    }

    private PersonaCommand entityToCommand(PersonaEntity personaEntity) {
        PersonaCommand personaCommand = new PersonaCommand();
        personaCommand.setIdPersona(personaEntity.getIdPersona());
        personaCommand.setNombre(personaEntity.getNombre());
        personaCommand.setApellido(personaEntity.getApellido());
        personaCommand.setTipoDocumento(personaEntity.getTipoDocumento());
        personaCommand.setNumeroDocumento(personaEntity.getNumeroDocumento());
        personaCommand.setCargo(personaEntity.getCargo());
        return personaCommand;
    }

}
