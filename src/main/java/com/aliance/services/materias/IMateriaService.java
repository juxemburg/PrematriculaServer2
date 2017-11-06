package com.aliance.services.materias;

import com.aliance.model.GroupMateriaModel;

import java.util.List;

public interface IMateriaService {

    List<GroupMateriaModel> getMaterias(String idEstudiante);

    List<GroupMateriaModel> getMateriasAprobadas(String idEstudiante);

    List<GroupMateriaModel> getPensum(String idEstudiante);
}
