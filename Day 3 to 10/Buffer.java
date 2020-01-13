package com.buffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		int a;
		System.out.println("Enter a value");
		a=Integer.parseInt(br.readLine());
		System.out.println("Enter Any String ");
		String msg = br.readLine();
		System.out.println(msg + " : "+ a);
	}

}
