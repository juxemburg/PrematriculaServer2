package com.aliance.model.mapper;

import com.aliance.model.GroupMateriaModel;
import com.aliance.model.PrematriculaReporteModel;
import com.aliance.util.MapUtil;
import prematriculaClient.MateriaPensum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PrematriculaReporteMapper {

    public static List<GroupMateriaModel<PrematriculaReporteModel>> mapReporteEmpty(){
        return new ArrayList<GroupMateriaModel<PrematriculaReporteModel>>();
    }

    public static List<GroupMateriaModel<PrematriculaReporteModel>> mapReporte(
            List<Object[]> reporteI, HashMap<String, MateriaPensum> pensum) {

        List<GroupMateriaModel<PrematriculaReporteModel>> reporte
            = new ArrayList<GroupMateriaModel<PrematriculaReporteModel>>();

        for(Object[] reg: reporteI) {
            MateriaPensum matPensum = pensum.get(reg[0].toString());
            int cantidad = Integer.parseInt(reg[1].toString());
            PrematriculaReporteModel matModel
                    = new PrematriculaReporteModel(""+matPensum.getSemestre(),
                    matPensum.getCodigomateria(), matPensum.getMateria(),cantidad);
            MapUtil.insertToMap(reporte, matModel);
        }

        return reporte;
    }
}
