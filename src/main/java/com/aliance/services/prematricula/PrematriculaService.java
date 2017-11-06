package com.aliance.services.prematricula;

import com.aliance.model.PrematriculaModel;
import com.aliance.model.dto.PrematriculaDTO;
import com.aliance.model.mapper.PrematriculaMapper;
import com.aliance.repository.MateriaRepository;
import com.aliance.repository.PrematriculaRepository;
import com.aliance.services.qualifiers.Remote;
import com.aliance.util.PrematriculaUtil;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

@Remote
public class PrematriculaService implements IPrematriculaService {

    @Inject
    private PrematriculaUtil _prematriculaUtil;

    @Inject
    private PrematriculaMapper _mapper;

    @Inject
    private PrematriculaRepository _prematriculaRepo;

    public PrematriculaService() {}

    @Override
    public PrematriculaModel GetPrematricula(String idEst, String idProg,
                                             Date fecha) {
        PrematriculaDTO model
                = _prematriculaRepo.find(idEst,idProg,
                _prematriculaUtil.getPeriodo(fecha));

        return (model != null) ? _mapper.Map(model) :
                new PrematriculaModel(idEst, idProg,
                        _prematriculaUtil.getPeriodo(new Date()), new ArrayList<>(),
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



}
