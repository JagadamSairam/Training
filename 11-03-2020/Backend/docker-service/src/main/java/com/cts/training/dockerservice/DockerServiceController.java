package com.cts.training.dockerservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerServiceController {

	@GetMapping(value="/hello")
	public String sayHello() {
		return "Good Morning";
		
	}
	
	@GetMapping(value="/languages")
	public List<String> languages(){
		return new ArrayList<String>(Arrays.asList("java","Python","C Prpogramming","Ruby","TypeScript"));
	}
}
