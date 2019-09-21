package com.pat.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pat.project.dao.IPatriotTransactionAuditDataDAO;
import com.pat.project.entity.PatriotTransactionAuditData;

@Service
public class PatriotTransactionAuditDataService implements IPatriotTransactionAuditDataService {

	@Autowired
	IPatriotTransactionAuditDataDAO patriotTransactionAuditDataDAO;
	
	@Override
	public void addTransaction(PatriotTransactionAuditData transaction) {
		
		patriotTransactionAuditDataDAO.addTransaction(transaction);
		
	}

}
