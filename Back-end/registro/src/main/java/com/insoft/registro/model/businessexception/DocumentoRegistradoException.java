package com.insoft.registro.model.businessexception;

public class DocumentoRegistradoException extends RuntimeException {
    public DocumentoRegistradoException(String mensaje) {
        super(mensaje);
    }
}
