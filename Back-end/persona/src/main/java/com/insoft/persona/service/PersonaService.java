package com.insoft.persona.service;

import com.insoft.persona.command.PersonaCommand;
import com.insoft.persona.entity.PersonaEntity;

import java.util.List;

public interface PersonaService {

    List<PersonaCommand> findAll();

    void registrarPersona(PersonaCommand personaCommand);

    PersonaCommand encontrarPersonaPorDocumento(String numeroDocumento);
}
