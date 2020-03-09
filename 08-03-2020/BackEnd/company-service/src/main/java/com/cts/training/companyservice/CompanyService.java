package com.cts.training.companyservice;

import java.util.List;

public interface CompanyService {
	public String addCompany(CompanyEntity company);

	public void deleteCompany(int id);

	public CompanyEntity updateCompany(CompanyEntity company);

	public List<CompanyEntity> getAllCompanies();

	public CompanyEntity getCompanyById(int id);

}
