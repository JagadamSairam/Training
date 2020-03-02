package com.cts.training.userservice;

import java.util.List;

public interface UserService {

	public String addUser(UserEntity user);

	public void deleteUser(int id);

	public UserEntity updateUser(UserEntity user);

	public List<UserEntity> getAllUsers();

	public UserEntity getUserById(int id);
}
