package com.cts.training.initialpublicoffering.initialpublicofferingservice;

import java.util.List;


public interface InitialPublicOfferingService {

	public String addIpo(InitialPublicOfferingEntity ipo);

	public void deleteIpo(int id);

	public InitialPublicOfferingEntity updateIpo(InitialPublicOfferingEntity ipo);

	public List<InitialPublicOfferingEntity> getAllIpos();

	public InitialPublicOfferingEntity getIpoById(int id);
}
