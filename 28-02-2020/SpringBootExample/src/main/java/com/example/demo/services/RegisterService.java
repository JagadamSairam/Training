package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.RegisterDTO;

public interface RegisterService {
public String addUser(RegisterDTO user);
public void deleteUser(int id);
public RegisterDTO updateUser(RegisterDTO user);
public List<RegisterDTO> getAllUsers();
public RegisterDTO getUserById(int id);
//public boolean activateUser(String email);

}
