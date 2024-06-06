package com.xworkz.newone;

import java.util.Scanner;

public class Validate {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Number");
		String number = scanner.nextLine();
		if (Validate(number)) {
			System.out.println("correct");
		} else {
			System.out.println("No");
		}

	}

	public static boolean Validate(String ref) {
		return ref.length() == 10;
	}

}
