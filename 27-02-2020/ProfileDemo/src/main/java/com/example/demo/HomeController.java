package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
@Value("${welcome.msg}")
private String message;
@GetMapping("/")
public String message() {
	return message;
}
}
