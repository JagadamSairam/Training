package com.intro;

import java.util.Scanner;

public class Large3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("Enter Any three Numbers");
		num1=s.nextInt();
		num2=s.nextInt();
		num3=s.nextInt();
		if(num1>num2 && num1>num3) {
			System.out.println("The Gresatest Num is "+ num1);
		}
		else if(num2>num1 && num2>num3)
			System.out.println("The Greatest num is "+ num2);
		else
			System.out.println("The Greatest num is "+num3);
	}

}
