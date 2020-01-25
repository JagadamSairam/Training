package com.array;
import java.util.*;
public class FrequencyCharacter {
public static void main(String[] args) {
	String name;
	char ch;
	int count=0;
	System.out.println("Enter Any String");
	Scanner s=new Scanner(System.in);
	name=s.next();
	System.out.println("Enter Any Character");
	ch=s.next().charAt(0);
	for(int i=0;i<name.length();i++) {
		if(name.charAt(i)==ch) {
			count=count+1;
		}
		//System.out.println(name.charAt(i));
	
	} 
	System.out.println("frequency is "+ ch + " : "+ count);
	
}
}
