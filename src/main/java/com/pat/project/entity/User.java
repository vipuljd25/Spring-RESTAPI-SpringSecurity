package com.pat.project.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private String userId;

	@Column(name = "user_name")
	private String name;

	@Column(name = "user_password")
	private String password;

	@Column(name = "email_id")
	private String emailId;

	@Column(name = "mobile_no")
	private String mobileNo;

	@Column(name = "joined_date")
	private Date joinedDate;

	@Column(name = "mnt_status")
	private char mntStatus;

	@Column(name = "user_type")
	private char userType;

	@Column(name = "purchased_p")
	private int purchasedP;

	@Column(name = "sold_p")
	private int soldP;

	@Column(name = "currently_owned_p")
	private int valueOfCurrentlyOwenedP;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Date getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}

	public char getMntStatus() {
		return mntStatus;
	}

	public void setMntStatus(char mntStatus) {
		this.mntStatus = mntStatus;
	}

	public char getUserType() {
		return userType;
	}

	public void setUserType(char userType) {
		this.userType = userType;
	}

	public int getPurchasedP() {
		return purchasedP;
	}

	public void setPurchasedP(int purchasedP) {
		this.purchasedP = purchasedP;
	}

	public int getSoldP() {
		return soldP;
	}

	public void setSoldP(int soldP) {
		this.soldP = soldP;
	}

	public int getValueOfCurrentlyOwenedP() {
		return valueOfCurrentlyOwenedP;
	}

	public void setValueOfCurrentlyOwenedP(int valueOfCurrentlyOwenedP) {
		this.valueOfCurrentlyOwenedP = valueOfCurrentlyOwenedP;
	}

}