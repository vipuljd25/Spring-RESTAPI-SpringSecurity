package com.pat.project.dao;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pat.project.entity.PatriotDataMaster;



@Transactional
@Repository
public class PatriotDataMasterDAO implements IPatriotDataMasterDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public PatriotDataMaster getDataByDate(Date date) {
		return entityManager.find(PatriotDataMaster.class, date);
	}

	@Override
	public void updateExchangeRate(Date date, int exchangeRate) {

		
	}

	@Override
	public int getNumberOfUser() {
		return 0;
	}

}
