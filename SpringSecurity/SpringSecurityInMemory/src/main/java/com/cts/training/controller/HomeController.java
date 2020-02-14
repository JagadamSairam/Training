package com.cts.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String indexPage() {
		return "index";
	}

	@GetMapping("/admin")
	public String adminPage() {
		return "admin";
	}

	@GetMapping("/hr")
	public String hrPage() {
		return "hr";
	}

	@GetMapping("/user")
	public String userPage() {
		return "employee";
	}

}
