package com.Covid.Model;

import com.Covid.Service.UserService;

public class SelfAssessment {
	
	String[] symptoms;
	boolean traveHistory,contactWithCovidPatient;
	int riskPercentage;
	
	public SelfAssessment(String userId,String[] symptoms, boolean traveHistory, boolean contactWithCovidPatient) {
		super();
		this.symptoms = symptoms;
		this.traveHistory = traveHistory;
		this.contactWithCovidPatient = contactWithCovidPatient;
		updateriskPercent(userId);
	}

	private void updateriskPercent(String userId) {
		// TODO Auto-generated method stub
		UserService userService=UserService.getInstance();
		User user=userService.getUserMap().get(userId);
		if(this.symptoms.length>2) {
			user.setRiskPercentage(95);
		//	riskPercentage=95;
		}
		else if(this.symptoms.length==2) {
			user.setRiskPercentage(75);
			//riskPercentage=75;
		}
		else if(this.symptoms.length==1) {
			user.setRiskPercentage(50);
			riskPercentage=50;
		}
		else {
			user.setRiskPercentage(5);
			//riskPercentage=5;
		}
	}
	
	

}
