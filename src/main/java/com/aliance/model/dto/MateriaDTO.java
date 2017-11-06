package com.aliance.model.dto;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class MateriaDTO implements Serializable{
    @Id
    @Column(name="id_est")
    private String idEst;

    @Id
    @Column(name="id_prog")
    private String idProg;

    @Id
    @Column(name="id_periodo")
    private String periodo;

    @Id
    @Column(name="id_materia")
    private String idMateria;



    public MateriaDTO() {
    }



    public MateriaDTO(String idEst, String idProg, String periodo, String idMateria) {
        this.idEst = idEst;
        this.idProg = idProg;
        this.periodo = periodo;
        this.idMateria = idMateria;
    }

    public String getIdMateria() {
        return idMateria;
    }
}
