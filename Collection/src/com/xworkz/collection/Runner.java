package com.xworkz.collection;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Elephnat");
		list.add("Tiger");
		list.add("Lion");
		list.add("Giraffe");
		list.add("Fox");
		list.add("Deer");
		list.add("Rabbit");
		list.add("Dog");
		list.add("Horse");
		list.add("Bear");
		list.add("Cow");
		list.add("Sheep");
		list.add("Cat");
		list.add("Donkey");
		list.add("Monkey");
		list.add("Gorilla");
		list.add("Rat");
		list.add("Beaver");
		list.add("Camel");
		list.add("Leopard");
		list.add("Ponda");
		list.add("Wolf");
		System.out.println(list.toString());
		System.out.println(".................Add by Index........................");
		

		list.add(0, "peacock");
		list.add(1, "parrot");
		list.add(2, "Pigeon");
		list.add(3, "Duck");
		list.add(4, "Hen");
		
		System.out.println(list.toString());
		System.out.println("......................Remove by Index.........................");
		
	
		System.out.println(list.toString());
		
		list.remove(0);
		System.out.println(list.toString());
		list.remove(1);
		System.out.println(list.toString());
		list.remove(2);
		System.out.println(list.toString());
		list.remove(3);
		System.out.println(list.toString());
		list.remove(4);
		System.out.println(list.toString());
	

		
		

		System.out.println("......................get.........................");

		list.get(0);
		list.get(1);
		list.get(2);
		list.get(3);
		list.get(4);
		list.get(5);
		list.get(6);
		list.get(7);
		list.get(8);
		list.get(9);

		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println(list.get(5));
		System.out.println(list.get(6));
		System.out.println(list.get(7));
		System.out.println(list.get(8));
		System.out.println(list.get(9));
		System.out.println(list.toString());
		System.out.println("....................set.....................");

		list.set(0, "p");
		list.set(1, "prt");
		list.set(2, "pgn");
		list.set(3, "dck");
		list.set(4, "hn");
		list.set(5, "epnt");
		list.set(6, "tgr");
		list.set(7, "lon");
		list.set(8, "Grf");
		list.set(9, "fx");
		System.out.println(list.set(0, "p"));
		System.out.println(list.set(1, "prt"));
		System.out.println(list.set(2, "pgn"));
		System.out.println(list.set(3, "dck"));
		System.out.println(list.set(4, "hn"));
		System.out.println(list.set(5, "epnt"));
		System.out.println(list.set(6, "tgr"));
		System.out.println(list.set(7, "lon"));
		System.out.println(list.set(8, "Grf"));
		System.out.println(list.set(9, "fx"));
		System.out.println(list.toString());
		
		
		list.indexOf("p");
		System.out.println(list.indexOf("p"));
		list.indexOf("prt");
		System.out.println(list.indexOf("prt"));
		list.indexOf("pgn");
		System.out.println(list.indexOf("pgn"));
		list.indexOf("dck");
		System.out.println(list.indexOf("dck"));
		list.indexOf("hn");
		System.out.println(list.indexOf("hn"));
		

	}

}
