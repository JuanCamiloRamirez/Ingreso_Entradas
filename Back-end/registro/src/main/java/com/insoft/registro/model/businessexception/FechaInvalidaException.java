package com.insoft.registro.model.businessexception;

public class FechaInvalidaException extends RuntimeException{
    public FechaInvalidaException(String mensaje) {
        super(mensaje);
    }
}
