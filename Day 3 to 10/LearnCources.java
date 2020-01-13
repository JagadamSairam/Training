package com.learn.course;

import java.util.*;

public class LearnCources {

	public static void main(String[] args) {
		String courses[] = { "Java", "c++", "c", "Angular", "python" };
		StringBuffer sb=new StringBuffer();
		Scanner s = new Scanner(System.in);
		String choice;
		int len = courses.length;
		int i;
		for (i = 0; i < len; i++)
			System.out.print(courses[i]+"\t");
		System.out.println("\n5000\t3000\t2000\t10000\t20000");

		System.out.println("Enter Which course do you learn");

		choice = s.nextLine();
		int price = 0;
		
		if (choice.contains("Java")) {
		sb.append("java----5000");
			price = price + 5000;
		}
		
		if (choice.contains("c")) {
			sb.append("java----5000");

			price = price + 3000;
		}
		
		
		if (choice.contains("c++")) {
			sb.append("java----5000");

			price = price + 2000;
		}
		
		
		if (choice.contains("Angular")) {
			sb.append("java----5000");

			price = price + 10000;
		}
		
		
		if (choice.contains("python")) {
			sb.append("java----5000");

			price = price + 20000;
		}

		//System.out.print(choice);
		System.out.println("The Total Price of "+choice +" is" + price);

	}
}
