package com.cts.training.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="ecommercesupplier")
public class Supplier implements Serializable{

		@Id
		@GeneratedValue
		private int id;
		private String suppliername;
	
		public Supplier() {
			
		}

		public Supplier(int id, String suppliername) {
			super();
			this.id = id;
			this.suppliername = suppliername;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getSuppliername() {
			return suppliername;
		}

		public void setSuppliername(String suppliername) {
			this.suppliername = suppliername;
		}
		
		
}
