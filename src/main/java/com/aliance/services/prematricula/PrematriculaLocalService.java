package com.aliance.services.prematricula;


import com.aliance.model.GroupMateriaModel;
import com.aliance.model.PrematriculaModel;
import com.aliance.model.PrematriculaReporteModel;
import com.aliance.model.ReporteModel;
import com.aliance.model.dto.PrematriculaDTO;
import com.aliance.services.qualifiers.Local;
import com.aliance.util.PrematriculaUtil;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Local
public class PrematriculaLocalService implements IPrematriculaService {

    private HashMap<String, PrematriculaModel> _prematriculas;

    @Inject
    private PrematriculaUtil _prematriculaUtil;

    public PrematriculaLocalService() {
        _prematriculas = new HashMap<>();
    }

    @Override
    public PrematriculaModel GetPrematricula(String idEst, String idProg, Date fecha) {
        String id = getId(idEst, idProg, fecha);
        List<String> materias = new ArrayList<>();
        if(!_prematriculas.containsKey(id)) {
            _prematriculas.put(id, new PrematriculaModel(idEst, idProg,
                    _prematriculaUtil.getPeriodo(fecha), materias,0,
                    0,false,false, fecha, false));
        }
        return _prematriculas.get(id);
    }

    @Override
    public void AddPrematricula(PrematriculaModel model) {
        String id = getId(model);
        if(_prematriculas.containsKey(id))
            _prematriculas.remove(id);
        _prematriculas.put(id, model);
    }

    @Override
    public ReporteModel GetReporte(String idProg, String periodo, String usuarioDocente) {
        return null;
    }

    private String getId(String idEst, String idProg,Date fecha) {
        return idEst+"-"+idProg+"-"+_prematriculaUtil.getPeriodo(fecha);
    }

    private String getId(PrematriculaModel model) {
        return model.getIdEst()+"-"+model.getIdProg()+"-"+
                model.getPeriodo();
    }


}
