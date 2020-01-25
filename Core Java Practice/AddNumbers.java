package com.intro;

import java.util.Scanner;

public class AddNumbers {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	int num1,num2,res;
	System.out.println("Enter Two numbers");
	num1=s.nextInt();
	num2=s.nextInt();
	res=num1+num2;
	System.out.println("The Result is "+res);
}
}
