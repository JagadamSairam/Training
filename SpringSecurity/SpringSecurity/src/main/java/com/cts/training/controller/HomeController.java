package com.cts.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String IndexPage() {
		return "index";
	}
	
	@GetMapping("/admin")
	public String adminPage() {
		return "admin";
	}
	@GetMapping("/user")
	public String userPage() {
		return "user";
	}
	@GetMapping("/hr")
	public String hrPage() {
		return "hr";
	}
}
