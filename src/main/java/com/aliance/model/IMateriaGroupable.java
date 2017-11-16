package com.aliance.model;

public abstract class IMateriaGroupable {
    protected  String numSemestre;

    public IMateriaGroupable(String numSemestre) {
        this.numSemestre = numSemestre;
    }

    public String getNumSemestre() {
        return numSemestre;
    }

    public void setNumSemestre(String numSemestre) {
        this.numSemestre = numSemestre;
    }
}
