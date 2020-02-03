package com.cts.training.controller;


import java.util.List;

import com.cts.training.dao.UserDAO;
import com.cts.training.dao.impl.UserDAOImpl;
import com.cts.training.model.User;

public class UserController {

	public static void main(String[] args) {

//		User user = new User(109, "ram", "890", "jagadamsairam@cts.com", 8098780567L, false);

		UserDAO userDAO = new UserDAOImpl();

//		boolean status = userDAO.saveUser(user);
		
		boolean status= userDAO.isValidUser("sairam", "8767890");
		if (status) {
			System.out.println("It is a Valid User");
		} else {
			System.out.println("Credentials are not matched");
		}
//		User user2=userDAO.getUserById(108);
//		boolean status2 = userDAO.daleteUser(user2);
//		
//		if(status2) {
//			System.out.println("User Deleted Success fully");
//		}
//		else {
//			System.out.println("Error Was Occured while deletion");
//		}
		
//		List<User> li = userDAO.getAllUsers();
//		li.forEach(System.out::println);
		
		
	}

}
