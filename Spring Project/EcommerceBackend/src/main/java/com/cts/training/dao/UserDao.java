package com.cts.training.dao;

import java.util.List;

import com.cts.training.model.User;

public interface UserDao {

	public boolean saveOrUpdateUser(User user);
	public boolean deleteUser(User user);
	public List<User> getAllUsers(); 
	public User getUserById(int id);
	

	
}


