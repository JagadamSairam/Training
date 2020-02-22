package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.copy.RegisterDao;
import com.example.demo.model.Register;

@CrossOrigin(origins="*")
@RestController
public class RegisterController {

	@Autowired
	RegisterDao rd;
	@GetMapping(value="/registerUser")
	public List<Register> findAll(){
		return rd.findAll();
	}
	
	@GetMapping(value="/registerUser/{id}")
	public Register findOne(@PathVariable int id) {
		Optional<Register> reg=rd.findById(id);
		Register r=reg.get();
		return r;
	}
	
	@PostMapping(value="/registerUser")
	public Register save(@RequestBody Register reg) {
		Register user=rd.save(reg);
		return user;
	}
	
	@DeleteMapping(value="/registerUser/{id}")
	public void deleteUser(@PathVariable int id) {
		rd.deleteById(id);
	}
	
	@PutMapping(value="/registerUser")
	public Register updateUser(@RequestBody Register user) {
		Register reg=rd.save(user);
		return reg;
	}
}
