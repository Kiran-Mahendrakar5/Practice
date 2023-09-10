package com.xworkz.linkedlist;

import java.util.LinkedList;

public class Runner {
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("peacock");
		list.add("parrot");
		list.add("pigeon");
		list.add("bulbull");
		list.add("Eagle");
		list.add("Kingfisher");
		System.out.println(list.toString());
		for(String stg: list) {
			System.out.println(stg);
		}
		System.out.println("................Add.......................");
		
		list.add(3, "peck");
		System.out.println(list.toString());
		System.out.println("................peekfirst.......................");
		
		
		//peekFirst
		list.peekFirst();
		System.out.println(list.peekFirst());
		System.out.println("................peeklast.......................");
		
		//peekLast
		list.peekLast();
		System.out.println(list.peekLast());
		System.out.println("...................poll.......................");
		
		//poll
		list.poll();
		System.out.println(list.poll());
		System.out.println("....................pollFirst...................");
		
		//pollFirst
		list.pollFirst();
		System.out.println(list.pollFirst());
		System.out.println("................polllast..............");
		
		//pollLast()
		list.pollLast();
		System.out.println(list.pollLast());
		System.out.println("..........................pop................");
		
		//	pop=deleting first index
		list.poll();
		System.out.println(list.poll());
		System.out.println("......................	offerFirst.................");
		
		
		//	offerFirst
		list.offerFirst("Duck");
		System.out.println(list.offerFirst("Duck"));
		System.out.println(".............................new..............");
		for(String stg: list) {
			System.out.println(stg);
		}
		
		//	offer=adding
		list.offer("Hen");
		System.out.println(list.offer("Hen"));
	}

}
