package com.inner.outer;

//import java.util.*;
//import java.util.Scanner;

class InnerOuterClass {
	public void display() throws NullPointerException{
		String names="Sairam";
		names=null;
		//int  len=names.length();
		//System.out.println("The String has"+names.length());
		if(names.equals(null))
		throw new NullPointerException();
	}
	public void display1()  
	{
		String names1="Sairamgfds";
		//int  len=names.length();
		names1=null;
		System.out.println("The String has"+names1.length());
	}
	public static void main(String[] args)
	{
	//Scanner scanner=new Scanner(System.in);
	
	try {
	System.out.println("Begin the execution");
	int num=Integer.parseInt(args[0]);
	System.out.println("You enter the num is "+num);
	int b=10/(5-num);
	
	}
	catch(Exception e) {
		System.out.println("There was aproblem please check it once ");
		System.out.println(e.getMessage());
		System.out.println((e));
	}
	InnerOuterClass e=new InnerOuterClass();
	e.display();
	//e.display1();
	}

}
