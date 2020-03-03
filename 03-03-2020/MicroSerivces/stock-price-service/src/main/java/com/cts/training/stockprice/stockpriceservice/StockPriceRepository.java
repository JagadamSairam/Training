package com.cts.training.stockprice.stockpriceservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StockPriceRepository extends JpaRepository<StockPriceEntity, Integer>{

}
