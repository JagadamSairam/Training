package com.map;
import java.util.*;
public class Employee implements Comparator<Employee>{
private int id;
private String name;
private String address;
private long phone;
private float sal;
public Employee(int id, String name, String address, long phone, float d) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	this.phone = phone;
	this.sal = d;
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public float getSal() {
	return sal;
}
public void setSal(float sal) {
	this.sal = sal;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", sal=" + sal + "]";
}
@Override
public int compare(Employee o1, Employee o2) {
	// TODO Auto-generated method stub
	return 0;
}

}




class SortById implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
	if(o1.getId()>o2.getId()) {
		return 1;
	}
	else if(o1.getId()==o2.getId()) {
		return 0;
	}
	else return 0;
	}
	
}
