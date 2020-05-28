package com.insoft.registro.model.util;


import com.insoft.registro.model.businessexception.BusinessException;

import java.util.Date;


public class Validator {

    public static void validarFechaNula(Date fecha, String mensaje) throws BusinessException {
        if(fecha == null){
            throw new BusinessException(mensaje);
        }
    }

    public static void validarFechaVacia(Date fecha, String mensaje) throws BusinessException {
        if("".equals(fecha)){
            throw new BusinessException(mensaje);
        }
    }


    public static void validarDocumentoNulo(String documento, String mensaje) throws BusinessException {
        if(documento == null){
            throw new BusinessException(mensaje);
        }
    }

    public static void validarDocumentoVacio(String documento, String mensaje) throws BusinessException {
        if("".equals(documento)){
            throw new BusinessException(mensaje);
        }
    }
}
