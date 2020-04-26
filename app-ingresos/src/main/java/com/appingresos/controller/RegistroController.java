package com.appingresos.controller;

import com.appingresos.command.RegistroCommand;
import com.appingresos.service.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/registro")
public class RegistroController {

    @Autowired
    private RegistroService registroService;

    @GetMapping("/v1/listado-registros")
    public List<RegistroCommand> findAll() {
        return registroService.findAll();
    }

}
