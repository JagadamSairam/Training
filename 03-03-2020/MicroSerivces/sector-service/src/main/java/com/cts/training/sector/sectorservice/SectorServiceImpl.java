package com.cts.training.sector.sectorservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SectorServiceImpl implements SectorService{

	@Autowired
	SectorRepository sectorRepository;

	
	@Override
	public SectorEntity addSector(SectorEntity sector) {
		SectorEntity sectorEntity = new SectorEntity();
		BeanUtils.copyProperties(sector, sectorEntity);
		sectorRepository.save(sector);
		return sectorEntity;
	}

	@Override
	public void deleteSector(int id) {
		sectorRepository.deleteById(id);
	}

	@Override
	public SectorEntity updateSector(SectorEntity sector) {
		SectorEntity sectorEntity = new SectorEntity();
		BeanUtils.copyProperties(sector, sectorEntity);
		sectorRepository.save(sectorEntity);
		return sector;
	}

	@Override
	public List<SectorEntity> getAllSectors() {
		List<SectorEntity> entities =sectorRepository.findAll();
//		List<SectorEntity> sectdata = new ArrayList<SectorEntity>();
//		for(SectorEntity entity: entities) {
//			SectorEntity sect = new SectorEntity();
//			BeanUtils.copyProperties(entity, sect);
//			sectdata.add(sect);
//		}
//		System.out.println("Entity: "+entities);
//		System.out.println("DTO: "+sectdata);
		return entities;
	}

	@Override
	public SectorEntity getSectorById(int id) {
		Optional<SectorEntity> sectors = sectorRepository.findById(id);
		SectorEntity sectorEntity = new SectorEntity();
		BeanUtils.copyProperties(sectors.orElse(new SectorEntity()), sectorEntity);
		return sectorEntity;
	}
	

}
