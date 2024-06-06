package com.xworkz.newone;

import java.util.Scanner;

public class Leng {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enterString");
		String word = scanner.nextLine();
		int length = word.length();
		System.out.println(length);
	}

}
