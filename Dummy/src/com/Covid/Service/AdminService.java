package com.Covid.Service;

import java.util.HashMap;

import com.Covid.Model.HealthWorker;
import com.Covid.Model.User;

public class AdminService {

	private HashMap<String,HealthWorker> adminMap;

	private static AdminService adminService=null;
	
	private HashMap<String,String> zoneMap;
	private HashMap<String,Integer> pincodeCaseMap;
	
	private AdminService() {
		super();
		this.adminMap=new HashMap<>();
		this.zoneMap=new HashMap<>();
		this.pincodeCaseMap=new HashMap<>();
		// TODO Auto-generated constructor stub
	}
	
	public static AdminService getInstance() {
		if(adminService==null) {
			return new AdminService();
		}
		return adminService;
	}
	
	public void addUser(String adminId,HealthWorker admin) {
		// TODO Auto-generated method stub
		adminMap.put(adminId, admin);
	}
	
	public void updateCovidResul(String userId,String adminId,boolean isPositive) {
		// TODO Auto-generated method stub
		UserService userService=UserService.getInstance();
		User user=userService.getUserMap().get(userId);
		user.setPositive(isPositive);
		user.setAdminDiagnoseId(adminId);;
		if(isPositive) {
			pincodeCaseMap.put(user.getPinCode(), pincodeCaseMap.get(user.getPinCode())+1);
			updateZonecolor(user.getPinCode());
		}
		else {
			updateZonecolor(user.getPinCode());
		}
		
	}

	public void updateZonecolor(String pinCode) {
		// TODO Auto-generated method stub
		if(pincodeCaseMap.get(pinCode)<5) {
			zoneMap.put(pinCode, "RED");
		}else if(pincodeCaseMap.get(pinCode)>5) {
			zoneMap.put(pinCode, "ORANGE");
		}
		else {
			zoneMap.put(pinCode, "GREEN");
		}
		
	}
	
	
	
}
