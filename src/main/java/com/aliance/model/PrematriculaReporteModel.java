package com.aliance.model;

public class PrematriculaReporteModel extends  IMateriaGroupable {
    private String idMateria;
    private String nombreMateria;
    private int cantidadRegistrada;

    public PrematriculaReporteModel(String numSemestre, String idMateria, String nombreMateria, int cantidadRegistrada) {
        super(numSemestre);
        this.idMateria = idMateria;
        this.nombreMateria = nombreMateria;
        this.cantidadRegistrada = cantidadRegistrada;
    }

    public String getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(String idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public int getCantidadRegistrada() {
        return cantidadRegistrada;
    }

    public void setCantidadRegistrada(int cantidadRegistrada) {
        this.cantidadRegistrada = cantidadRegistrada;
    }
}
