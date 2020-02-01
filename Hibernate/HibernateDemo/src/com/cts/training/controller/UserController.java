package com.cts.training.controller;


import com.cts.training.dao.UserDAO;
import com.cts.training.dao.impl.UserDAOImpl;
import com.cts.training.model.User;

public class UserController {

	public static void main(String[] args) {

		User user = new User(105, "saikrishna", "123456", "sai@cts.com", 56757567L, true);

		UserDAO userDAO = new UserDAOImpl();

		boolean status = userDAO.saveUser(user);
		if (status) {
			System.out.println("user Saved Successfully");
		} else {
			System.out.println("Try Again");
		}

	}

}
