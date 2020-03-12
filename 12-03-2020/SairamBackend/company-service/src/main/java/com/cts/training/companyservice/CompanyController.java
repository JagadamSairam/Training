package com.cts.training.companyservice;

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

@CrossOrigin(origins = "*")
@RestController
public class CompanyController {

	@Autowired
	CompanyRepository companyRepository;

	@Autowired
	CompanyService companyService;
	@Autowired
	UserServiceProxy userServiceProxy;

	@GetMapping(value = "/company")
	public ResponseEntity<?> findAll() {
		List<CompanyEntity> list = companyService.getAllCompanies();
		if (list.size() > 0) {
			return new ResponseEntity<List<CompanyEntity>>(list, HttpStatus.OK);
		}

		else {
			return new ResponseEntity<String>("Companies Not found", HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping(value = "/company/{id}")
	public CompanyEntity findOne(@PathVariable int id) {
		Optional<CompanyEntity> com = companyRepository.findById(id);
		CompanyEntity company = com.get();
		return company;
	}

	@PostMapping(value = "/company")
	public CompanyEntity save(@RequestBody CompanyEntity com) {
		CompanyEntity company = companyRepository.save(com);
		return company;
	}

	@DeleteMapping(value = "/company/{id}")
	public void deleteCompany(@PathVariable int id) {
		companyService.deleteCompany(id);
	}

	@PutMapping(value = "/company")
	public CompanyEntity updateCompany(@RequestBody CompanyEntity comp) {
		CompanyEntity company = companyService.updateCompany(comp);
		return company;
	}

	@GetMapping(value = "/stockPricesByCompanies")
	public List<StockPriceEntity> getAllPrices() {
		List<StockPriceEntity> list = userServiceProxy.findAll();
		return list;
	}

}
