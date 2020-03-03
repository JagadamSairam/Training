package com.cts.training.initialpublicoffering.initialpublicofferingservice;





import java.util.List;
import java.util.Optional;

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
public class InitialPublicOfferingController {
	@Autowired
	InitialPublicOfferingRepository ipoRepository;
	
	@Autowired
	InitialPublicOfferingService ipoService;
	
	@GetMapping(value="/ipo")
	public ResponseEntity<?> findAll(){
		List<InitialPublicOfferingEntity> list= ipoService.getAllIpos();
		
		if(list.size()>0) {
			return new ResponseEntity<List<InitialPublicOfferingEntity>>(list,HttpStatus.OK);
			
		}
		else {
			return new ResponseEntity<String>("IPOS Are Not Found ", HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping(value="/ipo/{id}")
	public InitialPublicOfferingEntity findOne(@PathVariable int id) {
		Optional<InitialPublicOfferingEntity> ipo = ipoRepository.findById(id);
		InitialPublicOfferingEntity ipoEntity = ipo.get();
		return ipoEntity;
	}
	
	@PostMapping(value="/ipo")
	public InitialPublicOfferingEntity save(@RequestBody InitialPublicOfferingEntity ipoEntity) {
		InitialPublicOfferingEntity ipos=ipoRepository.save(ipoEntity);
		return ipos;
	}
	@DeleteMapping(value="/ipo/{id}")
	public void deleteIPO(@PathVariable int id) {
		ipoRepository.deleteById(id);
	}
	
	@PutMapping(value="/ipo")
	public InitialPublicOfferingEntity updateIpo(@RequestBody InitialPublicOfferingEntity ipos) {
		InitialPublicOfferingEntity ips= ipoRepository.save(ipos);
		return ips;
	}
}
