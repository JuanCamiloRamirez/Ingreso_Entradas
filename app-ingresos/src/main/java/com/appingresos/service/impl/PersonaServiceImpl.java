package com.appingresos.service.impl;

import com.appingresos.command.PersonaCommand;
import com.appingresos.entity.PersonaEntity;
import com.appingresos.fabrica.TipoPersonaFabrica;
import com.appingresos.model.businessException.DocumentoRegistradoException;
import com.appingresos.repository.PersonaRepository;
import com.appingresos.service.PersonaService;
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
    private TipoPersonaFabrica tipoPersonaFabrica;


    @Override
    public List<PersonaCommand> findAll() {
        return tipoPersonaFabrica.entityToCommand(personaRepository.findAll());
    }

    @Override
    public void registrarPersona(PersonaCommand personaCommand) {
        validarDocumentoRegistrado(personaCommand.getNumeroDocumento());
        PersonaEntity personaEntity = tipoPersonaFabrica.commandToEntity(personaCommand);
        personaRepository.save(personaEntity);
    }

    public void validarDocumentoRegistrado(String numeroDocumento){
         if(personaRepository.findByNumeroDocumento(numeroDocumento) != null){
             throw new DocumentoRegistradoException(DOCUMENTO_REGISTRADO);
         }
    }

}
