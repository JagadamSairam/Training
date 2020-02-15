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

import com.cts.training.dao.SupplierDao;
import com.cts.training.model.Supplier;

@Controller
public class SupplierController {
	@Autowired
	SupplierDao supplierDao;
	@GetMapping("/supplier-home")
	public String supplierPage(Model model)
	{
		model.addAttribute("supplier", new Supplier());//registe rwill work as a medel attribute in the form
		//Register user=new Register();
		List<Supplier> suppliers=supplierDao.getAllSuppliers();
		model.addAttribute("supplierlist", suppliers);
		return "supplier";
	}
	@PostMapping("/supplier/save")
	//@RequestMapping(value="/user/save",method=RequestMethod.POST)
	public String updateSupplier(@ModelAttribute("supplier") Supplier supplier){
		supplierDao.saveOrUpdateSupplier(supplier);
		return "redirect:/supplier-home";
	}
	@GetMapping("/removesupplier/{id}")
	public String deleteSupplier(@PathVariable("id")int id)
	{
		Supplier supplier= supplierDao.getSupplierById(id);
		supplierDao.deleteSupplier(supplier);
		return "redirect:/supplier-home";
	}
	@GetMapping("/updatesupplier/{id}")
	public String updateSupplier(@PathVariable("id") int id, Model model)
	{
		Supplier supplier= supplierDao.getSupplierById(id);
		model.addAttribute("supplier",supplier);
		List<Supplier> suppliers=supplierDao.getAllSuppliers();
		model.addAttribute("supplierlist", suppliers);
		return "supplier";
	}
}