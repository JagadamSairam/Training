package com.inheritence;

import java.util.Scanner;

public class FirstInheritence {

	public static void main(String[] args) {
		Developer emp = new Developer();
		Manager m = new Manager();
		emp.getData();

		emp.getProjectDetails();
		m.getManager();

		emp.display();
		System.out.println(emp.projectName + ":" + emp.duration + ":" + emp.domain);
		m.print();
		

	}

}

class Employee {
	String name;
	int id;
	String company;

	public void getData() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Employee Id");
		id = Integer.parseInt(s.nextLine());
		System.out.println("Enter Employee Name");
		name = s.nextLine();
		System.out.println("Enter Company name");
		company = s.nextLine();

	}

	public void display() {
		System.out.println(id + ":" + name + ":" + company);

	}
}

class Manager extends Employee {
	String[] team;
	String department;
	int size;

	void getManager() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many members are there in a team");
		size = Integer.parseInt(sc.nextLine());
		team = new String[size];
		System.out.println("Enter the team members names");
		for (int i = 0; i < size; i++)
			team[i] = sc.nextLine();

		System.out.println("Enter Department Name");
		department = sc.nextLine();
	}
	
	void print() {
		for(int i=0;i<size;i++) {
			System.out.print("  :  ");
		System.out.print(team[i]);
		}
		
		System.out.println(":"+department);
	}
}

class Developer extends Employee {
	String projectName;
	String duration;
	String domain;

	public void getProjectDetails() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Project Name");
		projectName = s.nextLine();
		System.out.println("Enter Project Duration");
		duration = s.nextLine();
		System.out.println("Enter project domain");
		domain = s.nextLine();
	}
}