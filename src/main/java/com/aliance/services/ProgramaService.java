package com.aliance.services;


import com.aliance.model.ProgramaModel;
import prematriculaClient.PrematriculasControl;

import java.util.Map;

public class ProgramaService {

    private Map<String, ProgramaModel[]> programas;
    private PrematriculasControl _webService;

    public ProgramaService()  {
        //_webService = WebService.Instanciar().GetService();
    }


    /**
     * Método que obtiene los programas en los que se encuentra
     * matriculado un estudiante
     * @param idEstudiante Id del estudiante
     * @return un array con los programas del esutidante,
     * o nulo si no los puede encontrar
     */
    public ProgramaModel[] getProgramas(String idEstudiante) {

        return new ProgramaModel[] {
                new ProgramaModel(idEstudiante, "Programa1", "P1")
        };
    }

    /**
     *Método que recupera el programa en específico de un estudiante
     * @param idEstudiante Id del estudiante
     * @param idPrograma Id del programa de un estudiante
     * @return el programa del estudiante, o nulo si no los puede encontrar.
     */
    public ProgramaModel findPrograma(String idEstudiante, String idPrograma) {
        return new ProgramaModel(idEstudiante, "Programa1", "P1");
    }
}