package com.appingresos.service.impl;

import com.appingresos.command.RegistroCommand;
import com.appingresos.entity.RegistroEntity;
import com.appingresos.fabrica.TipoRegistroFabrica;
import com.appingresos.model.businessException.DocumentoRegistradoException;
import com.appingresos.model.util.DateUtil;
import com.appingresos.repository.PersonaRepository;
import com.appingresos.repository.RegistroRepository;
import com.appingresos.service.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class RegistroServiceImpl implements RegistroService {

    private static final String DOCUMENTO_NO_REGISTRADO = "¡El documento no se encuentra registrado!";
    private static final String REGISTRO_EXITOSO = "¡El registro ha sido exitoso, BIENVENIDO!";

    @Autowired
    private PersonaRepository personaRepository;

    @Autowired
    private RegistroRepository registroRepository;

    @Autowired
    private TipoRegistroFabrica tipoRegistroFabrica;

    @Override
    public List<RegistroCommand> findAll() {
        return tipoRegistroFabrica.entityToCommand(registroRepository.findAll());
    }

    @Override
    public void crearRegistro(String documento) {
        validarDocumentoRegistrado(documento);
        RegistroEntity registroEntity = validarIngresoOSalida(documento);
        registroRepository.save(registroEntity);;
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
        if(registroEntity == null || registroEntity.isFinalizado()){
            registroRetorno.setDocumento(documento);
            registroRetorno.setFechaEntrada(timestampActual);
            registroRetorno.setFinalizado(false);
        }else{
            registroRetorno.setIdRegistro(registroEntity.getIdRegistro());
            registroRetorno.setDocumento(documento);
            registroRetorno.setFechaEntrada(registroEntity.getFechaEntrada());
            registroRetorno.setFechaSalida(timestampActual);
            registroRetorno.setFinalizado(true);
        }

        return  registroRetorno;
    }

    private void validarDocumentoRegistrado(String documento) {
       if(personaRepository.findByNumeroDocumento(documento) == null){
           throw  new DocumentoRegistradoException(DOCUMENTO_NO_REGISTRADO);
       }
    }
}
