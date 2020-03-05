package com.cts.training.stockprice.stockpriceservice;

import java.util.List;


public interface StockPriceService {
	public StockPriceEntity addStockPrice(StockPriceEntity stockprice);

	public void deleteStockPrice(int id);

	public StockPriceEntity updateStockPrice(StockPriceEntity stockprice);

	public List<StockPriceEntity> getAllStockPrices();

	public StockPriceEntity getStockPriceById(int id);
}
