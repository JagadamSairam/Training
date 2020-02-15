package com.cts.training.dao;

import java.util.List;

import com.cts.training.model.Product;

public interface ProductDao {

	public boolean saveOrUpdateProduct(Product product);
	public boolean deleteProduct(Product product);
	public List<Product> getAllProducts();
	public Product getProductById(int id);
	
}
