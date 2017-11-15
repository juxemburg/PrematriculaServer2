package com.aliance.model;

public class EstudianteModel extends  Usuario{

    private String usuario;
    private String nombres;
    private String apellidos;
    private ProgramaModel[] programas;

    public EstudianteModel(String usuario, String nombres, String apellidos, ProgramaModel[] programas) {
        super(usuario, nombres, apellidos);
        this.programas = programas;
        this.tipoUsuario = "ESTUDIANTE";
    }


    public ProgramaModel[] getProgramas() {
        return programas;
    }

    public void setProgramas(ProgramaModel[] programas) {
        this.programas = programas;
    }
}
