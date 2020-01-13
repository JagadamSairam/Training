package com.collections.example;

import java.util.PriorityQueue;

public class CollectionsExample {

	public static void main(String[] args) {
		PriorityQueue<Integer> p=new PriorityQueue<Integer>();
		p.add(20);
		p.add(30);
		p.add(80);
		p.add(98);
		p.add(100);
		
		for(Object s: p) {
			System.out.println(s);
			
		}
		System.out.println("Peek method"+p.peek());
		

		for(Object s: p) {
			System.out.println(s);
			
		}
		
		System.out.println("Poll calling"+p.poll());
		

		for(Object s: p) {
			System.out.println(s);
			
		}
	
		System.out.println("Calling element method"+p.element());

		for(Object s: p) {
			System.out.println(s);
					}
	System.out.println("Remove method calling"+p.remove());

		for(Object s: p) {
			System.out.println(s);
			
		}
	}

}
