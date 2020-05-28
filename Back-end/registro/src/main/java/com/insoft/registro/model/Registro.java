package com.insoft.registro.model;


import com.insoft.registro.model.businessexception.BusinessException;
import com.insoft.registro.model.util.DateUtil;
import com.insoft.registro.model.util.Validator;

import java.util.Date;

public class Registro {
    private int idRegistro;
    private String documento;
    private Date fechaEntrada;
    private Date fechaSalida;

    public static final String FECHA_ENTRADA_REQUERIDA = "La fecha de entrada es requerida";
    public static final String FECHA_SALIDA_REQUERIDA = "La fecha de salida es requerida";
    public static final String FECHA_ENTRADA_SALIDA_INVALIDA = "La fecha de entrada es mayor a la de salida o la fecha de salida es menor a la de entrada";
    public static final String DOCUMENTO_REQUERIDO = "El documento es requerido" ;
    public Registro() {
        super();
    }

    public static class RegistroBuilder{

        private int idRegistro;
        private String documento;
        private Date fechaEntrada;
        private Date fechaSalida;

        public RegistroBuilder setIdRegistro(int idRegistro) {
            this.idRegistro = idRegistro;
            return this;
        }

        public RegistroBuilder setDocumento(String documento) {
            this.documento = documento;
            return this;
        }

        public RegistroBuilder setFechaEntrada(Date fechaEntrada) {
            this.fechaEntrada = fechaEntrada;
            return this;
        }

        public RegistroBuilder setFechaSalida(Date fechaSalida) {
            this.fechaSalida = fechaSalida;
            return this;
        }

        public Registro build() throws BusinessException {
            Registro registro = new Registro();
            registro.idRegistro = this.idRegistro;
            Validator.validarDocumentoNulo(documento,DOCUMENTO_REQUERIDO);
            Validator.validarDocumentoVacio(documento,DOCUMENTO_REQUERIDO);
            registro.documento = this.documento;
            Validator.validarFechaNula(fechaEntrada,FECHA_ENTRADA_REQUERIDA);
            Validator.validarFechaVacia(fechaEntrada,FECHA_ENTRADA_REQUERIDA);
            registro.fechaEntrada = this.fechaEntrada;
            Validator.validarFechaNula(fechaSalida,FECHA_SALIDA_REQUERIDA);
            Validator.validarFechaVacia(fechaSalida,FECHA_SALIDA_REQUERIDA);
            registro.fechaSalida = this.fechaSalida;
            return registro;
        }
    }

    public int getIdRegistro() {
        return idRegistro;
    }

    public String getDocumento() {
        return documento;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public double calcularHorasLaboradas(){
        return DateUtil.minutesDiff(fechaEntrada, fechaSalida);
    }

}
