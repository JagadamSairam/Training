package com.course;

import java.util.*;

class CoursesLearn {
	public static void main(String[] args) {
		String courses[] = { "Java", "c++", "c", "Angular", "python" };
		Scanner s = new Scanner(System.in);
		String choice;
		int len=courses.length;
		int i;
		for(i=0;i<len;i++)
		System.out.print(" \t"+courses[i]);
		System.out.println("\t5000\t3000\t2000\t10000\t20000");
		
		System.out.println("Enter Which course do you learn");
		
		choice=s.nextLine();
		int price=0;
		if(choice.contains("Java"))
		{
			price=price+5000;
		}
		if(choice.contains("c++")) {
			price=price+3000;
		}
		if(choice.contains("c")) {
			price=price+2000;
		}
		if(choice.contains("Angular")) {
			price=price+10000;
		}
		if(choice.contains("python")) {
			price=price+20000;
		}
		
		System.out.println("The Total Price is"+price);
			
		
		

	}
}
