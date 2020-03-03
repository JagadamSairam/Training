package com.cts.training.sector.sectorservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin(origins="*")
@RestController
public class SectorController {

	@Autowired
	SectorRepository sectorRepository;
	
	@Autowired
	SectorService sectorService;
	
	@GetMapping(value="/sector")
	public ResponseEntity<?> findAll(){
		List<SectorEntity> list = sectorService.getAllSectors();
		if(list.size() >0) {
			return new ResponseEntity<List<SectorEntity>>(list,HttpStatus.OK);
		}
		else
			return new ResponseEntity<String>("NO Stocks are there", HttpStatus.NOT_FOUND);
	}
	
	

	@PostMapping(value="/sector")
	public SectorEntity save(@RequestBody SectorEntity sector) {
		SectorEntity sectorEntity = sectorRepository.save(sector);
		return sectorEntity;
	}
	
	@DeleteMapping(value="/sector/{id}")
	public void deleteSector(@PathVariable int id) {
		sectorService.deleteSector(id);
	}
	@PutMapping(value="/sector")
	public SectorEntity updateSector(@RequestBody SectorEntity sector) {
		SectorEntity sectors=sectorService.updateSector(sector);
		return sectors;
	}
	
	
}
