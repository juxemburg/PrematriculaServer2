package com.aliance.model.mapper;

import prematriculaClient.MateriaPensum;

import java.util.HashMap;
import java.util.List;

public class PensumMapper {
    private HashMap<String, MateriaPensum> _dicMaterias;

    public PensumMapper(List<MateriaPensum> pensum) {
        inicializarMaterias(pensum);
    }

    private void inicializarMaterias(List<MateriaPensum> pensumList) {
        this._dicMaterias = new HashMap<String, MateriaPensum>();
        for(MateriaPensum mat : pensumList) {
            if(!_dicMaterias.containsKey(mat.getCodigomateria()))
                _dicMaterias.put(mat.getCodigomateria(), mat);
        }
    }

    public HashMap<String, MateriaPensum> get_dicMaterias() {
        return _dicMaterias;
    }
}
