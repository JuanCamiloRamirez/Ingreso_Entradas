package com.appingresos.model.util;

import java.util.Date;

public class Validator {

    public static void validarFechaNula(Date fecha, String mensaje) throws BusinessException{
        if(fecha == null){
            throw new BusinessException(mensaje);
        }
    }

}
