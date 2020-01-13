package com.learn.course;

import java.util.*;

class LearnCources{

	public static void main(String[] args) {
		String courses[] = { "Java", "c++", "c", "Angular", "python" };
		StringBuffer sb=new StringBuffer();
		Scanner s = new Scanner(System.in);
		String choice[];
		int len = courses.length;
		int i,num;
		for (i = 0; i < len; i++)
		System.out.print(" \t" + courses[i]);
		System.out.println("\t5000\t3000\t2000\t10000\t20000");
		System.out.println("How Many Courses do u want");
		num=Integer.parseInt(s.nextLine());
		choice=new String[num];
		System.out.println("Enter Which courses do you learn");
		for(i=0;i<num;i++)
		choice[i] = s.nextLine();

		int price = 0;
		for(i=0;i<num;i++){
		if (choice[i].equals("Java")) {
			price = price + 5000;
		}
		}
		for(i=0;i<num;i++){
		
		if (choice[i].contains("c")) {
			price = price + 3000;
		}
		}

		for(i=0;i<num;i++){
		if (choice[i].equals("c++")) {
			price = price + 2000;
		}
		}
		for(i=0;i<num;i++){
		
		if (choice[i].equals("Angular")) {
			price = price + 10000;
		}
		}
		
		for(i=0;i<num;i++){
		
		if (choice[i].equals("python")) {
			price = price + 20000;
		}
		}

		//System.out.print(choice);
		System.out.println("The Total Price of  is" + price);

	}
}
