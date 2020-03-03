package com.cts.training.initialpublicoffering.initialpublicofferingservice;

import org.springframework.data.jpa.repository.JpaRepository;


public interface InitialPublicOfferingRepository extends JpaRepository<InitialPublicOfferingEntity, Integer>{
	public InitialPublicOfferingEntity findByCompanyName(String name);

}
