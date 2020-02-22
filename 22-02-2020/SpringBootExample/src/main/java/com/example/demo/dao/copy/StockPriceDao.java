package com.example.demo.dao.copy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.StockPriceEntity;

public interface StockPriceDao extends JpaRepository<StockPriceEntity, Integer> {

}
