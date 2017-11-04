package com.aliance.model;

public class EstudianteModel {

    private String usuario;
    private String nombres;
    private String apellidos;
    private ProgramaModel[] programas;

    public EstudianteModel(String usuario, String nombres, String apellidos, ProgramaModel[] programas) {
        this.usuario = usuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.programas = programas;
    }


    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public ProgramaModel[] getProgramas() {
        return programas;
    }

    public void setProgramas(ProgramaModel[] programas) {
        this.programas = programas;
    }
}
