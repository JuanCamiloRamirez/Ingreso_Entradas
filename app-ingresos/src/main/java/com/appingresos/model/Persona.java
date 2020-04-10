package com.appingresos.model;

public class Persona {
    private int idPersona;
    private String tipoDocumento;
    private int numeroDocumento;
    private String nombre;
    private String apellido;
    private String cargo;

    public Persona() {
        super();
    }

    public static class personaBuilder{
        private int idPersona;
        private String tipoDocumento;
        private int numeroDocumento;
        private String nombre;
        private String apellido;
        private String cargo;

        public void setIdPersona(int idPersona) {
            this.idPersona = idPersona;
        }

        public void setTipoDocumento(String tipoDocumento) {
            this.tipoDocumento = tipoDocumento;
        }

        public void setNumeroDocumento(int numeroDocumento) {
            this.numeroDocumento = numeroDocumento;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public void setCargo(String cargo) {
            this.cargo = cargo;
        }

        public Persona build(){
            Persona persona = new Persona();
            persona.idPersona = this.idPersona;
            persona.tipoDocumento = this.tipoDocumento;
            persona.numeroDocumento = this.numeroDocumento;
            persona.nombre = this.nombre;
            persona.apellido = this.apellido;
            persona.cargo = this.cargo;

            return persona;
        }

    }

}
