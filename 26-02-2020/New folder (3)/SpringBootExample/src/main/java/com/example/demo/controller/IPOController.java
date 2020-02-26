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

import com.example.demo.dao.copy.IPODao;
import com.example.demo.model.IPOEntity;

@CrossOrigin(origins="*")
@RestController
public class IPOController {

	@Autowired
	IPODao ipo;
	@GetMapping(value="/ipo")
	public List<IPOEntity> findAll(){
		return ipo.findAll();
	}
	
	@GetMapping(value="/ipo/{id}")
	public IPOEntity findOne(@PathVariable int id) {
		Optional<IPOEntity> ipoo=ipo.findById(id);
		IPOEntity i=ipoo.get();
		return i;
	}
	
	@PostMapping(value="/ipo")
	public IPOEntity save(@RequestBody IPOEntity ipos) {
		IPOEntity ipoo=ipo.save(ipos);
		return ipoo;
	}
	@DeleteMapping(value="/ipo/{id}")
	public void deleteIPO(@PathVariable int id) {
		ipo.deleteById(id);
	}
	
	@PutMapping(value="/ipo")
	public IPOEntity updateIpo(@RequestBody IPOEntity ipos) {
		IPOEntity ipooo= ipo.save(ipos);
		return ipooo;
	}
}
