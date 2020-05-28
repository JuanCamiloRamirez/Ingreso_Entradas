package com.insoft.registro.model.businessexception;

public class PersonaNoExisteException extends RuntimeException {
    public PersonaNoExisteException(String mensaje){
        super(mensaje);
    }
}