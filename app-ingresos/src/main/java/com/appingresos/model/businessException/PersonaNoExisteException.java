package com.appingresos.model.businessException;

public class PersonaNoExisteException extends RuntimeException {
    public PersonaNoExisteException(String mensaje){
        super(mensaje);
    }
}