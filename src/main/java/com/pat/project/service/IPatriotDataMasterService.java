package com.pat.project.service;

import com.pat.project.entity.PatriotDataMaster;

public interface IPatriotDataMasterService {

	PatriotDataMaster getDashBoardData();

	int getNumberOfUser();

	void editExchangeRate(int rate);

}
