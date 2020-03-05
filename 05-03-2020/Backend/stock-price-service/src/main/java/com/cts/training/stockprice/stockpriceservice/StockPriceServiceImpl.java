package com.cts.training.stockprice.stockpriceservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class StockPriceServiceImpl implements StockPriceService{

	@Autowired
	StockPriceRepository stockPriceRepository;
	
	@Override
	public StockPriceEntity addStockPrice(StockPriceEntity stockprice) {
		StockPriceEntity stockPriceEntity = new StockPriceEntity();
		BeanUtils.copyProperties(stockprice, stockPriceEntity);
		stockPriceRepository.save(stockprice);
		return stockPriceEntity;
	}

	@Override
	public void deleteStockPrice(int id) {
		stockPriceRepository.deleteById(id);
		
	}

	@Override
	public StockPriceEntity updateStockPrice(StockPriceEntity stockprice) {
		StockPriceEntity stockPriceEntity = new StockPriceEntity();
		BeanUtils.copyProperties(stockprice, stockPriceEntity);
		stockPriceRepository.save(stockPriceEntity);
		return stockprice;
	}

	@Override
	public List<StockPriceEntity> getAllStockPrices() {
		List<StockPriceEntity> entities =stockPriceRepository.findAll();
		
		return entities;
	}

	@Override
	public StockPriceEntity getStockPriceById(int id) {
		Optional<StockPriceEntity> stocks = stockPriceRepository.findById(id);
		StockPriceEntity stockEntity = new StockPriceEntity();
		BeanUtils.copyProperties(stocks.orElse(new StockPriceEntity()), stockEntity);
		return stockEntity;
	}

}
