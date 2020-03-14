package com.cts.training.sector.sectorservice;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


//@FeignClient(name="",url="")//This will able to run only on that port for a single one
//@FeignClient("user-service")
@FeignClient("netflix-zuul-api-gateway-server")

public interface UserServiceProxy {

	
	
//If You Want to use DTO Classes 
	
	
//	@GetMapping(value = "/registerUser")
//	public List<UserEntity> getAllUsers();
	
	
	
	@GetMapping(value = "/user-service/registerUser")
	public ResponseEntity<?> getAllUsers();
	
	
	
	
	
}
