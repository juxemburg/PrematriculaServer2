package com.aliance.repository;

import com.aliance.model.PrematriculaKey;
import com.aliance.model.dto.MateriaDTO;
import com.aliance.model.dto.PrematriculaDTO;
import com.aliance.util.PrematriculaUtil;

import javax.inject.Inject;
import javax.persistence.*;
import javax.transaction.Transactional;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

@Transactional(SUPPORTS)
public class PrematriculaRepository {

    @Inject
    private PrematriculaUtil _prematriculaUtil;

    @PersistenceContext(unitName="prematriculaPU")
    private EntityManager _em;

    public PrematriculaDTO find(@NotNull String idEst, @NotNull String idProg,
                                @NotNull String periodo)
    {
        try {
            PrematriculaKey pk = new PrematriculaKey(idEst,idProg,periodo);
            PrematriculaDTO result = _em.find(PrematriculaDTO.class, pk);
            return result;
        }
        catch(NoResultException e) {
            return null;
        }
    }

    public List<PrematriculaDTO> findAll(String idProg, String periodo) {
        TypedQuery<PrematriculaDTO> query =
                _em.createQuery("Select m from PrematriculaDTO m " +
                        "where m.idProg = idProg and m.periodo = periodo",
                        PrematriculaDTO.class);
        return query.getResultList();
    }

    public String getIdEstudiante(String idProg) {
        TypedQuery<PrematriculaDTO> query =
                _em.createQuery("Select m from PrematriculaDTO m " +
                                "where m.idProg = :idProg", PrematriculaDTO.class).setMaxResults(1);
        query.setParameter("idProg", idProg);
        return query.getSingleResult().getIdEst();
    }

    public List<Object[]> getPrematricula(String idProg, String periodo) {
        //Todo: revisar implementación de la consulta
        Query query =
                _em.createQuery("Select m.idMateria, Count(m)  from MateriaDTO m " +
                        "WHERE m.idProg = :idProg and m.periodo = :periodo GROUP BY m.idMateria");
        query.setParameter("idProg",idProg);
        query.setParameter("periodo",periodo);
        List<Object[]> result = query.getResultList();
        return result;
    }

    public int getNumRegistros(String idProg, String periodo) {
        TypedQuery<Long> query =
                _em.createQuery("Select count(p) from PrematriculaDTO p " +
                        "where p.idProg = :idProg and p.periodo = :periodo", Long.class);
        query.setParameter("idProg", idProg);
        query.setParameter("periodo", periodo);
        return Integer.parseInt(""+query.getSingleResult());
    }



    public boolean exist(@NotNull String idEst, @NotNull String idProg,
                         @NotNull String periodo) {
        PrematriculaDTO dto = find(idEst, idProg, periodo);

        return dto != null;
    }

    @Transactional(REQUIRED)
    public PrematriculaDTO create(PrematriculaDTO model) {
            _em.persist(model);
        return model;
    }

    //TODO: Refactorizar método, solución temporanea
    @Transactional(REQUIRED)
    public PrematriculaDTO edit(PrematriculaDTO model) {
        Query q = _em.createQuery("Delete from MateriaDTO m " +
                "where m.idProg = :idProg and m.periodo = :periodo and idEst = :idEst");
        q.setParameter("idProg",model.getIdProg());
        q.setParameter("idEst",model.getIdEst());
        q.setParameter("periodo",model.getPeriodo());
        q.executeUpdate();
        Query q2 = _em.createQuery("Update from PrematriculaDTO p " +
                "set p.numElectivas = :numElectivas, p.numFish = :numFish," +
                "p.etica = :etica, p.aff = :aff " +
                "where p.idProg = :idProg and p.periodo = :periodo and p.idEst = :idEst");

        q2.setParameter("numElectivas",model.getNumFish());
        q2.setParameter("numFish",model.getNumFish());
        q2.setParameter("etica",model.isEtica());
        q2.setParameter("aff",model.isAff());
        q2.setParameter("idProg",model.getIdProg());
        q2.setParameter("idEst",model.getIdEst());
        q2.setParameter("periodo",model.getPeriodo());
        q2.executeUpdate();

        List<MateriaDTO> materias = model.getMaterias();
        model.setMaterias(new ArrayList<MateriaDTO>());
        for(MateriaDTO materia : materias) {
            _em.persist(materia);
        }
        return model;
    }



    @Transactional(REQUIRED)
    public void delete(@NotNull String idEst, @NotNull String idProg,
                       @NotNull String periodo) {
        PrematriculaKey key = new PrematriculaKey(idEst,idProg, periodo);
        _em.remove(_em.getReference(PrematriculaDTO.class, key));
    }
}
