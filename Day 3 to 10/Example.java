/*Consider the string str="Global Warming"
    Write statements in Java to implement the following
    a) To display the last four characters.
    b) To display the substring starting from index 4 and ending at index 8.
    c) To check whether string has alphanumeric characters or not.
    d) To trim the last four characters from the string.
    e) To trim the first four characters from the string.
    f) To display the starting index for the substring "Wa".
    g) To change the case of the given string.
    h) To check if the string is in title case.
    i) To replace all the occurrences of letter "a" in the string with "*"*/

package com.examples;

public class Example {

	public static void main(String[] args) {
		String str="Global Warming";
		int i,len=str.length();
		StringBuffer sb=new StringBuffer(str);
		StringBuffer sb1=new StringBuffer(str);

		System.out.println("The first four characters are  \t "+str.substring(0,4));
		System.out.println("The sub string is :\t"+str.substring(4,8));
		System.out.println("Alpha Numeric is "+ str.matches("[a-zA-Z0-9]"));
		System.out.println("\nAfter triming last four charactes\t"+sb1.delete(len-4,len));
		System.out.println("after trimming first forur is \t"+sb.delete(0,4));
		String secnd=sb1.split();
		char array[]=str.toCharArray();
		char array2[]=secnd.toCharArray();
		if((array[0]>=65) && (array[0]<=90)) {
			if((array2[0]>=65)&& (array2[0]<=90)) {
				System.out.println("It was in title Case");
			}
		}
		else
			System.out.println("It was Not in title case");
				//		int len2=array.length;
//		for(i=0;i<len2;i++)
		System.out.println("The Strarting Index of wa is \t" + str.indexOf("Wa"));
		System.out.println("Case changing \t "+str.toUpperCase());
		System.out.println("\t\t"+str.toLowerCase());
		
		System.out.println("Replacing after  "+str.replace("a", "*"));
	

	}

}

/*
 * float f=100f; float a=(float)1_11.00; float c=100; double d=100; float e=d;
 * int i=90; float g=(float)i;
 */


