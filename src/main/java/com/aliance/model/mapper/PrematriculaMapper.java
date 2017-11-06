package com.aliance.model.mapper;

import com.aliance.model.PrematriculaModel;
import com.aliance.model.dto.MateriaDTO;
import com.aliance.model.dto.PrematriculaDTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

public class PrematriculaMapper {

    public PrematriculaModel Map(PrematriculaDTO model) {
        PrematriculaModel res = new PrematriculaModel(model.getIdEst(),
                model.getIdProg(),
                model.getPeriodo(), getMateriaIds(model.getMaterias()),
                model.getNumElectivas(), model.getNumFish(), model.isEtica(),
                model.isAff(), new Date(), true);
        res.setPeriodo(model.getPeriodo());
        return res;
    }

    public PrematriculaDTO Map(PrematriculaModel model) {
        PrematriculaDTO dto = new PrematriculaDTO(model.getIdEst(),
                model.getIdProg(),model.getPeriodo(),getMaterias(model.getMaterias(),
                model), model.getNumElectivas(),
                model.getNumFish(), model.isEtica(), model.isAff(),
                model.getFecha(), model.isDiligenciada());
        return dto;
    }

    private List<String> getMateriaIds(List<MateriaDTO> materias) {
        List<String> res = new ArrayList<String>();
        for(MateriaDTO materia : materias) {
            res.add(materia.getIdMateria());
        }
        return res;
    }

    public List<MateriaDTO> getMaterias(List<String> ids, PrematriculaModel model) {
        List<MateriaDTO> materias = new ArrayList<>();
        for(String idMateria : ids) {
            materias.add(new MateriaDTO(model.getIdEst(), model.getIdProg(),
                    model.getPeriodo(),idMateria));
        }
        return materias;
    }
}
