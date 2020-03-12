package com.cts.training.stockprice.stockpriceservice;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public interface StockPriceService {
	public StockPriceEntity addStockPrice(StockPriceEntity stockprice);

	public void deleteStockPrice(int id);

	public StockPriceEntity updateStockPrice(StockPriceEntity stockprice);

	public List<StockPriceEntity> getAllStockPrices();

	public StockPriceEntity getStockPriceById(int id);

	ImportSummaryData addStockPricesFromExcelSheet(MultipartFile file) throws IOException, Exception;

	//public List<StockModel> getCompanyStockPriceBetween(String companyCode, String stockExchange, LocalDate startDate,LocalDate endDate,String periodicity);

	public List<StockModel> getCompanyStockPriceBetween(String companyCode, String stockExchange, LocalDate startDate,LocalDate endDate);

	
	//	public ImportSummaryData addStockPricesFromExcelSheet(MultipartFile file);
}
