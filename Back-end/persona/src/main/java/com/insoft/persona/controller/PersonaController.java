package com.insoft.persona.controller;

import com.insoft.persona.command.PersonaCommand;
import com.insoft.persona.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost")
@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/listado-personas")
    public List<PersonaCommand> findAll() {
        return personaService.findAll();
    }

    @PostMapping("/registro-persona")
    public void registrarPersona(@RequestBody PersonaCommand personaCommand){
          personaService.registrarPersona(personaCommand);
    }

    @GetMapping("/buscar-documento")
    public PersonaCommand encontrarPorDocumento(String documento){
        return personaService.encontrarPersonaPorDocumento(documento);
    }
}
