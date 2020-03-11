package com.cts.training.helloservice;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloController {

	@GetMapping(value="/hello")
	public String display() {
		return "Hello";
	}
	
}
