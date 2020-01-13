package com.student.create;

public class StudentData {
	private int stdid;
	private String name;
	private int age;
	private String branch;
	public StudentData(int stdid, String name, int age, String branch) {
		super();
		this.stdid = stdid;
		this.name = name;
		this.age = age;
		this.branch = branch;
	}
	public int getStdid() {
		return stdid;
	}
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return stdid + " : " +name + " : "+age+" : "+branch;
	}
}
