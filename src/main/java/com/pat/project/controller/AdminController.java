package com.pat.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pat.project.entity.PatriotTransactionAuditData;
import com.pat.project.entity.PatriotTransactionData;
import com.pat.project.service.IPatriotDataMasterService;
import com.pat.project.service.IPatriotTransactionAuditDataService;
import com.pat.project.service.IPatriotTransactionDataService;
import com.pat.project.service.PatriotURIConstant;

@Controller
@RequestMapping(PatriotURIConstant.PATRIOT)
public class AdminController {

	@Autowired
	private IPatriotDataMasterService patriotDataMasterService;

	@Autowired
	private IPatriotTransactionDataService patriotTransactionDataService;

	@Autowired
	private IPatriotTransactionAuditDataService patriotTransactionAuditDataService;

	// ADMIN DATA DISPLAY
	@GetMapping(PatriotURIConstant.DASHBOARD)
	public String dispalyDashBoard() {
	//	PatriotDataMaster patriotDataMaster = patriotDataMasterService.getDashBoardData();
	//	int numberOfUser = patriotDataMasterService.getNumberOfUser();

		return "home";
	}

	// EDIT EXCHANGE RATE
	@PostMapping(PatriotURIConstant.DASHBOARD_RATE)
	public void editExchangeRate(@PathVariable("rate") int rate) {
		patriotDataMasterService.editExchangeRate(rate);
	}

	// ***************ADMIN TRANSACTION TABLE DISPLAY******************
	@GetMapping(PatriotURIConstant.TRANSACTION)
	public String dispalyTransaction() {
		System.out.println("GetMapping");
		List<PatriotTransactionData> listOfTransactions = patriotTransactionDataService.getTransactionData();
		return "home";
	}

	// **************ADMIN TRANSACTION TABLE STATE CHANG***************E
	@PostMapping(PatriotURIConstant.TRANSACTION_CHANGEDTRASACTION)
	public void transactionTableStateChange(@RequestBody PatriotTransactionAuditData changedTrasaction) {
		patriotTransactionAuditDataService.addTransaction(changedTrasaction);
	}

}
