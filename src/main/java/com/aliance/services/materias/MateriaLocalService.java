package com.aliance.services.materias;

import com.aliance.model.GroupMateriaModel;
import com.aliance.model.MateriaModel;
import com.aliance.services.qualifiers.Local;
import edu.emory.mathcs.backport.java.util.Arrays;

import javax.enterprise.context.Dependent;
import java.util.ArrayList;
import java.util.List;

@Local
public class MateriaLocalService implements IMateriaService{

    private List<GroupMateriaModel<MateriaModel>> res;
    public MateriaLocalService() {
        res = new ArrayList<GroupMateriaModel<MateriaModel>>();
        res.add(new GroupMateriaModel("5",new ArrayList<MateriaModel>()));
        res.add(new GroupMateriaModel("6",new ArrayList<MateriaModel>()));
        res.add(new GroupMateriaModel("7",new ArrayList<MateriaModel>()));
        res.add(new GroupMateriaModel("8",new ArrayList<MateriaModel>()));
        res.add(new GroupMateriaModel("9",new ArrayList<MateriaModel>()));
        res.add(new GroupMateriaModel("10",new ArrayList<MateriaModel>()));
        res.get(0).addMateria(
                new MateriaModel("2131123342","Materia1",
                        "5","13213",4));
        res.get(0).addMateria(
                new MateriaModel("21311230","Materia1123123",
                        "5","13213",3));
        res.get(0).addMateria(
                new MateriaModel("213112398","Materia112313",
                        "5","13213",1));
        res.get(0).addMateria(
                new MateriaModel("21311234","Materia1123123",
                        "5","13213",5));
        res.get(0).addMateria(
                new MateriaModel("21311235","Materia121313123",
                        "5","13213",8));
        res.get(0).addMateria(
                new MateriaModel("21311236","Materia1123131233123",
                        "5","13213",2));
        res.get(0).addMateria(
                new MateriaModel("4354352","Materia3",
                        "5","13213",10));
        res.get(1).addMateria(
                new MateriaModel("1238103123","Materia4",
                        "6","13213",12));
        res.get(1).addMateria(
                new MateriaModel("342343234324","Materia5",
                        "6","13213",1));
        res.get(2).addMateria(
                new MateriaModel("2131123123123","Materia6",
                        "7","13213",5));
        res.get(2).addMateria(
                new MateriaModel("213112312312312321","Materia7",
                        "7","13213",6));
        res.get(2).addMateria(
                new MateriaModel("21311233453453","Materia8",
                        "7","13213",4));
        res.get(3).addMateria(
                new MateriaModel("123123","Proyecto II",
                        "8","13213",3));
        res.get(3).addMateria(
                new MateriaModel("1231234","Electiva V",
                        "8","13213",1));
        res.get(4).addMateria(
                new MateriaModel("123123123","Legislación Laboral",
                        "9","13213",3));
        res.get(5).addMateria(
                new MateriaModel("1312312313412","Trabajo de Grado",
                        "10","13213",4));
    }

    @Override
    public List<GroupMateriaModel<MateriaModel>> getMaterias(String idEstudiante) {
        return res;
    }

    @Override
    public List<GroupMateriaModel<MateriaModel>> getMateriasAprobadas(String idEstudiante) {
        return res;
    }

    @Override
    public List<GroupMateriaModel<MateriaModel>> getPensum(String idEstudiante) {
        return res;
    }
}
