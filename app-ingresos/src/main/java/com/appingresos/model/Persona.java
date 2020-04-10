package com.appingresos.model;

import com.appingresos.model.businessException.BusinessException;
import com.appingresos.model.util.Validator;

public class Persona {
    private int idPersona;
    private String tipoDocumento;
    private String numeroDocumento;
    private String nombre;
    private String apellido;
    private String cargo;

    public static final String TIPO_DOCUMENTO_REQUERIDO = "El tipo de documento es requerido";
    public static final String TIPO_DOCUMENTO_INVALIDO = "El tipo de documento es invalido";
    public static final String NUMERO_DOCUMENTO_REQUERIDO = "El número de documento es requerido";
    public static final String NOMBRE_REQUERIDO = "El nombre es requerido";
    public static final String APELLIDO_REQUERIDO = "El apellido es requerido";
    public static final String CARGO_REQUERIDO = "El cargo es requerido";

    public Persona() {
        super();
    }

    public static class PersonaBuilder{
        private int idPersona;
        private String tipoDocumento;
        private String numeroDocumento;
        private String nombre;
        private String apellido;
        private String cargo;

        public PersonaBuilder setIdPersona(int idPersona) {
            this.idPersona = idPersona;
            return  this;
        }

        public PersonaBuilder setTipoDocumento(String tipoDocumento) {
            this.tipoDocumento = tipoDocumento;
            return  this;
        }

        public PersonaBuilder setNumeroDocumento(String numeroDocumento) {
            this.numeroDocumento = numeroDocumento;
            return  this;
        }

        public PersonaBuilder setNombre(String nombre) {
            this.nombre = nombre;
            return  this;
        }

        public PersonaBuilder setApellido(String apellido) {
            this.apellido = apellido;
            return  this;
        }

        public PersonaBuilder setCargo(String cargo) {
            this.cargo = cargo;
            return  this;
        }

        public Persona build() throws BusinessException {
            Persona persona = new Persona();
            persona.idPersona = this.idPersona;
            Validator.validarTipoDocumentoVacio(tipoDocumento,TIPO_DOCUMENTO_REQUERIDO);
            Validator.validarTipoDocumentoNulo(tipoDocumento,TIPO_DOCUMENTO_REQUERIDO);
            Validator.ValidarTipoDocumentoCedula(tipoDocumento,TIPO_DOCUMENTO_INVALIDO);
            persona.tipoDocumento = this.tipoDocumento;
            Validator.validarDocumentoVacio(numeroDocumento,NUMERO_DOCUMENTO_REQUERIDO);
            Validator.validarDocumentoNulo(numeroDocumento,NUMERO_DOCUMENTO_REQUERIDO);
            persona.numeroDocumento = this.numeroDocumento;
            Validator.validarCadenaVacia(nombre,NOMBRE_REQUERIDO);
            persona.nombre = this.nombre;
            Validator.validarCadenaVacia(apellido,APELLIDO_REQUERIDO);
            persona.apellido = this.apellido;
            Validator.validarCadenaVacia(cargo,CARGO_REQUERIDO);
            persona.cargo = this.cargo;

            return persona;
        }

    }

}
