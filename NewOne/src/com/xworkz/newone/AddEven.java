package com.xworkz.newone;

import java.util.Scanner;

public class AddEven {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enterString");
		int word = scanner.nextInt();
		
		if(isEven(word)) {
			System.out.println("correct");
		}else {
			System.out.println("no");
		}
		
	}
	public static boolean isEven(int number) {
		return number % 2==0;
	}

}
