package com.cts.training.stockexchange.stockexchangeservice;

import java.util.List;

public interface StockExchangeService {
	public StockExchangeEntity addStockExchange(StockExchangeEntity stock);

	public void deleteStockExchange(int id);

	public StockExchangeEntity updateStockExchange(StockExchangeEntity stock);

	public List<StockExchangeEntity> getAllStocks();

	public StockExchangeEntity getStockById(int id);
}