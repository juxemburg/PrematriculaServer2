package com.aliance.repository;

import com.aliance.model.dto.MateriaDTO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import static javax.transaction.Transactional.TxType.REQUIRED;

public class MateriaRepository {

    @PersistenceContext(unitName = "prematriculaPU")
    private EntityManager _em;

    @Transactional(REQUIRED)
    public MateriaDTO create(MateriaDTO model) {
        _em.persist(model);
        return model;
    }
}
