package com.cts.training.stockprice.stockpriceservice;

import java.util.List;

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




@CrossOrigin(origins="*")
@RestController
public class StockPriceController {

	@Autowired     
	StockPriceRepository stockPriceRepository;
	
	@Autowired
	StockPriceService stockPriceService;
	
	@GetMapping(value="/stockPrice")
	public ResponseEntity<?> findAll(){
		List<StockPriceEntity> list = stockPriceService.getAllStockPrices();
		if(list.size() >0) {
			return new ResponseEntity<List<StockPriceEntity>>(list,HttpStatus.OK);
		}
		else
			return new ResponseEntity<String>("NO Stocks are there", HttpStatus.NOT_FOUND);
	}
	
	@PostMapping(value="/stockPrice")
	public StockPriceEntity save(@RequestBody StockPriceEntity stock) {
		StockPriceEntity stockEntity = stockPriceRepository.save(stock);
		return stockEntity;
	}
	@DeleteMapping(value="/stockPrice/{id}")
	public void deleteStockPrice(@PathVariable int id) {
		stockPriceService.deleteStockPrice(id);
	}
	@PutMapping(value="/stockPrice")
	public StockPriceEntity updateSector(@RequestBody StockPriceEntity stockprice) {
		StockPriceEntity stocks=stockPriceService.updateStockPrice(stockprice);
		return stocks;
	}
	
	
	
	
}
