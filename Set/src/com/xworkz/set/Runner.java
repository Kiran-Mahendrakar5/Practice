package com.xworkz.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Runner {

	public static void main(String[] args) {

		HashSet<String> hash = new HashSet<String>();
		// unorder ,avoid duplicate
		hash.add("apple");
		hash.add("orange");
		hash.add("grapes");
		hash.add("pineapple");
		hash.add("dragonFruit");
		hash.add("apple");

		for (String frl : hash) {
			System.out.println(frl);
		}
		System.out.println(".......................LinkedHashSet...........................");
		LinkedHashSet<String> link = new LinkedHashSet<String>();
		// order,avoid duplicates
		link.add("ktm");
		link.add("bmw");
		link.add("enfild");
		link.add("gt");
		link.add("pulsar");
		link.add("ktm");

		for (String bike : link) {
			System.out.println(bike);

		}

	}

}
