package com.intro;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int num;
		System.out.println("Enter Any Number");
		num=s.nextInt();
		if(num/2==0)
			System.out.println(num+" is Even Number");
		else
			System.out.println(num+" is Odd Number");
	}

}
