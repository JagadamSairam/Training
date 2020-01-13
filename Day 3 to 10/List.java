package com.list;

import java.util.Scanner;

public class List {

	public static void main(String[] args) {
		int size, i, num, j;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of ur list");
		size = s.nextInt();
		int[] arr = new int[size];

		for (i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println("ENter the searching element");
		num = s.nextInt();
		for (i = 0; i < size; i++) {
			if (arr[i] == num) {
				//return i;
				break;

			}
		}

	}

}
