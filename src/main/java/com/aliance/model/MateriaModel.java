package com.aliance.model;

public class MateriaModel implements Comparable<MateriaModel> {

    private String id;
    private String nombre;
    private String numSemestre;
    private String idPrograma;
    private int semeste;
    private int creditos;

    public MateriaModel(String id, String nombre, String numSemestre, String idPrograma, int creditos) {
        this.id = id;
        this.nombre = nombre;
        this.numSemestre = numSemestre;
        this.idPrograma = idPrograma;
        this.creditos = creditos;
        try {
            semeste = Integer.parseInt(numSemestre);
        }
        catch (Exception e)
        {
            semeste = -1;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumSemestre() {
        return numSemestre;
    }

    public void setNumSemestre(String numSemestre) {
        this.numSemestre = numSemestre;
    }

    public String getIdPrograma() {
        return idPrograma;
    }

    public void setIdPrograma(String idPrograma) {
        this.idPrograma = idPrograma;
    }

    public int getSemeste() {
        return semeste;
    }

    @Override
    public int compareTo(MateriaModel object) {
        return id.compareTo(object.id);
    }

    @Override
    public boolean equals(Object other) {
        try {
            MateriaModel o = (MateriaModel)other;
            return id.equals(o.id) ||
                    nombre.equals(o.nombre);
        }
        catch (Exception e) {
            return false;
        }
    }
}
