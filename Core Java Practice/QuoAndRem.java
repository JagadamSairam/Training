package com.intro;

import java.util.Scanner;

public class QuoAndRem {

	public static void main(String[] args) {
		int num1,num2;
		float qu,rem;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Any Two Numbers");
		num1=s.nextInt();
		num2=s.nextInt();
		rem=num1%num2;
		qu=num1/num2;
		
		System.out.println("Quotient is "+ qu + " and Remainder is "+ rem);

	}

}
