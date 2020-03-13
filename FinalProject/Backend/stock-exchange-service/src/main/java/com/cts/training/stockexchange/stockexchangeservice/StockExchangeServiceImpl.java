package com.cts.training.stockexchange.stockexchangeservice;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class StockExchangeServiceImpl implements StockExchangeService {

	@Autowired
	StockExchangeRepository stockExchangeRepository;

	@Override
	public StockExchangeEntity addStockExchange(StockExchangeEntity stock) {
		StockExchangeEntity stockExchangeEntity = new StockExchangeEntity();
		BeanUtils.copyProperties(stock, stockExchangeEntity);
		stockExchangeRepository.save(stock);
		return stockExchangeEntity;

	}

	@Override
	public void deleteStockExchange(int id) {
		stockExchangeRepository.deleteById(id);
	}

	@Override
	public StockExchangeEntity updateStockExchange(StockExchangeEntity stock) {
		StockExchangeEntity exchangeEntity = new StockExchangeEntity();
		BeanUtils.copyProperties(stock, exchangeEntity);
		stockExchangeRepository.save(exchangeEntity);
		return stock;
	}

	@Override
	public List<StockExchangeEntity> getAllStocks() {
		List<StockExchangeEntity> entities = stockExchangeRepository.findAll();
		return entities;
	}

	@Override
	public StockExchangeEntity getStockById(int id) {
		Optional<StockExchangeEntity> stocks = stockExchangeRepository.findById(id);
		StockExchangeEntity stockEntity = new StockExchangeEntity();
		BeanUtils.copyProperties(stocks.orElse(new StockExchangeEntity()), stockEntity);
		return stockEntity;
	}

}
