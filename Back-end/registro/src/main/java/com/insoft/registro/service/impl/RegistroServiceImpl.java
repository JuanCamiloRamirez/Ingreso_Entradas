package com.insoft.registro.service.impl;

import com.insoft.registro.command.RegistroCommand;
import com.insoft.registro.entity.RegistroEntity;
import com.insoft.registro.fabrica.RegistroFabrica;
import com.insoft.registro.model.businessexception.DocumentoRegistradoException;
import com.insoft.registro.model.util.DateUtil;
import com.insoft.registro.repository.RegistroRepository;
import com.insoft.registro.restclient.PersonaRestClient;
import com.insoft.registro.service.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class RegistroServiceImpl implements RegistroService {

    private static final String DOCUMENTO_NO_REGISTRADO = "¡El documento no se encuentra registrado!";
    private static final String REGISTRO_EXITOSO = "¡El registro ha sido exitoso, BIENVENIDO!";

    @Autowired
    private PersonaRestClient personaRestClient;

    @Autowired
    private RegistroRepository registroRepository;

    @Autowired
    private RegistroFabrica tipoRegistroFabrica;

    @Override
    public List<RegistroCommand> findAll() {

        return tipoRegistroFabrica.entityToCommand(registroRepository.findAll());
    }

    @Override
    public void crearRegistro(String documento) {
       // validarDocumentoRegistrado(documento);
        RegistroEntity registroEntity = validarIngresoOSalida(documento);
        registroRepository.save(registroEntity);
    }

    private RegistroEntity validarIngresoOSalida(String documento) {
        String timestampActual = DateUtil.convertDateToString(new Date());
        RegistroEntity registroRetorno = new RegistroEntity();
        RegistroEntity registroEntity = null;
        for (RegistroEntity registro : registroRepository.findAll()) {
            if(registro.getDocumento().equals(documento)){
                registroEntity = registro;
            }
        }
        if(registroEntity == null || registroEntity.getFinalizado().equals("1")){
            registroRetorno.setDocumento(documento);
            registroRetorno.setFechaEntrada(timestampActual);
            registroRetorno.setFinalizado("0");
        }else{
            registroRetorno.setIdRegistro(registroEntity.getIdRegistro());
            registroRetorno.setDocumento(documento);
            registroRetorno.setFechaEntrada(registroEntity.getFechaEntrada());
            registroRetorno.setFechaSalida(timestampActual);
            registroRetorno.setFinalizado("1");
        }
        return  registroRetorno;
    }

    private void validarDocumentoRegistrado(String documento) {
       if(personaRestClient.encontrarPorDocumento(documento) == null){
           throw  new DocumentoRegistradoException(DOCUMENTO_NO_REGISTRADO);
       }
    }


}
