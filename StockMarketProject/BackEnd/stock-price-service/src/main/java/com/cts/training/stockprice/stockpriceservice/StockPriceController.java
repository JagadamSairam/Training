package com.cts.training.stockprice.stockpriceservice;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import javax.mail.Multipart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;




@CrossOrigin(origins="*")
@RestController
public class StockPriceController {

	@Autowired     
	StockPriceRepository stockPriceRepository;

	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
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
	
	@GetMapping
	(value="/stockPrice/companyStockPriceBetween/{companyCode}/{stockExchange}/{startDate}/{endDate}", produces="application/json")
	public ResponseEntity<?> getCompanyStockPriceDayBetween(@PathVariable String companyCode, @PathVariable String stockExchange, @PathVariable String startDate, @PathVariable String endDate){
		return new ResponseEntity<List<StockModel>>(stockPriceService.getCompanyStockPriceBetween(companyCode, stockExchange, LocalDate.parse(startDate), LocalDate.parse(endDate)),HttpStatus.OK);
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
	
	
	@PostMapping(value="stockPrice/uploadStocksSheet", consumes=MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<?> uploadStockSheet(@RequestParam("stockSheet") MultipartFile file){
		logger.info("File Recieved: {} ", file.getOriginalFilename());
		if(file.getOriginalFilename().endsWith(".xls") || file.getOriginalFilename().endsWith(".xlsx")) {
			try {
				return new ResponseEntity<ImportSummaryData>(stockPriceService.addStockPricesFromExcelSheet(file),HttpStatus.OK);
			}
			catch(IOException e) {
				e.printStackTrace();
				return new ResponseEntity<String>("Error Reading File", HttpStatus.BAD_REQUEST);
			}
			catch(Exception e) {
				e.printStackTrace();
				return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
			}
		}
			else {
				return new ResponseEntity<String>("Wrong File Extension . the File Should be .xls or .xlsx file.",HttpStatus.BAD_REQUEST);
			}
		}
	}
	
	

