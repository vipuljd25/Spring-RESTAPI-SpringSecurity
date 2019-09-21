package com.pat.project.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pat.project.dao.IPatriotDataMasterDAO;
import com.pat.project.entity.PatriotDataMaster;


@Service
public class PatriotDataMasterService implements IPatriotDataMasterService {

	@Autowired
	IPatriotDataMasterDAO patriotDataMasterDAO;

	@Override
	public PatriotDataMaster getDashBoardData() {
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		return patriotDataMasterDAO.getDataByDate(date);

	}

	@Override
	public int getNumberOfUser() {
		int numberOfUser = patriotDataMasterDAO.getNumberOfUser();
		return numberOfUser;
	}

	@Override
	public void editExchangeRate(int rate) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		patriotDataMasterDAO.updateExchangeRate(date, rate);
	}

}
