package com.aliance.model.mapper;


import com.aliance.model.EstudianteModel;
import com.aliance.model.ProgramaModel;
import prematriculaClient.Estudiante;

public class EstudianteMapper {

    private Estudiante _estudiante;

    public EstudianteMapper(Estudiante estudiante) {
        _estudiante = estudiante;
    }

    public EstudianteModel GetModel(String nombreUsuario, ProgramaModel[] programas) {
        return new EstudianteModel(nombreUsuario,
                _estudiante.getPrimerNombre() + " " +_estudiante.getSegundoNombre(),
                _estudiante.getPrimerApellido() + " " + _estudiante.getSegundoApellido(),
                programas);
    }
}
