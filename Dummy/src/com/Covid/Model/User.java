package com.Covid.Model;

import java.util.UUID;

public class User {

	String userName,mobileNo,pinCode,userId,adminDiagnoseId;
	int riskPercentage;
	public int getRiskPercentage() {
		return riskPercentage;
	}

	public void setRiskPercentage(int riskPercentage) {
		this.riskPercentage = riskPercentage;
	}

	public String getAdminDiagnoseId() {
		return adminDiagnoseId;
	}

	public void setAdminDiagnoseId(String adminDiagnoseId) {
		this.adminDiagnoseId = adminDiagnoseId;
	}

	boolean isPositive;
	
	

	public User(String userName, String mobileNo, String pinCode) {
		super();
		this.userName = userName;
		this.mobileNo = mobileNo;
		this.pinCode = pinCode;
		this.userId=UUID.randomUUID().toString();
	}

	public String getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
	public boolean isPositive() {
		return isPositive;
	}

	public void setPositive(boolean isPositive) {
		this.isPositive = isPositive;
	}
	
}
