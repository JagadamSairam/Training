package com.cts.training.initialpublicoffering.initialpublicofferingservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class InitialPublicOfferingServiceImplementation implements InitialPublicOfferingService {

	@Autowired
	InitialPublicOfferingEntity ipoEntity;
	@Autowired
	InitialPublicOfferingRepository ipoReository;
	
	@Override
	public String addIpo(InitialPublicOfferingEntity ipo) {
		InitialPublicOfferingEntity ipos = new InitialPublicOfferingEntity();
		String name;
		name = ipo.getCompanyName();
		if (ipoReository.findByCompanyName(name) != null) {
			return "{\"res\":\"0\"}";
		} else {
			BeanUtils.copyProperties(ipos, ipo);
			ipoReository.save(ipos);
			return "{\"res\":\"1\"}";

		}
	}

	@Override
	public void deleteIpo(int id) {
		ipoReository.deleteById(id);
		
	}

	@Override
	public InitialPublicOfferingEntity updateIpo(InitialPublicOfferingEntity ipo) {
		InitialPublicOfferingEntity ipoEn= new InitialPublicOfferingEntity();
		BeanUtils.copyProperties(ipo,ipoEn);
		ipoReository.save(ipoEn);
		return ipo;
	}

	@Override
	public List<InitialPublicOfferingEntity> getAllIpos() {
		List<InitialPublicOfferingEntity> ipos= ipoReository.findAll();
		
		return ipos;	
	}

	@Override
	public InitialPublicOfferingEntity getIpoById(int id) {
		Optional<InitialPublicOfferingEntity> ipos = ipoReository.findById(id);
		InitialPublicOfferingEntity ipoEntity = new InitialPublicOfferingEntity();
		BeanUtils.copyProperties(ipos.orElse(new InitialPublicOfferingEntity()), ipoEntity);
		return ipoEntity;
	}

}
