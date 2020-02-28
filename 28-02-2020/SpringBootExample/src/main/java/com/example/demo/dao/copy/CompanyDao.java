package com.example.demo.dao.copy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Company;

public interface CompanyDao extends JpaRepository<Company, Integer> {

}
