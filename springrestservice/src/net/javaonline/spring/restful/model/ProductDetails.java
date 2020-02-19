package net.javaonline.spring.restful.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "products")
public class ProductDetails {	
	String itemcode="";
	String description="";
	
	public ProductDetails() {
	}
	public ProductDetails(String itemcode,String description)	{
			this.itemcode=itemcode;	
			this.description=description;			
		}
	
	public String getItemcode() {
		return itemcode;
	}
	public void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
