package com.pat.project.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pat_txn_data")
public class PatriotTransactionData {

	@Id
	@Column(name ="txn_id")
	private String txnId;
	
	@Column(name ="txn_date")
	private Timestamp txn_date;
	
	@Column(name ="user_seller")
	private String seller_user_id;
	
	@Column(name ="user_buyer")
	private String buyer_user_id;
	
	@Column(name ="stlmt_rate")
	private int settlementRate;
	
	@Column(name ="quantity")
	private int quantity;
	
	@Column(name ="amnt_rcvd")
	private int amountReceived;
	
	@Column(name ="txn_status")
	private String transactionStatus;
	
}
