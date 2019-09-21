package com.pat.project.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pat.project.entity.PatriotTransactionAuditData;

@Transactional
@Repository
public class PatriotTransactionAuditDataDAO implements IPatriotTransactionAuditDataDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void addTransaction(PatriotTransactionAuditData transaction) {
		entityManager.persist(transaction);
	}

}
