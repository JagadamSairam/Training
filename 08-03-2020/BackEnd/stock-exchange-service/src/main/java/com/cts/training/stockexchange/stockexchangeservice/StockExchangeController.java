package com.cts.training.stockexchange.stockexchangeservice;

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


@CrossOrigin("*")
@RestController
public class StockExchangeController {

	@Autowired
	StockExchangeRepository stockExchangeRepository;
	
	@Autowired
	StockExchangeService stockExchangeService;
	
	
	@GetMapping(value="/stockExchange")
	public ResponseEntity<?> findAll(){
		List<StockExchangeEntity> list = stockExchangeService.getAllStocks();
		if(list.size() >0) {
			return new ResponseEntity<List<StockExchangeEntity>>(list,HttpStatus.OK);
		}
		else
			return new ResponseEntity<String>("NO Stocks are there", HttpStatus.NOT_FOUND);
	}
	
	@GetMapping(value="/stockExchange/{id}")
	public StockExchangeEntity getById(@PathVariable int id) {
		Optional<StockExchangeEntity> stock = stockExchangeRepository.findById(id);
		StockExchangeEntity stocks = stock.get();
		return stocks;
	}
	
	@PostMapping(value="/stockExchange")
	public StockExchangeEntity save(@RequestBody StockExchangeEntity stock) {
		StockExchangeEntity stockEntity = stockExchangeRepository.save(stock);
		return stockEntity;
	}
	
	
	@DeleteMapping(value="/stockExchange/{id}")
	public void deleteStock(@PathVariable int id) {
		stockExchangeService.deleteStockExchange(id);
	}
	@PutMapping(value="/stockExchange/")
	public StockExchangeEntity updateStock(@RequestBody StockExchangeEntity stock) {
		StockExchangeEntity stocks=stockExchangeService.updateStockExchange(stock);
		return stocks;
	}
}

