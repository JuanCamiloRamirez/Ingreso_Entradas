package com.appingresos.controller;

import com.appingresos.command.PersonaCommand;
import com.appingresos.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost")
@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/v1/listado-personas")
    public List<PersonaCommand> findAll() {
        return personaService.findAll();
    }

    @PostMapping("/registro-persona")
    public void registrarPersona(@RequestBody PersonaCommand personaCommand){
          personaService.registrarPersona(personaCommand);
    }
}
