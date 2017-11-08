package com.aliance.model;

import java.util.ArrayList;
import java.util.List;

public class GroupMateriaModel {
    String numSemestre;
    List<MateriaModel> materias;

    public GroupMateriaModel(String numSemestre) {
        this.numSemestre = (numSemestre != null) ? numSemestre : "0";
        this.materias = new ArrayList<MateriaModel>();
    }

    public GroupMateriaModel(String numSemestre, List<MateriaModel> materias) {
        this.numSemestre = numSemestre;
        this.materias = materias;
    }

    public String getNumSemestre() {
        return numSemestre;
    }

    public void addMateria(MateriaModel item) {
        if(item.getNumSemestre() !=null && item.getNumSemestre().equals(numSemestre))
            materias.add(item);
    }

    public void setNumSemestre(String numSemestre) {
        this.numSemestre = numSemestre;
    }

    public List<MateriaModel> getMaterias() {
        return materias;
    }

    public void setMaterias(List<MateriaModel> materias) {
        this.materias = materias;
    }
}
