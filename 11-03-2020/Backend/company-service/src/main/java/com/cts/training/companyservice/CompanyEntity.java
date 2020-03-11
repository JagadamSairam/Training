package com.cts.training.companyservice;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="company")
public class CompanyEntity {

	@Id
	private int id;
	private String name;
	private String sector;
	private String ceoName;
	private String bod;
	private double turnOver;
	
	public CompanyEntity() {
	}

	public CompanyEntity(int id, String name, String sector, String ceoName,String bod, double turnOver) {
		super();
		this.id = id;
		this.name = name;
		this.sector = sector;
		this.ceoName = ceoName;
		this.bod=bod;
		this.turnOver = turnOver;
	}

	public String getBod() {
		return bod;
	}

	public void setBod(String bod) {
		this.bod = bod;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getCeoName() {
		return ceoName;
	}

	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}

	public double getTurnOver() {
		return turnOver;
	}

	public void setTurnOver(double turnOver) {
		this.turnOver = turnOver;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", sector=" + sector + ", ceoName=" + ceoName + ", turnOver="
				+ turnOver + "]";
	}
	
	

}


