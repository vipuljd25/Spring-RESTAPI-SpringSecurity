package com.pat.project.dao;

import java.util.Date;

import com.pat.project.entity.PatriotDataMaster;

public interface IPatriotDataMasterDAO {
	
	public PatriotDataMaster getDataByDate(Date date);
	
	public int getNumberOfUser();
	
	public void updateExchangeRate(Date date, int exchangeRate);


	
}
