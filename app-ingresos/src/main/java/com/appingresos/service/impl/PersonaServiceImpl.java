package com.appingresos.service.impl;

import com.appingresos.command.PersonaCommand;
import com.appingresos.fabrica.TipoPersonaFabrica;
import com.appingresos.repository.PersonaRepository;
import com.appingresos.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Autowired
    private TipoPersonaFabrica tipoPersonaFabrica;


    @Override
    public List<PersonaCommand> findAll() {
        return tipoPersonaFabrica.entityToCommand(personaRepository.findAll());
    }
}
