package com.aliance.services.materias;

import com.aliance.model.GroupMateriaModel;
import com.aliance.model.MateriaModel;

import java.util.List;

public interface IMateriaService {

    List<GroupMateriaModel<MateriaModel>> getMaterias(String idEstudiante);

    List<GroupMateriaModel<MateriaModel>> getMateriasAprobadas(String idEstudiante);

    List<GroupMateriaModel<MateriaModel>> getPensum(String idEstudiante);
}
