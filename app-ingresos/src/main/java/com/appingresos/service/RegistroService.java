package com.appingresos.service;

import com.appingresos.command.RegistroCommand;

import java.util.List;

public interface RegistroService {

    List<RegistroCommand> findAll();

}
