package com.aliance.services.prematricula;

import com.aliance.model.GroupMateriaModel;
import com.aliance.model.PrematriculaModel;
import com.aliance.model.PrematriculaReporteModel;
import com.aliance.model.dto.PrematriculaDTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public interface IPrematriculaService {

    PrematriculaModel GetPrematricula(String idEst, String idProg,
                                             Date fecha);

    void AddPrematricula(PrematriculaModel model);

    List<GroupMateriaModel<PrematriculaReporteModel>> GetReporte(String idProg, String periodo);



}
