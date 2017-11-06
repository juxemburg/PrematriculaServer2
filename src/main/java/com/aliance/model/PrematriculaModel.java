package com.aliance.model;

import java.util.Date;
import java.util.List;

public class PrematriculaModel {
    private String idEst;
    private String idProg;
    private String periodo;
    private List<String> materias;
    private int numElectivas;
    private int numFish;
    private boolean etica;
    private boolean aff; /*Actividad Física Formativa*/
    private Date fecha;
    private boolean diligenciada;

    public PrematriculaModel() {
    }

    public PrematriculaModel(String idEst, String idProg, String periodo, List<String> materias, int numElectivas, int numFish, boolean etica, boolean aff, Date fecha, boolean diligenciada) {
        this.idEst = idEst;
        this.idProg = idProg;
        this.periodo = periodo;
        this.materias = materias;
        this.numElectivas = numElectivas;
        this.numFish = numFish;
        this.etica = etica;
        this.aff = aff;
        this.fecha = fecha;
        this.diligenciada = diligenciada;
    }


    public String getIdEst() {
        return idEst;
    }

    public void setIdEst(String idEst) {
        this.idEst = idEst;
    }

    public String getIdProg() {
        return idProg;
    }

    public void setIdProg(String idProg) {
        this.idProg = idProg;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public List<String> getMaterias() {
        return materias;
    }

    public void setMaterias(List<String> materias) {
        this.materias = materias;
    }

    public int getNumElectivas() {
        return numElectivas;
    }

    public void setNumElectivas(int numElectivas) {
        this.numElectivas = numElectivas;
    }

    public int getNumFish() {
        return numFish;
    }

    public void setNumFish(int numFish) {
        this.numFish = numFish;
    }

    public boolean isEtica() {
        return etica;
    }

    public void setEtica(boolean etica) {
        this.etica = etica;
    }

    public boolean isAff() {
        return aff;
    }

    public void setAff(boolean aff) {
        this.aff = aff;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isDiligenciada() {
        return diligenciada;
    }

    public void setDiligenciada(boolean diligenciada) {
        this.diligenciada = diligenciada;
    }
}
