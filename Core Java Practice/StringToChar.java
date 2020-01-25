package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class StringToChar {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String name;
		System.out.println("Enter Any String");
		name=s.next();
		char []ch=name.toCharArray();
		int len = name.length();
		for(int i=0;i<len;i++)
			System.out.println(ch[i]);
			//System.out.println(Arrays.toString(ch));
	}

}
