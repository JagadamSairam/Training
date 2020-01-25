package com.intro;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		int num1,num2,temp;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		num1=s.nextInt();
		num2=s.nextInt();
		int a,b;
		
		a=num1;
		b=num2;
		System.out.println("Before Swapping \n"+" a = "+ a + " b = "+b);
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("After Swapping \n"+" a = "+ a + " b = "+b);
	}

}
