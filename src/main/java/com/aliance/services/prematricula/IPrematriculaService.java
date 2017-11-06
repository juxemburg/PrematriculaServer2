package com.aliance.services.prematricula;

import com.aliance.model.PrematriculaModel;
import com.aliance.model.dto.PrematriculaDTO;

import java.util.ArrayList;
import java.util.Date;

public interface IPrematriculaService {

    public PrematriculaModel GetPrematricula(String idEst, String idProg,
                                             Date fecha);

    public void AddPrematricula(PrematriculaModel model);



}
