package com.array;

import java.util.Scanner;

public class SearchArray {

	public static void main(String[] args) {
		int num,size,arr[],i;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter The Size of an Array");
		size=s.nextInt();
		arr=new int[size];
		System.out.println("Enter Array values");
		for(i=0;i<size;i++)
			arr[i]=s.nextInt();
		System.out.println("Enter Searching Element");
		num=s.nextInt();
		
		for(i=0;i<size;i++) {
			if(arr[i]==num) {
				System.out.println("Element  "+ arr[i]+ " was found and Its Posoition is "+ i);
				break;
			}
			else
				System.out.println("Element was not found");
			
		}
	
			
	
	}

}
