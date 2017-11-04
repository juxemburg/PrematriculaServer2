package com.aliance.repository;

import com.aliance.model.PrematriculaKey;
import com.aliance.model.PrematriculaDTO;
import com.aliance.util.NumberGenerator;
import com.aliance.util.PrematriculaUtil;
import com.aliance.util.TextUtil;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

@Transactional(SUPPORTS)
public class PrematriculaRepository {

    @Inject
    private NumberGenerator _generator;

    @Inject
    private TextUtil _textUtil;

    @Inject
    private PrematriculaUtil _prematriculaUtil;

    @PersistenceContext(unitName="prematriculaPU")
    private EntityManager _em;

    public PrematriculaDTO find(@NotNull String idEst, @NotNull String idProg,
                                @NotNull String periodo)
    {
        PrematriculaKey key = new PrematriculaKey(idEst, idProg, periodo);
        return _em.find(PrematriculaDTO.class, key);
    }

    public List<PrematriculaDTO> findAll(String idProg, String periodo) {
        TypedQuery<PrematriculaDTO> query =
                _em.createQuery("Select m from PrematriculaDTO m " +
                        "where m.idProg = idProg and m.periodo = periodo",
                        PrematriculaDTO.class);
        return query.getResultList();
    }

    @Transactional(REQUIRED)
    public PrematriculaDTO create(PrematriculaDTO model) {
        model.setPeriodo(_prematriculaUtil.getPeriodo(new Date()));
        _em.persist(model);
        return model;
    }

    @Transactional(REQUIRED)
    public void delete(@NotNull String idEst, @NotNull String idProg,
                       @NotNull String periodo) {
        PrematriculaKey key = new PrematriculaKey(idEst,idProg, periodo);
        _em.remove(_em.getReference(PrematriculaDTO.class, key));
    }
}
