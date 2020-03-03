package com.cts.training.companyservice;

import java.util.List;



import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	CompanyRepository companyRepository;
	
	@Override
	public String addCompany(CompanyEntity companyEntity) {
		CompanyEntity company = new CompanyEntity();
		String companyname;
		companyname=companyEntity.getName();
		if(companyRepository.findByName(companyname)!= null) {
			return "{\"res\":\"0\"}";
		}
		else {
		BeanUtils.copyProperties(company, companyEntity);
		companyRepository.save(company);
		return "{\"res\":\"1\"}";

	}
		}

	@Override
	public void deleteCompany(int id) {
		companyRepository.deleteById(id);		
	}

	@Override
	public CompanyEntity updateCompany(CompanyEntity companyEntity) {
		CompanyEntity company = new CompanyEntity();
		BeanUtils.copyProperties(companyEntity, company);
		companyRepository.save(company);
		return companyEntity;
	}

	@Override
	public List<CompanyEntity> getAllCompanies() {
		List<CompanyEntity> companies = companyRepository.findAll();
		
		return companies;
	}

	@Override
	public CompanyEntity getCompanyById(int id) {
		Optional<CompanyEntity> coms = companyRepository.findById(id);
		CompanyEntity companyEntity = new CompanyEntity();
		BeanUtils.copyProperties(coms.orElse(new CompanyEntity()), companyEntity);
		return companyEntity;
	}

	
	
}

