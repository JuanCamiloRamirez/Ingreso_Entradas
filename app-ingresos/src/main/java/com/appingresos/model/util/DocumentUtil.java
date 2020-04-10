package com.appingresos.model.util;

import com.appingresos.model.Registro;

import java.util.List;

public class DocumentUtil {

    public Registro consultarRegistrosPorDocumento(List<Registro> listaPrueba,String documento){
        Registro registroAMostrar = null;
        for(Registro registroIterando:listaPrueba){
            if(registroIterando.getDocumento().equals(documento)){
                registroAMostrar = registroIterando;
            }
        }
        return  registroAMostrar;
    }

}
