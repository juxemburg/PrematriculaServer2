package com.aliance.model.dto;


import com.aliance.model.PrematriculaKey;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static javax.persistence.CascadeType.MERGE;
import static javax.persistence.CascadeType.PERSIST;
import static javax.persistence.CascadeType.REMOVE;
import static javax.persistence.FetchType.EAGER;

@Entity
@IdClass(PrematriculaKey.class)
public class PrematriculaDTO implements Serializable{

    @Id
    @Column(name="id_est")
    private String idEst;

    @Id
    @Column(name="id_prog")
    private String idProg;

    @Id
    @Column(name="id_periodo")
    private String periodo;


    @OneToMany(cascade = {PERSIST, MERGE}, fetch= EAGER, orphanRemoval = true)
    @JoinColumns({
            @JoinColumn(name="id_est", referencedColumnName = "id_est"),
            @JoinColumn(name="id_prog", referencedColumnName = "id_prog"),
            @JoinColumn(name="id_periodo", referencedColumnName = "id_periodo")
    })
    private List<MateriaDTO> materias;


    private int numElectivas;
    private int numFish;
    private boolean etica;
    private boolean aff; /*Actividad Física Formativa*/
    private Date fecha;
    private boolean diligenciada;

    public PrematriculaDTO() {
    }

    public PrematriculaDTO(String idEst, String idProg,String periodo,
                           List<MateriaDTO> materias ,int numElectivas,
                           int numFish, boolean etica, boolean aff, Date fecha,
                           boolean diligenciada) {
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

    public List<MateriaDTO> getMaterias() {
        return materias;
    }

    public void setMaterias(List<MateriaDTO> materias) {
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

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public boolean isDiligenciada() {
        return diligenciada;
    }

    public void setDiligenciada(boolean diligenciada) {
        this.diligenciada = diligenciada;
    }
}

