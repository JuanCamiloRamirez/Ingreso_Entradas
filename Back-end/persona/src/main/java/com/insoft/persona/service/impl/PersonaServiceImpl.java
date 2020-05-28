package com.insoft.persona.service.impl;

import com.insoft.persona.command.PersonaCommand;
import com.insoft.persona.entity.PersonaEntity;
import com.insoft.persona.fabrica.PersonaFabrica;
import com.insoft.persona.model.businessexception.DocumentoRegistradoException;
import com.insoft.persona.repository.PersonaRepository;
import com.insoft.persona.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    private static final String DOCUMENTO_REGISTRADO = "¡El documento ya se encuentra registrado!";
    private static final String PERSONA_REGISTRADA_EXITOSAMENTE = "¡La persona se ha registrado exitosamente!";

    @Autowired
    private PersonaRepository personaRepository;

    @Autowired
    private PersonaFabrica personaFabrica;


    @Override
    public List<PersonaCommand> findAll() {
        return personaFabrica.entityToCommand(personaRepository.findAll());
    }

    @Override
    public void registrarPersona(PersonaCommand personaCommand) {
        validarDocumentoRegistrado(personaCommand.getNumeroDocumento());
        PersonaEntity personaEntity = personaFabrica.commandToEntity(personaCommand);
        personaRepository.save(personaEntity);
    }

    @Override
    public PersonaCommand encontrarPersonaPorDocumento(String numeroDocumento) {
        return personaFabrica.entityToCommand(personaRepository.findByNumeroDocumento(numeroDocumento));
    }

    public void validarDocumentoRegistrado(String numeroDocumento){
         if(personaRepository.findByNumeroDocumento(numeroDocumento) != null){
             throw new DocumentoRegistradoException(DOCUMENTO_REGISTRADO);
         }
    }

}
