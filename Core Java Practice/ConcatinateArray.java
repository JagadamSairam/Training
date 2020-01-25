package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatinateArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr1[], arr2[], size1, size2, i, j;
		
		System.out.println("Enter Array 1 Size");
		size1 = s.nextInt();
		arr1 = new int[size1];
		System.out.println("Enyter Array 2 Size");
		size2 = s.nextInt();
		arr2 = new int[size2];
		int len=size1+size2;
		int [] arr= new int[len];
		System.out.println("Enter Array 1 Values");
		for (i = 0; i < size1; i++)
			arr1[i] = s.nextInt();
		System.out.println("Enter array 2 Values");
		for (j = 0; j < size2; j++)
			arr2[j] = s.nextInt();
		
		System.arraycopy(arr1, 0, arr, 0, size1-1);
		System.arraycopy(arr2, 0, arr, size1, len);
		
		for(i=0;i<len;i++)
			System.out.println(arr[i]);
	}

}
