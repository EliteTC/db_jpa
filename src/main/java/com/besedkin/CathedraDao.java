package com.besedkin;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class CathedraDao{
@PersistenceContext
private EntityManager em;

public Cathedra addCathedra(Cathedra Cathedra) {
em.persist(Cathedra);
return Cathedra;
}

public Cathedra getCathedra(int id) {
return em.find(Cathedra.class,id);
}

public void saveCathedra(Cathedra Cathedra) {
em.merge(Cathedra);
}
}
