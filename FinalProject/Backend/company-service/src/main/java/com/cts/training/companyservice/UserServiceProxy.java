package com.cts.training.companyservice;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient("stock-price-service")
public interface UserServiceProxy {
	@GetMapping(value = "/stockPrice")
	public List<StockPriceEntity> findAll();
}
