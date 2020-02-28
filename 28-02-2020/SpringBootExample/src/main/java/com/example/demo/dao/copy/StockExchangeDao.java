package com.example.demo.dao.copy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.StockExchangeEntity;

public interface StockExchangeDao extends JpaRepository<StockExchangeEntity, Integer>{

}
