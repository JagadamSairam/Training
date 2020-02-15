package com.cts.training.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="ecommerceproduct")
public class Product implements Serializable{
	
	@Id
	@GeneratedValue
	private int id;
	private String productname;
	private int price;
	
	public Product() {
		
	}

	public Product(int id, String productname, int price) {
		super();
		this.id = id;
		this.productname = productname;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

		
}
