package com.intro;

import java.util.Scanner;

public class AnsciiValue {

	public static void main(String[] args) {
		char ch;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Any Character");
		ch=s.next().charAt(0);
		System.out.println("The Ascii value is "+ (int)ch);

	}

}
