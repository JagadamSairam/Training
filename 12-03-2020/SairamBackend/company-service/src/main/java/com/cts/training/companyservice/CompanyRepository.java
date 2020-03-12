package com.cts.training.companyservice;

import org.springframework.data.jpa.repository.JpaRepository;


public interface CompanyRepository extends JpaRepository<CompanyEntity, Integer>{
	public CompanyEntity findByName(String name);

}
