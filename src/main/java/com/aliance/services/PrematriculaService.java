package com.aliance.services;



import com.aliance.model.MateriaDTO;
import com.aliance.model.PrematriculaDTO;
import com.aliance.util.MateriaDTOMapper;
import com.aliance.util.PrematriculaUtil;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class PrematriculaService {

    @Inject
    private PrematriculaUtil _prematriculaUtil;
    @Inject
    private MateriaDTOMapper _materiaMapper;

    private static PrematriculaService instancia;

    public static PrematriculaService Instanciar() {
        if(instancia == null)
            instancia = new PrematriculaService();
        return instancia;
    }

    private HashMap<String, PrematriculaDTO> _prematriculas;

    public PrematriculaService() {
        _prematriculas = new HashMap<String, PrematriculaDTO>();
    }

    public PrematriculaDTO GetPrematricula(String idEst, String idProg,
                                           Date fecha) {
        String id = getId(idEst, fecha);
        if(!_prematriculas.containsKey(id)) {
            _prematriculas.put(id, new PrematriculaDTO(idEst, idProg,
                    new ArrayList<MateriaDTO>(), 0,0,false,
                    false,fecha, false));
        }
        return _prematriculas.get(id);
    }

    public void AddPrematricula(PrematriculaDTO model) {
        String id = getId(model);
        if(_prematriculas.containsKey(id))
            _prematriculas.remove(id);
        _prematriculas.put(id, model);

    }

    private String getId(String idEst, Date fecha) {
        return idEst+"-"+_prematriculaUtil.getPeriodo(fecha);
    }

    private String getId(PrematriculaDTO model) {
        return model.getIdEst()+"-"
                +_prematriculaUtil.getPeriodo(model.getFecha());
    }

}
