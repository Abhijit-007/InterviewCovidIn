package com.Covid.Service;

import java.util.HashMap;

import com.Covid.Model.User;

public class UserService {
	
	private HashMap<String,User> userMap;
	private static UserService userService;
	private UserService() {
		super();
		this.userMap=new HashMap<>();
		// TODO Auto-generated constructor stub
	}
	
	public HashMap<String, User> getUserMap() {
		return userMap;
	}

	public static UserService getInstance() {
		if(userService==null) {
			return new UserService();
		}
		return userService;
	}
	
	public void addUser(String userId,User user) {
		// TODO Auto-generated method stub
		userMap.put(userId, user);
	}
	

	
	
}
