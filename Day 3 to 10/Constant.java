package com.finalkeyword;

public class Constant {
	public  final int x;
Constant(){
	 x=30;
}
Constant(int a){
	 x=40;
}
	public static void main(String[] args) {
		//final int x;
		//x=90;
		Constant c=new Constant();
		Constant c1=new Constant(10);

System.out.println(c.x);
System.out.println(c1.x);


	}

}
