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

import com.example.demo.dao.copy.SectorDao;
import com.example.demo.model.Sector;

@CrossOrigin(origins="*")
@RestController
public class SectorController {

	@Autowired
	SectorDao sectorDao;
	@GetMapping(value="/sector")
	public List<Sector> findAll(){
		return sectorDao.findAll();
	}
	
	@GetMapping(value="/sector/{id}")
	public Sector findOne(@PathVariable int id) {
		Optional<Sector> sec= sectorDao.findById(id);
		Sector sector= sec.get();
		return sector;
	}
	
	@PostMapping(value="/sector")
	public Sector save(@RequestBody Sector sect) {
		Sector sector = sectorDao.save(sect);
		return sector;
	}
	@DeleteMapping(value="/sector/{id}")
	public void deleteSector(@PathVariable int id) {
		sectorDao.deleteById(id);
	}
	
	@PutMapping(value = "/sector")
	public Sector updateSector(@RequestBody Sector sec) {
		Sector sect=sectorDao.save(sec);
		return sect;
	}
}
