package com.cts.training.stockprice.stockpriceservice;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StockPriceRepository extends JpaRepository<StockPriceEntity, Integer>{
@Query("From StockPriceEntity where companyCode= ?1 and stockExchange = ?2 and date = ?3 and time = ?4")
public Optional<StockPriceEntity> getIfAlreadyExists(String companyCode, String stockExchange,LocalDate date,LocalTime time);
}
