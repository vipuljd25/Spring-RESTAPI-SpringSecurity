//Entity For Admin DashBoard

package com.pat.project.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Patriot_data_master")
public class PatriotDataMaster implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "exchange_rate")
	private int exchangeRate;

	@Column(name="total_P_sold")
	private String totalPSold;
	
	@Column(name="total_earned")
	private String totalEarned;
	
	@Column(name="date_process")
	private Date dateProcess;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(int exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public String getTotalPSold() {
		return totalPSold;
	}

	public void setTotalPSold(String totalPSold) {
		this.totalPSold = totalPSold;
	}

	public String getTotalEarned() {
		return totalEarned;
	}

	public void setTotalEarned(String totalEarned) {
		this.totalEarned = totalEarned;
	}

	public Date getDateProcess() {
		return dateProcess;
	}

	public void setDateProcess(Date dateProcess) {
		this.dateProcess = dateProcess;
	}
}
