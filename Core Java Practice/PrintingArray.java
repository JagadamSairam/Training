package com.array;

import java.util.Scanner;

public class PrintingArray {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int size,a[];
		System.out.println("Enter the Size of an Array");
		size=s.nextInt();
		a=new int[size];
		System.out.println("Enter Array Values");
		for(int i=0;i<size;i++)
			a[i]=s.nextInt();
		System.out.println("Array Values Are");
		for(int j=0;j<size;j++)
			System.out.print(a[j]+ "  ");

	}

}
