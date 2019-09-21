package com.pat.project.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pat.project.entity.PatriotTransactionData;


@Transactional
@Repository
public class PatriotTransactionDataDAO implements IPatriotTransactionDataDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<PatriotTransactionData> getTransactionData() {
		
		String query = "FROM Pat_txn_data";
		System.out.println("inside DAO");
		return entityManager.createQuery(query).getResultList();
	}

}
