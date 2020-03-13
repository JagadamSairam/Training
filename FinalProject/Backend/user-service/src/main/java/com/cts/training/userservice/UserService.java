package com.cts.training.userservice;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

public interface UserService {

	public UserEntity addUser(UserEntity user);

	public void deleteUser(int id);

	public UserEntity updateUser(UserEntity user);

	public List<UserEntity> getAllUsers();

	public UserEntity getUserById(int id);

	public String activate(@RequestBody String email);

	public UserEntity getUserByUsernameAndPassword(String username, String password);
}
