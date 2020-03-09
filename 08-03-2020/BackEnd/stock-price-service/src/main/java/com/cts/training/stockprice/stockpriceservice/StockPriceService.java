package com.cts.training.stockprice.stockpriceservice;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public interface StockPriceService {
	public StockPriceEntity addStockPrice(StockPriceEntity stockprice);

	public void deleteStockPrice(int id);

	public StockPriceEntity updateStockPrice(StockPriceEntity stockprice);

	public List<StockPriceEntity> getAllStockPrices();

	public StockPriceEntity getStockPriceById(int id);

	ImportSummaryData addStockPricesFromExcelSheet(MultipartFile file) throws IOException, Exception;

//	public ImportSummaryData addStockPricesFromExcelSheet(MultipartFile file);
}
