package com.aliance.model;

import java.util.ArrayList;
import java.util.List;

public class GroupMateriaModel<T extends  IMateriaGroupable>{
    String numSemestre;
    List<T> materias;

    public GroupMateriaModel(String numSemestre) {
        this.numSemestre = (numSemestre != null) ? numSemestre : "0";
        this.materias = new ArrayList<T>();
    }

    public GroupMateriaModel(String numSemestre, List<T> materias) {
        this.numSemestre = numSemestre;
        this.materias = materias;
    }

    public String getNumSemestre() {
        return numSemestre;
    }

    public void addMateria(T item) {
        if(item.getNumSemestre() !=null && item.getNumSemestre().equals(numSemestre))
            materias.add(item);
    }

    public void setNumSemestre(String numSemestre) {
        this.numSemestre = numSemestre;
    }

    public List<T> getMaterias() {
        return materias;
    }

    public void setMaterias(List<T> materias) {
        this.materias = materias;
    }
}
