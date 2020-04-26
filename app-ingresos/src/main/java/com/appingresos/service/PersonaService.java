package com.appingresos.service;


import com.appingresos.command.PersonaCommand;

import java.util.List;

public interface PersonaService {

    List<PersonaCommand> findAll();

}
