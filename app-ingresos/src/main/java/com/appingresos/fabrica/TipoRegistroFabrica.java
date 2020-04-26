package com.appingresos.fabrica;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.appingresos.command.RegistroCommand;
import com.appingresos.entity.RegistroEntity;

@Component
public class TipoRegistroFabrica {

    public List<RegistroCommand> entityToCommand(List<RegistroEntity> listaRegistroEntity) {
        List<RegistroCommand> listaRegistroCommand = new ArrayList<>();
        listaRegistroEntity.forEach(e -> listaRegistroCommand.add(entityToCommand(e)));
        return listaRegistroCommand;
    }

    private RegistroCommand entityToCommand(RegistroEntity registroEntity) {
    	RegistroCommand registroCommand = new RegistroCommand();
    	registroCommand.setIdRegistro(registroEntity.getIdRegistro());
    	registroCommand.setDocumento(registroEntity.getDocumento());
    	registroCommand.setFechaEntrada(registroEntity.getFechaEntrada());
        registroCommand.setFechaSalida(registroEntity.getFechaSalida());
        return registroCommand;
    }

}
