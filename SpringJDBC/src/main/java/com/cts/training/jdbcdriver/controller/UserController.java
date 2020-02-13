package com.cts.training.jdbcdriver.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import java.util.ArrayList;
//import java.util.List;

import com.cts.training.jdbcdriver.imp.UserDAOImp;
import com.cts.training.jdbcdriver.interfaces.UserDAO;
import com.cts.training.jdbcdriver.model.User;

public class UserController {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("./application-context.xml");
		UserDAO userDAO= (UserDAO) context.getBean("userDAOImp");
		
		//User user1=new User(41,"Sairam","sairam@gmail.com",98765432l);
		
//		User user1=new User(42,"venkata","venata@gmail.com",7898767898l);
//		User user2=new User(43,"Jagadam","jagadam@gmail.com",898265152l);
//		User user3=new User(44,"Sai","sai@gmail.com",987689987l);
//		User user4=new User(45,"ram","ram@gmail.com",898767876l);

		//UserDAO us=new UserDAOImp();
//		userDAO.saveUser(user1);
//		userDAO.saveUser(user2);
//		userDAO.saveUser(user3);
//		userDAO.saveUser(user4);

		//System.out.println(us);
//		List<User> list= new ArrayList<User>();
		
//		list.add(user1);
//		User user1 = userDAO.getUserById(44);
//		try {
//			userDAO.deleteUser(user1);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		User user1=userDAO.getUserById(43);
		user1.setEmail("JagadamVenkataSairam@gmail.com");
		userDAO.updateUser(user1);
		
		
		System.out.println(userDAO.getAllUsers());

	}

}
