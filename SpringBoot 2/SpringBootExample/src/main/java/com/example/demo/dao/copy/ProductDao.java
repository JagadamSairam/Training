package com.example.demo.dao.copy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ProductEntity;

public interface ProductDao extends JpaRepository<ProductEntity,Integer>{

	
}
