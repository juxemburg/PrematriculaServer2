package com.aliance.services;


import com.aliance.model.GroupMateriaModel;
import com.aliance.model.mapper.MateriaMapper;
import prematriculaClient.PrematriculasControl;

import java.util.List;

public class MateriaService {

    private PrematriculasControl _webService;
    private MateriaMapper _mapper;

    public MateriaService() {

        _webService = WebService.Instanciar().GetService();
    }

    /**
     * Método que retonra las materias correspondientes a un programa
     * @param idEstudiante Código del programa
     * @return las materias, o retorna nulo si no encuentra el código del programa
     */
    public List<GroupMateriaModel> getMaterias(String idEstudiante) {
        instanciarMapper(idEstudiante);
        return _mapper.getMateriasMatricular();
    }


    public List<GroupMateriaModel> getMateriasAprobadas(String idEstudiante) {
        instanciarMapper(idEstudiante);

        return _mapper.getMateriasAprobadasGroup();
    }

    public List<GroupMateriaModel> getPensum(String idEstudiante) {
         instanciarMapper(idEstudiante);

        return _mapper.getMateriasAprobadasGroup();
    }

    private void instanciarMapper(String idEstudiante) {

        if(_mapper != null)
            return;

        _mapper =
                new MateriaMapper(_webService.cargarHistoriaAcademica(idEstudiante),
                        _webService.cargarPensum(idEstudiante),
                        _webService.cargarMateriasEquivalentesEstudiante(idEstudiante));
    }

}
