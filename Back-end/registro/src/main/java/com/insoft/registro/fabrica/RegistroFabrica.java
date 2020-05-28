package com.insoft.registro.fabrica;

import com.insoft.registro.command.RegistroCommand;
import com.insoft.registro.entity.RegistroEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RegistroFabrica {

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
        registroCommand.setFinalizado(registroEntity.getFinalizado());
        return registroCommand;
    }

    public RegistroEntity commandToEntity(RegistroCommand registroCommand) {
        RegistroEntity registroEntity = new RegistroEntity();
        registroEntity.setDocumento(registroCommand.getDocumento());
        registroEntity.setFechaEntrada(registroCommand.getFechaEntrada());
        registroEntity.setFechaSalida(registroCommand.getFechaSalida());
        return registroEntity;
    }
}
