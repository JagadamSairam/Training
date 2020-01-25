package com.array;

import java.util.Scanner;

public class CharToString {

	public static void main(String[] args) {
		char c;
		Scanner s=new Scanner(System.in);
		c=s.next().charAt(0);
		String str=Character.toString(c);
		System.out.println("The String is"+str);
		
//		char ch[];
//		int size;
//		System.out.println("Enter Size");
//		size=s.nextInt();
//		for(int i=0;i<size;i++)
//			ch[i]=s.next().charAt(i);
//		
//		String st = String.valueOf(ch);
//        String st2 = new String(ch);
//        
//        System.out.println(st);
//        System.out.println(st2);
	}

}
