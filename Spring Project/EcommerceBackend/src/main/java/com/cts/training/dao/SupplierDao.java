package com.cts.training.dao;

import java.util.List;

import com.cts.training.model.Product;
import com.cts.training.model.Supplier;

public interface SupplierDao {

	public boolean saveOrUpdateSupplier(Supplier supplier);
	public boolean deleteSupplier(Supplier supplier);
	public List<Supplier> getAllSuppliers();
	public Supplier getSupplierById(int id);


}
