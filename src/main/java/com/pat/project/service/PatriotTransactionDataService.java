package com.pat.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pat.project.dao.IPatriotTransactionDataDAO;
import com.pat.project.entity.PatriotTransactionData;

@Service
public class PatriotTransactionDataService implements IPatriotTransactionDataService {

	
	@Autowired
	IPatriotTransactionDataDAO patriotTransactionDataDAO;
	
	
	@Override
	public List<PatriotTransactionData> getTransactionData() {
		
		return patriotTransactionDataDAO.getTransactionData();
		
	}

}
