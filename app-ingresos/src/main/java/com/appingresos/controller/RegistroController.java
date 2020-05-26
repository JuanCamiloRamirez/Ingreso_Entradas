package com.appingresos.controller;

import com.appingresos.command.RegistroCommand;
import com.appingresos.model.Registro;
import com.appingresos.service.RegistroService;
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
