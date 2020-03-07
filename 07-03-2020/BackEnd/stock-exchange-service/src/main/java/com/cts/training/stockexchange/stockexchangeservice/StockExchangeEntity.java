package com.cts.training.stockexchange.stockexchangeservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name = "stock_exchanges")
public class StockExchangeEntity {

	@Id
	@GeneratedValue
	private int id;
	private String exchangeName;
	private String contactAddress;
	private String brief;
	public StockExchangeEntity() {

	}

	public StockExchangeEntity(int id, String exchangeName, String contactAddress, String brief, String remarks) {
		super();
		this.id = id;
		this.exchangeName = exchangeName;
		this.contactAddress = contactAddress;
		this.brief = brief;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getExchangeName() {
		return exchangeName;
	}

	public void setExchangeName(String exchangeName) {
		this.exchangeName = exchangeName;
	}

	public String getContactAddress() {
		return contactAddress;
	}

	public void setContractAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	@Override
	public String toString() {
		return "StockExchange [id=" + id + ", exchangeName=" + exchangeName + ", contractAddress=" + contactAddress
				+ ", brief=" + brief + "]";
	}

}
