package com.Covid.Model;

import java.util.UUID;

public class HealthWorker {
	
	String adminName,mobileNo,pinCode,adminId;
	
	public HealthWorker(String userName, String mobileNo, String pinCode) {
		super();
		this.adminName = userName;
		this.mobileNo = mobileNo;
		this.pinCode = pinCode;
		this.adminId = UUID.randomUUID().toString();
	}

	public String getUserName() {
		return adminName;
	}

	public void setUserName(String userName) {
		this.adminName = userName;
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

	public String getUserId() {
		return adminId;
	}

	
	
}
