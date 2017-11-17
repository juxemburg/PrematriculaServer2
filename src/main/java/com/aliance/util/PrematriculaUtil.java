package com.aliance.util;

import com.aliance.model.mapper.MateriaMapper;
import com.aliance.model.mapper.PensumMapper;
import prematriculaClient.PrematriculasControl;

import java.util.Calendar;
import java.util.Date;

public class PrematriculaUtil {


    public String getPeriodo(Date fecha) {
        String periodo = "";
        Calendar cal = Calendar.getInstance();
        cal.setTime(fecha);
        periodo = cal.get(Calendar.YEAR)+"-"+
                getPeriodoAnio(cal.get(Calendar.MONTH));
        return periodo;
    }
    private int getPeriodoAnio(int mes) {
        return 1+(int)Math.floor(mes/6);
    }

    public static MateriaMapper InstanciarMapper(String idEstudiante, MateriaMapper _mapper,
                                        PrematriculasControl _webService) {

        if(_mapper != null)
            return _mapper;

        _mapper = new MateriaMapper(_webService.cargarHistoriaAcademica(idEstudiante),
                _webService.cargarPensum(idEstudiante),
                _webService.cargarMateriasEquivalentesEstudiante(idEstudiante));
        return _mapper;

    }

    public static PensumMapper InstanciarMapper(PensumMapper _mapper,
                                        PrematriculasControl _webService,
                                        String idEstudiante) {
        if(_mapper != null)
            return _mapper;

        _mapper = new PensumMapper(_webService.cargarPensum(idEstudiante));
        return _mapper;
    }
}
