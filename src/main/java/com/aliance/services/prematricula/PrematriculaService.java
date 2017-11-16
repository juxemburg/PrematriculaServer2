package com.aliance.services.prematricula;

import com.aliance.model.GroupMateriaModel;
import com.aliance.model.PrematriculaModel;
import com.aliance.model.PrematriculaReporteModel;
import com.aliance.model.dto.PrematriculaDTO;
import com.aliance.model.mapper.MateriaMapper;
import com.aliance.model.mapper.PensumMapper;
import com.aliance.model.mapper.PrematriculaMapper;
import com.aliance.model.mapper.PrematriculaReporteMapper;
import com.aliance.repository.MateriaRepository;
import com.aliance.repository.PrematriculaRepository;
import com.aliance.services.WebService;
import com.aliance.services.qualifiers.Remote;
import com.aliance.util.PrematriculaUtil;
import prematriculaClient.PrematriculasControl;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Remote
public class PrematriculaService implements IPrematriculaService {

    @Inject
    private PrematriculaUtil _prematriculaUtil;

    @Inject
    private PrematriculaMapper _mapper;

    private PensumMapper _pensumMapper;
    private PrematriculaReporteMapper _reporteMapper;

    @Inject
    private PrematriculaRepository _prematriculaRepo;



    private PrematriculasControl _webService;

    public PrematriculaService() {
        _webService = WebService.Instanciar().GetService();
    }

    @Override
    public PrematriculaModel GetPrematricula(String idEst, String idProg,
                                             Date fecha) {
        PrematriculaDTO model
                = _prematriculaRepo.find(idEst,idProg,
                _prematriculaUtil.getPeriodo(fecha));

        return (model != null) ? _mapper.Map(model) :
                new PrematriculaModel(idEst, idProg,
                        _prematriculaUtil.getPeriodo(new Date()), new ArrayList<String>(),
                        0,0,false, false, new Date(),
                        false);
    }

    @Override
    public void AddPrematricula(PrematriculaModel model) {
        model.setPeriodo(_prematriculaUtil.getPeriodo(new Date()));
        PrematriculaDTO dto = _mapper.Map(model);
        dto.setMaterias(_mapper.getMaterias(model.getMaterias(), model));

        if (_prematriculaRepo.exist(model.getIdEst(),model.getIdProg(),
                model.getPeriodo()))
            _prematriculaRepo.edit(dto);
        else
            _prematriculaRepo.create(dto);


    }

    @Override
    public List<GroupMateriaModel<PrematriculaReporteModel>> GetReporte(String idProg, String periodo) {
        try {
            String idEstudiante = _prematriculaRepo.getIdEstudiante(idProg);

            PrematriculaUtil.InstanciarMapper( _pensumMapper, _webService, idEstudiante);
            return PrematriculaReporteMapper.mapReporte(
                    _prematriculaRepo.getPrematricula(idProg, periodo),_pensumMapper.get_dicMaterias());
        } catch (Exception e) {
            return null;
        }
    }




}
