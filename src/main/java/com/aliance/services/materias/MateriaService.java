package com.aliance.services.materias;


import com.aliance.model.GroupMateriaModel;
import com.aliance.model.MateriaModel;
import com.aliance.model.mapper.MateriaMapper;
import com.aliance.services.WebService;
import com.aliance.services.qualifiers.Remote;
import com.aliance.util.PrematriculaUtil;
import prematriculaClient.PrematriculasControl;

import java.util.List;

@Remote
public class MateriaService implements IMateriaService {

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
    public List<GroupMateriaModel<MateriaModel>> getMaterias(String idEstudiante) {
        _mapper = PrematriculaUtil.InstanciarMapper(idEstudiante, _mapper, _webService);
        return _mapper.getMateriasMatricular();
    }

    public List<GroupMateriaModel<MateriaModel>> getMateriasAprobadas(String idEstudiante) {
        _mapper = PrematriculaUtil.InstanciarMapper(idEstudiante, _mapper, _webService);
        return _mapper.getMateriasAprobadasGroup();
    }

    public List<GroupMateriaModel<MateriaModel>> getPensum(String idEstudiante) {
        _mapper = PrematriculaUtil.InstanciarMapper(idEstudiante, _mapper, _webService);
        return _mapper.getMateriasAprobadasGroup();
    }

    

}
