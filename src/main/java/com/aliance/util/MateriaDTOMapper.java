package com.aliance.util;

import com.aliance.model.MateriaDTO;
import com.aliance.model.PrematriculaDTO;

public class MateriaDTOMapper {


    public MateriaDTO create(String idEst, String idProg,
                             String periodo, String idMateria, PrematriculaDTO matricula) {
        return new MateriaDTO(idEst,idProg,periodo,idMateria,matricula);
    }
}
