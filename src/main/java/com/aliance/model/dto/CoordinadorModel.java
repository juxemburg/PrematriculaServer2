package com.aliance.model.dto;

import com.aliance.model.Usuario;

public class CoordinadorModel extends Usuario {

    private String idPrograma;

    public CoordinadorModel(String usuario, String nombres, String apellidos,
                            String idPrograma) {
        super(usuario, nombres, apellidos);
        this.idPrograma = idPrograma;
    }

    public String getIdPrograma() {
        return idPrograma;
    }

    public void setIdPrograma(String idPrograma) {
        this.idPrograma = idPrograma;
    }
}
