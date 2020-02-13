package com.cts.training.jdbcdriver.interfaces;

import java.util.List;

import com.cts.training.jdbcdriver.model.User;



public interface UserDAO {
	public boolean saveUser(User user);

	public boolean updateUser(User user);

	//public boolean saveOrUpdateUser(Register register);
	public boolean deleteUser(User user);

	public User getUserById(int id);

	public List<User> getAllUsers();
}
