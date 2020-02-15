package com.cts.training.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.training.dao.ProductDao;
import com.cts.training.model.Product;



@Controller
public class HomeController {
	@Autowired
	private ProductDao productDao;
//	@Autowired
//	private CompanyDao companyDAO;
//	@Autowired
//	private StockExchangeDao stockexchangeDAO;
	
	@RequestMapping("/")
	public String indexPage(Model model) {
		model.addAttribute("product", new Product());//registe rwill work as a medel attribute in the form
		//Register user=new Register();
		List<Product> products=productDao.getAllProducts();
		model.addAttribute("productlist", products);
		return "index";
	
	}
	@RequestMapping("/admin-home")
	public String adminpage()
	{
		return "admin";
	}

	@RequestMapping("/user")
	public String Page(Model model) {
		model.addAttribute("product", new Product());//registe rwill work as a medel attribute in the form
		//Register user=new Register();
		List<Product> products=productDao.getAllProducts();
		model.addAttribute("productlist", products);
		return "index";
	
	}
	


}
