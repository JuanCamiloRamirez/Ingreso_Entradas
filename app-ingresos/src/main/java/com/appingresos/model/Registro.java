package com.appingresos.model;

import java.util.Date;

public class Registro {
    private int idRegistro;
    private Date fechaRegistro;
    private String tipoRegistro;

    public Registro() {
        super();
    }

    public static class registroBuilder{
        private int idRegistro;
        private Date fechaRegistro;
        private String tipoRegistro;

        public void setIdRegistro(int idRegistro) {
            this.idRegistro = idRegistro;
        }

        public void setFechaRegistro(Date fechaRegistro) {
            this.fechaRegistro = fechaRegistro;
        }

        public void setTipoRegistro(String tipoRegistro) {
            this.tipoRegistro = tipoRegistro;
        }

        public Registro build(){
            Registro registro = new Registro();
            registro.idRegistro = this.idRegistro;
            registro.fechaRegistro = this.fechaRegistro;
            registro.tipoRegistro = this.tipoRegistro;
            return registro;
        }
    }

}
