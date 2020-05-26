package com.appingresos.service;

import com.appingresos.command.RegistroCommand;
import com.appingresos.entity.RegistroEntity;
import com.appingresos.model.Registro;

import java.util.List;

public interface RegistroService {

    List<RegistroCommand> findAll();

    void crearRegistro(String documento);
}
