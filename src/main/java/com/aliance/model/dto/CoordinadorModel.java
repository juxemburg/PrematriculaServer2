package com.aliance.model.dto;

import com.aliance.model.Usuario;

public class CoordinadorModel extends Usuario {

    private String idPrograma;
    private String idCoordinador;

    public CoordinadorModel(String usuario, String nombres, String apellidos,
                            String idPrograma, String idCoordinador) {
        super(usuario, nombres, apellidos);
        this.idPrograma = idPrograma;
        this.idCoordinador = idCoordinador;
    }

    public String getIdCoordinador() {
        return idCoordinador;
    }

    public String getIdPrograma() {
        return idPrograma;
    }

    public void setIdPrograma(String idPrograma) {
        this.idPrograma = idPrograma;
    }
}
