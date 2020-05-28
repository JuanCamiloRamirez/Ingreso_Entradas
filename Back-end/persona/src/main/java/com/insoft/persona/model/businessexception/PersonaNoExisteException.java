package com.insoft.persona.model.businessexception;

public class PersonaNoExisteException extends RuntimeException {
    public PersonaNoExisteException(String mensaje){
        super(mensaje);
    }
}