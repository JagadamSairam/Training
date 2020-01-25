package com.array;

import java.util.Scanner;

public class AverageArray {

	public static void main(String[] args) {
		int a[],sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Size of an Array");
		int size=s.nextInt();
		a=new int[size];
		System.out.println("Enter Array Values");
		for(int i=0;i<size;i++)
			a[i]=s.nextInt();
		
		
		for(int j=0;j<size;j++)
			sum+=a[j];
			
		float avg=sum/size;
		
		System.out.println("Average is "+avg);
	}

}
