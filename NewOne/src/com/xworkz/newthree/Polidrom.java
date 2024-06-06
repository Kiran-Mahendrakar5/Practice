package com.xworkz.newthree;

import java.util.Scanner;

public class Polidrom {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Word");
		
	String name = 	scanner.nextLine();
	if(polidrom(name)) {
		System.out.println("yes");
	}else {
		System.out.println("no");
	}
	}
	public static boolean polidrom(String name) {
	int lengths = 	name.length();
	for(int i=1;i<lengths/2;i++) {
		if(name.charAt(i)!=name.charAt(lengths-1-i)) {
			return false;
		}
	}
	return true;
	
	}

}
