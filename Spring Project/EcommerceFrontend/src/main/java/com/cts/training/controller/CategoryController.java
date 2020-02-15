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

import com.cts.training.dao.CategoryDao;
import com.cts.training.model.Category;

@Controller
public class CategoryController {
	@Autowired
	CategoryDao catDao;
	@GetMapping("/cat-home")
	public String categoryPage(Model model)
	{
		model.addAttribute("cat", new Category());//registe rwill work as a medel attribute in the form
		//Register user=new Register();
		List<Category> categories=catDao.getAllCategories();
		model.addAttribute("catlist", categories);
		return "category";
	}
	@PostMapping("/cat/save")
	//@RequestMapping(value="/user/save",method=RequestMethod.POST)
	public String updateCategory(@ModelAttribute("category") Category category){
		catDao.saveOrUpdateCategory(category);
		return "redirect:/cat-home";
	}
	@GetMapping("/removecat/{id}")
	public String deleteCategory(@PathVariable("id")int id)
	{
		Category category= catDao.getCategoryById(id);
		catDao.deleteCategory(category);
		return "redirect:/cat-home";
	}
	@GetMapping("/updatecat/{id}")
	public String updateCategory(@PathVariable("id") int id, Model model)
	{
		Category category= catDao.getCategoryById(id);
		model.addAttribute("category",category);
		List<Category> cats=catDao.getAllCategories();
		model.addAttribute("catlist", cats);
		return "category";
	}
	
}
