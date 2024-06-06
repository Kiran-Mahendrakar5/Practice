package com.xworkz.newone;

import java.util.Scanner;

public class Polidrom {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Word");
		String word = scanner.nextLine();
		if(validate(word)) {
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
	public static boolean validate(String word) {
	String clean =	word.replaceAll("\\s", " ").toLowerCase();
	int length = 	clean.length();
	for(int i=0;i<length/2;i++) {
		if(clean.charAt(i)!=clean.charAt(length-i-1)) {
			return false;
		}
	}
	return true;
	
	}

}
