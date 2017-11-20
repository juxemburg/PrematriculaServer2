package com.aliance.model.mapper;

import com.aliance.model.dto.CoordinadorModel;
import prematriculaClient.Docente;

public class CoordinadorMapper {

    public static CoordinadorModel getCoordinador(Docente docente) {
        try {
            return new CoordinadorModel("",
                    docente.getPrimerNombre() + " " + docente.getSegundoNombre(),
                    docente.getPrimerApellido() + " " + docente.getSegundoApellido(),
                    docente.getOidProgramaCoordinado(), docente.getIdentificacion());
        } catch (Exception e) {
            return null;
        }
    }
}
