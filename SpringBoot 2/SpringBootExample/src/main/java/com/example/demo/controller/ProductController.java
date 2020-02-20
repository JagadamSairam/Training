package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.copy.ProductDao;
import com.example.demo.model.ProductEntity;

@RestController
public class ProductController {

	@Autowired
	ProductDao pd;
	@RequestMapping(value="/prod", method=RequestMethod.GET, produces=MediaType.APPLICATION_XML_VALUE)
	public List<ProductEntity> findAll(){
		return pd.findAll();
	
	}
	
	@RequestMapping(value="/prod/{id}", method=RequestMethod.GET, produces=MediaType.APPLICATION_XML_VALUE)
	public ProductEntity findOne(@PathVariable int id) {
		Optional<ProductEntity> pro = pd.findById(id);
		ProductEntity p = pro.get();
		return p;
	}
	
	
	@RequestMapping(value="/prod",method=RequestMethod.POST)
	public ProductEntity save(@RequestBody ProductEntity pro) {
		ProductEntity product=pd.save(pro);
		return product;
	}
	
	@RequestMapping(value = "/prod/{id}",method = RequestMethod.DELETE)
	public void deleteProduct(@PathVariable int id) {
		pd.deleteById(id);
	}
	@RequestMapping(value="/prod",method=RequestMethod.PUT)
	public ProductEntity updateProduct(@RequestBody ProductEntity pro) {
		ProductEntity prod=pd.save(pro);
		return prod;
	}
}
