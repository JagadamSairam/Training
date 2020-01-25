package com.intro;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		char ch;
		System.out.println("Enter Any Character");
		ch=s.next().charAt(0);
		if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch == 'E' || ch=='I' || ch == 'O' || ch =='U')
			System.out.println("Entered Character is Vowel");
		else
			System.out.println("Entered Character is Consoinant");
	}

}
