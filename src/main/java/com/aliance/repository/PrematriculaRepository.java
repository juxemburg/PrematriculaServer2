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

    public boolean exist(@NotNull String idEst, @NotNull String idProg,
                         @NotNull String periodo) {
        TypedQuery<PrematriculaDTO> query =
                _em.createQuery("Select m from PrematriculaDTO m " +
                                "where m.idProg = idProg and m.periodo = periodo " +
                                "and idEst = idEst",
                        PrematriculaDTO.class);
        return query.getResultList().size() > 0;
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
