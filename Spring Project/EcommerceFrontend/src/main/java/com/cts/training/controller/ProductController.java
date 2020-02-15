package com.cts.training.controller;


import java.util.List;
import javax.swing.text.html.FormSubmitEvent.MethodType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cts.training.dao.ProductDao;
import com.cts.training.model.Product;
@Controller
public class ProductController {
	@Autowired
	ProductDao productDao;
	@GetMapping("/product-home")
	public String productPage(Model model)
	{
		model.addAttribute("product", new Product());//registe rwill work as a medel attribute in the form
		//Register user=new Register();
		List<Product> products=productDao.getAllProducts();
		model.addAttribute("productlist", products);
		return "product";
	}
	@PostMapping("/product/save")
	//@RequestMapping(value="/user/save",method=RequestMethod.POST)
	public String updateProduct(@ModelAttribute("product") Product product){
		productDao.saveOrUpdateProduct(product);
		return "redirect:/product-home";
	}
	@GetMapping("/removeproduct/{id}")
	public String deleteProduct(@PathVariable("id")int id)
	{
		Product product= productDao.getProductById(id);
		productDao.deleteProduct(product);
		return "redirect:/product-home";
	}
	@GetMapping("/updateproduct/{id}")
	public String updateProduct(@PathVariable("id") int id, Model model)
	{
		Product product= productDao.getProductById(id);
		model.addAttribute("product",product);
		List<Product> products=productDao.getAllProducts();
		model.addAttribute("productlist", products);
		return "product";
	}
}

