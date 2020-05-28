package com.insoft.registro.controller;

import com.insoft.registro.command.RegistroCommand;
import com.insoft.registro.service.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost")
@RestController
@RequestMapping("/registro")
public class RegistroController {

    @Autowired
    private RegistroService registroService;

    @GetMapping("/v1/listado-registros")
    public List<RegistroCommand> findAll() {
        return registroService.findAll();
    }

    @PostMapping("/registrar")
    public void crearRegistro(String documento){ registroService.crearRegistro(documento);
    }

}
