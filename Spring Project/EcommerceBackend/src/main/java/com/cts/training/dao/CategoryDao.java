package com.cts.training.dao;

import java.util.List;

import com.cts.training.model.Category;

public interface CategoryDao {

	public boolean saveOrUpdateCategory(Category cat);
	public boolean deleteCategory(Category cat);
	public Category getCategoryById(int id);
	public List<Category> getAllCategories();
	
	
}
