package com.appingresos.controller;

import com.appingresos.command.PersonaCommand;
import com.appingresos.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/v1/listado-personas")
    public List<PersonaCommand> findAll() {

        return personaService.findAll();
    }

}
