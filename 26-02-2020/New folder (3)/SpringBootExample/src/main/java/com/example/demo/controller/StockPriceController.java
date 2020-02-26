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

import com.example.demo.dao.copy.StockPriceDao;
import com.example.demo.model.StockPriceEntity;

@CrossOrigin(origins="*")
@RestController
public class StockPriceController {
@Autowired
StockPriceDao stockPriceDao;
@GetMapping(value="/stockPrice")
public List<StockPriceEntity> findAll(){
	return stockPriceDao.findAll();
}
@GetMapping(value="/stockPrice/{id}")
public StockPriceEntity findOne(@PathVariable int id) {
	Optional<StockPriceEntity> stock=stockPriceDao.findById(id);
	StockPriceEntity st=stock.get();
	return st;
}

@PostMapping(value="/stockPrice")
public StockPriceEntity save(@RequestBody StockPriceEntity stock) {
	StockPriceEntity stocks=stockPriceDao.save(stock);
	return stocks;
}

@DeleteMapping(value="/stockPrice/{id}")
public void deleteStockPrice(@PathVariable int id) {
	stockPriceDao.deleteById(id);
}
@PutMapping(value="/stockPrice")
public StockPriceEntity updateStockPrice(@RequestBody StockPriceEntity stock) {
	StockPriceEntity stocks = stockPriceDao.save(stock);
	return stocks;
}
}