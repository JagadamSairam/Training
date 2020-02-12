package com.cts.training.middle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cts.training.dao.IPODAO;
import com.cts.training.model.IPOEntity;
import com.cts.training.model.Register;

@Controller
public class IpoController {

	@Autowired
	IPODAO ipodao;
	
	
	@GetMapping("/ipo")
	public String userPage(Model model)
	{
		List<IPOEntity> ipos = ipodao.getAllIPOs();
		  model.addAttribute("ipolist", ipos);
		model.addAttribute("ipo", new IPOEntity());
		return "ipo";
	}
	@PostMapping("/ipo/save")
	public String registerIPO(@ModelAttribute("ipo") IPOEntity register) {
		ipodao.addIPO(register);
		//registerDAO.saveUser(register);
		return "redirect:/ipo";
	}
}
