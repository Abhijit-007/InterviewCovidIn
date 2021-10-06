package com.Covid.Driver;

import java.util.Scanner;

import com.Covid.Model.HealthWorker;
import com.Covid.Model.SelfAssessment;
import com.Covid.Model.User;
import com.Covid.Service.AdminService;
import com.Covid.Service.UserService;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserService userService=UserService.getInstance();;
		
		User user=new User("u","12345","11111");
		User user1=new User("u1","12346","11112");

		User user4=new User("u4","12347","11113");
		User user2=new User("u2","12348","11114");
		User user3=new User("u3","12349","11115");

		User user5=new User("u5","12349","11115");
		User user6=new User("u6","12349","11115");
		User user7=new User("u7","12349","11115");
		User user8=new User("u8","12349","11115");
		userService.addUser(user.getUserId(), user);
		userService.addUser(user1.getUserId(), user1);
		userService.addUser(user2.getUserId(), user2);
		userService.addUser(user3.getUserId(), user3);
		userService.addUser(user4.getUserId(), user4);
		userService.addUser(user5.getUserId(), user5);
		userService.addUser(user6.getUserId(), user6);
		userService.addUser(user7.getUserId(), user7);
		userService.addUser(user8.getUserId(), user8);
		
		//String s[]=new String();
		SelfAssessment selfAssesment=new SelfAssessment(user.getUserId(),new String[]{"abc","def","ght"}, true, false);
		
		
		
		AdminService adminService=AdminService.getInstance();
		
		
		HealthWorker healthWorker=new HealthWorker("a1", "23456", "12345");
		HealthWorker healthWorker1=new HealthWorker("a2", "23457", "12346");
		
		adminService.addUser(healthWorker.getUserId(), healthWorker);
		adminService.addUser(healthWorker1.getUserId(), healthWorker1);
		
		
		adminService.updateCovidResul(user3.getUserId(),healthWorker.getUserId(),true);

		adminService.updateCovidResul(user4.getUserId(),healthWorker.getUserId(),true);

		adminService.updateCovidResul(user3.getUserId(),healthWorker.getUserId(),true);

		adminService.updateCovidResul(user3.getUserId(),healthWorker.getUserId(),true);

		adminService.updateCovidResul(user3.getUserId(),healthWorker.getUserId(),true);
		
		Scanner scanner=new Scanner(System.in);
		
		
		
		
	}

}
