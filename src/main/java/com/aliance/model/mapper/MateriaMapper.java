package com.aliance.model.mapper;


import com.aliance.model.GroupMateriaModel;
import com.aliance.model.MateriaModel;
import com.aliance.util.MapUtil;
import prematriculaClient.MateriaEquivalente;
import prematriculaClient.MateriaPensum;
import prematriculaClient.Nota;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static com.aliance.util.MapUtil.insertToMap;

public class MateriaMapper {

    private List<Nota> _notas;
    private List<MateriaPensum> _pensum;
    private HashMap<String, String> _dicEquivalentes;

    private List<MateriaModel> aprobadas;

    public MateriaMapper(List<Nota> notas, List<MateriaPensum> pensum,
                         List<MateriaEquivalente> equivalentes) {
        _notas = (notas != null) ? notas : new ArrayList<Nota>();
        _pensum = pensum;
        inicializarEquivalentes(equivalentes);
        aprobadas = getMateriasAprobadas();

    }

    private void inicializarEquivalentes(List<MateriaEquivalente> equivalentes) {
        _dicEquivalentes = new HashMap<String, String>();
        for(MateriaEquivalente equivalente : equivalentes) {
            _dicEquivalentes.put(""+equivalente.getIdequivalente(),
                    ""+equivalente.getIdmateriaprograma());
        }
    }



    /**
     * Método que retorna las materias aprobadas por un estudiante
     * @return
     */
    public List<MateriaModel> getMateriasAprobadas() {
        List<MateriaModel> resultado = new ArrayList<MateriaModel>();
        for(Nota nota : _notas) {
            if(MateriaAprobada(nota)) {
                String codEquivalente = _dicEquivalentes.get(nota.getOidMateria());
                if(codEquivalente == null)
                    resultado.add(Map(nota));
                else
                    resultado.add(Map(nota, codEquivalente));
            }
        }
        return resultado;
    }

    public List<GroupMateriaModel> getMateriasAprobadasGroup() {
        List<GroupMateriaModel> resultado = new ArrayList<GroupMateriaModel>();
        for(Nota nota : _notas) {
            if(MateriaAprobada(nota)) {
                String codEquivalente = _dicEquivalentes.get(nota.getOidMateria());
                if(codEquivalente == null)
                    insertToMap(resultado, Map(nota));
                else
                    insertToMap(resultado, Map(nota, codEquivalente));
            }
        }
        return resultado;
    }

    public List<GroupMateriaModel> getPensum() {
        List<GroupMateriaModel> resultado = new ArrayList<GroupMateriaModel>();
        for(MateriaPensum mat : _pensum) {
            MapUtil.insertToMap(resultado, Map(mat));
        }
        return resultado;
    }

    /**
     * Método que retorna las materias a matricular
     * por un estudiante
     * @return
     */
    public List<GroupMateriaModel> getMateriasMatricular() {
        List<GroupMateriaModel> resultado =
                new ArrayList<GroupMateriaModel>();

        for(MateriaPensum materia : _pensum) {
            MateriaModel mat = Map(materia);
            if(mat.getSemeste() > 0 && !aprobadas.contains(mat)) {
                MapUtil.insertToMap(resultado, mat);
            }
        }
        return resultado;
    }







    private MateriaModel Map(Nota nota) {
        return new MateriaModel(nota.getOidMateria(),nota.getMateria(),
                nota.getSemestre(), nota.getOidEstudiante(), Integer.parseInt(nota.getCreditos()));
    }
    private MateriaModel Map(Nota nota, String codEquivalente) {
        return new MateriaModel(codEquivalente,nota.getMateria(),
                nota.getSemestre(), nota.getOidEstudiante(), Integer.parseInt(nota.getCreditos()));
    }
    private MateriaModel Map(MateriaPensum materia)
    {
        int semestre = materia.getMateria().toUpperCase().contains("ELECTIVA")
                ? -1 :
                materia.getSemestre();
        return new MateriaModel(""+materia.getOidmateria(), materia.getMateria(),
                ""+ semestre, "", materia.getCreditos());
    }

    private boolean MateriaAprobada(Nota nota) {
        try {
            float n = Float.parseFloat(nota.getDefinitiva());
            return n >= 3.0;
        }
        catch (Exception e) {
            return nota.getDefinitiva().equals("A");
        }
    }

}
