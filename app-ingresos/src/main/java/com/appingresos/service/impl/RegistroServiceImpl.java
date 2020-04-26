package com.appingresos.service.impl;

import com.appingresos.command.RegistroCommand;
import com.appingresos.fabrica.TipoRegistroFabrica;
import com.appingresos.repository.RegistroRepository;
import com.appingresos.service.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistroServiceImpl implements RegistroService {

    @Autowired
    private RegistroRepository registroRepository;

    @Autowired
    private TipoRegistroFabrica tipoRegistroFabrica;

    @Override
    public List<RegistroCommand> findAll() {
        return tipoRegistroFabrica.entityToCommand(registroRepository.findAll());
    }
}
