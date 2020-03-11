package com.cts.training.stockprice.stockpriceservice;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class ImportSummaryData {

	private int numberOfRecordsInserted;
	private LocalDate startDate;
	private LocalDate endDate;
	private Set<String> companycodes;
	private Set<String> stockExchanges;
	private List<String> duplicates;
	public ImportSummaryData() {
		
	}
	public ImportSummaryData(int numberOfRecordsInserted, LocalDate startDate, LocalDate endDate,
			Set<String> companycodes, Set<String> stockExchanges, List<String> duplicates) {
		super();
		this.numberOfRecordsInserted = numberOfRecordsInserted;
		this.startDate = startDate;
		this.endDate = endDate;
		this.companycodes = companycodes;
		this.stockExchanges = stockExchanges;
		this.duplicates = duplicates;
	}
	public int getNumberOfRecordsInserted() {
		return numberOfRecordsInserted;
	}
	public void setNumberOfRecordsInserted(int numberOfRecordsInserted) {
		this.numberOfRecordsInserted = numberOfRecordsInserted;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public Set<String> getCompanycodes() {
		return companycodes;
	}
	public void setCompanycodes(Set<String> companycodes) {
		this.companycodes = companycodes;
	}
	public Set<String> getStockExchanges() {
		return stockExchanges;
	}
	public void setStockExchanges(Set<String> stockExchanges) {
		this.stockExchanges = stockExchanges;
	}
	public List<String> getDuplicates() {
		return duplicates;
	}
	public void setDuplicates(List<String> duplicates) {
		this.duplicates = duplicates;
	}
	
}
