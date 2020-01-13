package com.stingexamples;

import java.util.*;

public class StringExamples {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = new StringBuffer("Welcome to Java Training");
		StringBuffer sb2 = new StringBuffer(50);

		System.out.println(sb.capacity());
		
		//sb=sb.append("Sairam     Jagadam                  ");
		//StringBuffer s3;
		//System.out.println(sb.capacity());
		//sb=sb.append("tgcddcgdgc");
		//System.out.println(sb.capacity());
		//System.out.println(sb1.capacity());
		//System.out.println(sb2.capacity());
		//s3=sb1.insert(3, "Thoripakkam");
		//System.out.println(s3);
		System.out.println(sb1.replace(11, 15, "Full Stack"));
		sb2.ensureCapacity(200);
		System.out.println(sb2.capacity());


	}

}
