package com.aliance.model.mapper;


import com.aliance.model.ProgramaModel;
import prematriculaClient.ProgramaEstudiante;

import java.util.ArrayList;
import java.util.List;

public class ProgramaMapper {
    private List<ProgramaModel> programas;

    public ProgramaMapper(List<ProgramaEstudiante> programas) {
        this.programas = new ArrayList<ProgramaModel>();
        for(ProgramaEstudiante prog : programas) {
            if(prog.getTipo()== "PRE" && prog.getEstado() == "ACTIVO" ) {
                this.programas.add(new ProgramaModel("" + prog.getIdprograma(),
                        prog.getNombreprograma(), prog.getCodigoestudiantil()));
            }
        }
    }

    public ProgramaModel[] GetProgramas() {
        return programas.toArray(new ProgramaModel[] {});
    }
}
