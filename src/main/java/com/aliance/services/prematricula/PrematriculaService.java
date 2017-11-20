package com.aliance.services.prematricula;

import com.aliance.model.*;
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
import prematriculaClient.Docente;
import prematriculaClient.PrematriculasControl;

import javax.inject.Inject;
import javax.persistence.NoResultException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import static com.aliance.model.mapper.PrematriculaReporteMapper.mapReporte;

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
//        _webService = WebService.Instanciar().GetService();
    }

    @Override
    public PrematriculaModel GetPrematricula(String idEst, String idProg,
                                             Date fecha) {
        PrematriculaDTO model
                = _prematriculaRepo.find(idEst, idProg,
                _prematriculaUtil.getPeriodo(fecha));

        return (model != null) ? _mapper.Map(model) :
                new PrematriculaModel(idEst, idProg,
                        _prematriculaUtil.getPeriodo(new Date()), new ArrayList<String>(),
                        0, 0, false, false, new Date(),
                        false);
    }

    @Override
    public void AddPrematricula(PrematriculaModel model) {
        model.setPeriodo(_prematriculaUtil.getPeriodo(new Date()));
        PrematriculaDTO dto = _mapper.Map(model);
        dto.setMaterias(_mapper.getMaterias(model.getMaterias(), model));

        if (_prematriculaRepo.exist(model.getIdEst(), model.getIdProg(),
                model.getPeriodo()))
            _prematriculaRepo.edit(dto);
        else
            _prematriculaRepo.create(dto);


    }

    @Override
    public ReporteModel GetReporte(String idProg, String periodo, String usuarioDocente) {

        try {
            String idEstudiante = _prematriculaRepo.getIdEstudiante(idProg);
            _pensumMapper = PrematriculaUtil.InstanciarMapper(_pensumMapper, _webService, idEstudiante);
            Docente docente = _webService.cargarDatosDocente(usuarioDocente);
            int numRegistros = _prematriculaRepo.getNumRegistros(idProg, periodo);
            List<GroupMateriaModel<PrematriculaReporteModel>> listMaterias =  PrematriculaReporteMapper.mapReporte(
                    _prematriculaRepo.getPrematricula(idProg, periodo), _pensumMapper.get_dicMaterias());

            return new ReporteModel(listMaterias, docente.getProgramaCoordinado(), periodo, numRegistros);
        } catch (NoResultException e2) {
            return new ReporteModel(PrematriculaReporteMapper.mapReporteEmpty(),"",
                    periodo,0);
        } catch (Exception e) {
            return null;
        }
    }




}
