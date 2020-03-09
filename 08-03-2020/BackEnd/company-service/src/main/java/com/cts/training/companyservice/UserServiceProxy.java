package com.cts.training.companyservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient("user-service")
public interface UserServiceProxy {
	@GetMapping(value = "/registerUser/{id}")
	public UserEntity findOne(@PathVariable int id);
}
