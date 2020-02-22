package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.copy.StockExchangeDao;
import com.example.demo.model.StockExchangeEntity;

@CrossOrigin(origins="*")
@RestController
public class StockExchangeController {

	@Autowired
	StockExchangeDao std;
	@GetMapping(value="/stockExchange")
	public List<StockExchangeEntity> findAll(){
		return std.findAll();
	}
	
	@GetMapping(value="/stockExchange/{id}")
	public StockExchangeEntity findOne(@PathVariable int id) {
		Optional<StockExchangeEntity> stock = std.findById(id);
		StockExchangeEntity stocks=stock.get();
		return stocks;
	}
	
	@PostMapping(value="/stockExchange")
	public StockExchangeEntity save(@RequestBody StockExchangeEntity stock) {
		StockExchangeEntity stocks = std.save(stock);
		return stocks;
	}
	@DeleteMapping(value="/stockExchange/{id}")
	public void deleteStockExchange(@PathVariable int id) {
		std.deleteById(id);
	}
	@PutMapping(value = "/stockExchange")
	public StockExchangeEntity updateStockExchange(@RequestBody StockExchangeEntity stock) {
		StockExchangeEntity stocks=std.save(stock);
		return stocks;
	}
}
