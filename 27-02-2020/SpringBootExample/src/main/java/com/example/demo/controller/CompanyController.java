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

import com.example.demo.dao.copy.CompanyDao;
import com.example.demo.model.Company;

@CrossOrigin(origins="*")
@RestController
public class CompanyController {

	@Autowired
	CompanyDao cd;
	@GetMapping(value="/company")
	public List<Company> findAll(){
		return cd.findAll();
	}
	
	@GetMapping(value="/company/{id}")
	public Company findOne(@PathVariable int id) {
		Optional<Company> com=cd.findById(id);
		Company c= com.get();
		return c;
	}
	
	@PostMapping(value="/company")
	public Company save(@RequestBody Company com) {
		Company company = cd.save(com);
		return company;
	}
	
	@DeleteMapping(value="/company/{id}")
	public void deleteCompany(@PathVariable int id) {
		cd.deleteById(id);
	}
	@PutMapping(value="/company")
	public Company updateCompany(@RequestBody Company comp) {
		Company co=cd.save(comp);
		return co;
	}
}
