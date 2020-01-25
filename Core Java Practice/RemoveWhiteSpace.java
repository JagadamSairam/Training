package com.intro;

import java.util.Scanner;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	String name;
	System.out.println("Enter Any String");
	 name=s.next();
	 name=name.replaceAll("\\s","");
	 System.out.println(name);
	}

}
