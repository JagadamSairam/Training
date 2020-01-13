package com.constructor;

public class Constructors{
	public static final int x=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//First f = new First();
		//Second s=new Second();

System.out.println(x);
	}

}

class First{
	First() {
		super();
		System.out.println("1");
	}

	First(int a) {
		this();
		System.out.println("2");
	}

	{
		System.out.println("3");
	}
}

class Second extends First {
	Second() {
		super(10);
		System.out.println("4");
	}

	{
		System.out.println("5");
	}
}
