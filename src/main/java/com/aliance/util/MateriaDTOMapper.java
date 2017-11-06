package com.aliance.util;

import com.aliance.model.dto.MateriaDTO;
import com.aliance.model.dto.PrematriculaDTO;

public class MateriaDTOMapper {


    public MateriaDTO create(String idEst, String idProg,
                             String periodo, String idMateria) {
        return new MateriaDTO(idEst,idProg,periodo,idMateria);
    }
}
