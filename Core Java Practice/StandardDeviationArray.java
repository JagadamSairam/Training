package com.array;
import java.util.*;
public class StandardDeviationArray {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int size,a[];
		System.out.println("Enter Array Size");
		size=s.nextInt();
		a=new int[size];
		System.out.println("Enter Array  values");
		for(int i=0;i<size;i++)
			a[i]=s.nextInt();
			
		double mean,sd,sum=0.0,res=0.0;
			for(int j=0;j<size;j++)
				sum+=a[j];
			
			mean=sum/size;
			sd=0.0;
			for(int k=0;k<size;k++) {
//				sd+=Math.pow((a[k]-mean), 2);
				
				double sq=0.0;
			sq=(a[k]-mean)*(a[k]-mean);
			sd+=sq;
			
			}
		
			
			res=sd/size;
		System.out.println("StandardDeviation is "+ Math.sqrt(res));
		
	}

}
