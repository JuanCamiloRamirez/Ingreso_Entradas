package com.appingresos.model.businessException;

public class DocumentoRegistradoException extends RuntimeException {
    public DocumentoRegistradoException(String mensaje) {
        super(mensaje);
    }
}
