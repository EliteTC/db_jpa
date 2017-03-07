package com.besedkin;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class AddressDao{
@PersistenceContext
private EntityManager em;

public Address addAddress(Address address) {
em.persist(address);
return address;
}

public Address getAddress(int id) {
return em.find(Address.class,id);
}

public void saveAddress(Address address) {
em.merge(address);
}
}
