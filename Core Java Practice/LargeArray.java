package com.array;

import java.util.*;

public class LargeArray {
	public static void main(String[] args) {
			int i,j,size,a[];
			System.out.println("Ente Array Size");
			Scanner s=new Scanner(System.in);
			size=s.nextInt();
			a=new int[size];
			System.out.println("Enter Array values");
			for(i=0;i<size;i++)
				a[i]=s.nextInt();
			int max=a[0];
			for(i=0;i<size;i++) {
				if(a[i]>max)
					a[i]=max;
			}
			System.out.println("Maximum value is "+ max);
	}
}
