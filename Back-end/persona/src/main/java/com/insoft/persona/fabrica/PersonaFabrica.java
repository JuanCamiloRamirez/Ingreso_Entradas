package com.insoft.persona.fabrica;

import com.insoft.persona.command.PersonaCommand;
import com.insoft.persona.entity.PersonaEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonaFabrica {

    public List<PersonaCommand> entityToCommand(List<PersonaEntity> listaPersonaEntity) {
        List<PersonaCommand> listaPersonaCommand = new ArrayList<>();
        listaPersonaEntity.forEach(e -> listaPersonaCommand.add(entityToCommand(e)));
        return listaPersonaCommand;
    }

    public PersonaCommand entityToCommand(PersonaEntity personaEntity) {
        PersonaCommand personaCommand = new PersonaCommand();
        personaCommand.setNombre(personaEntity.getNombre());
        personaCommand.setApellido(personaEntity.getApellido());
        personaCommand.setTipoDocumento(personaEntity.getTipoDocumento());
        personaCommand.setNumeroDocumento(personaEntity.getNumeroDocumento());
        personaCommand.setCargo(personaEntity.getCargo());
        return personaCommand;
    }

    public PersonaEntity commandToEntity(PersonaCommand personaCommand){
        PersonaEntity personaEntity = new PersonaEntity();
        personaEntity.setNombre(personaCommand.getNombre());
        personaEntity.setApellido(personaCommand.getApellido());
        personaEntity.setTipoDocumento(personaCommand.getTipoDocumento());
        personaEntity.setNumeroDocumento(personaCommand.getNumeroDocumento());
        personaEntity.setCargo(personaCommand.getCargo());
        return personaEntity;
    }

}
