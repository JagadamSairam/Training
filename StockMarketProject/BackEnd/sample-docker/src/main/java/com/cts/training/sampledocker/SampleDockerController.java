package com.cts.training.sampledocker;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleDockerController {

	@GetMapping(value="/names")
public List<String> getAllNames(){
	return new ArrayList<String>(Arrays.asList("Sairam","Sindhu","Tanu"));
}
		
	}

