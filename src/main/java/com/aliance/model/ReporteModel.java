package com.aliance.model;

import java.util.List;

public class ReporteModel {
    private List<GroupMateriaModel<PrematriculaReporteModel>> reporteMaterias;
    private String nombrePrograma;
    private String periodo;
    private int numEstudiantes;


    public ReporteModel(List<GroupMateriaModel<PrematriculaReporteModel>> reporteMaterias, String nombrePrograma,
                        String periodo, int numEstudiantes) {
        this.reporteMaterias = reporteMaterias;
        this.nombrePrograma = nombrePrograma;
        this.periodo = periodo;
        this.numEstudiantes = numEstudiantes;
    }

    public List<GroupMateriaModel<PrematriculaReporteModel>> getReporteMaterias() {
        return reporteMaterias;
    }

    public int getNumEstudiantes() {
        return numEstudiantes;
    }

    public String getPeriodo() {
        return periodo;
    }

    public String getNombrePrograma() {
        return nombrePrograma;
    }
}

