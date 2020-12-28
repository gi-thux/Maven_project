package com.vastica.udm.controller;

import javax.swing.JOptionPane;

import com.vastica.udm.model.User;
import com.vastica.udm.service.UserService;
import com.vastica.udm.service.UserServiceImp;

public class UserController {
	


	public static void main(String[] args) {
		
		UserService userService= new UserServiceImp();
		
		User user=getUser();
		
		int saved=userService.saveUserInfo(user);
		if (saved>=1) {JOptionPane.showMessageDialog(null,"user saved in the Database");}
		else {JOptionPane.showMessageDialog(null,"ERROR");}
		
		
		
	}
	
	public static User getUser() {
		User user = new User();
		String username = JOptionPane.showInputDialog("Enter username");
		long age =Long.parseLong(JOptionPane.showInputDialog("Enter age"));
		long mobile_No=Long.parseLong(JOptionPane.showInputDialog("Enter mobile number"));
		double salary=Double.parseDouble(JOptionPane.showInputDialog("Enter the salary"));
		boolean is_Active=Boolean.parseBoolean(JOptionPane.showInputDialog("Is the user active"));
		
		user.setUserame(username);
		user.setAge(age);
		user.setMobile_No(mobile_No);
		user.setSalary(salary);
		user.setIs_Active(is_Active);
		
		return user;
		}
		
				
		
		
		
		
		
		
	}


