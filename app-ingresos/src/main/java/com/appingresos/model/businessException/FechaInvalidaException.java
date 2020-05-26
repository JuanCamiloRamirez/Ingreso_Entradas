package com.appingresos.model.businessException;

public class FechaInvalidaException extends RuntimeException{
    public FechaInvalidaException(String mensaje) {
        super(mensaje);
    }
}
