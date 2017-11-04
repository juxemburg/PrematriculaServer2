package com.aliance.model;

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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumns({
            @JoinColumn(name="id_est", referencedColumnName = "id_est"),
            @JoinColumn(name="id_prog", referencedColumnName = "id_prog"),
            @JoinColumn(name="id_periodo", referencedColumnName = "id_periodo")
    })
    private PrematriculaDTO matricula;

    public MateriaDTO() {
    }

    public MateriaDTO(String idEst, String idProg, String periodo, String idMateria, PrematriculaDTO matricula) {
        this.idEst = idEst;
        this.idProg = idProg;
        this.periodo = periodo;
        this.idMateria = idMateria;
        this.matricula = matricula;
    }
}
