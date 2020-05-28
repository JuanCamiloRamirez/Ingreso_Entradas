package com.insoft.registro.service;


import com.insoft.registro.command.RegistroCommand;

import java.util.List;

public interface RegistroService {

    List<RegistroCommand> findAll();

    void crearRegistro(String documento);
}
