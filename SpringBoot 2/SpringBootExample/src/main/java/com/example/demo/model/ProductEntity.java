package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="productboot")
@XmlRootElement(name="item")
public class ProductEntity {

	@Id
	@GeneratedValue
	private int id;
	private String description;
	private int price;
	public ProductEntity() {
		
	}
	
	@Override
	public String toString() {
		return "ProductEntity [id=" + id + ", description=" + description + ", price=" + price + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
