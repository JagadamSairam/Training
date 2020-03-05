package com.cts.training.sector.sectorservice;

import java.util.List;


public interface SectorService {
	public SectorEntity addSector(SectorEntity sector);

	public void deleteSector(int id);

	public SectorEntity updateSector(SectorEntity sector);

	public List<SectorEntity> getAllSectors();

	public SectorEntity getSectorById(int id);
	
}
