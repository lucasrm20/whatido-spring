package com.whatido.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class TarefasDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
}
