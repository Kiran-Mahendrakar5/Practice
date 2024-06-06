package com.xworkz.newthree;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number");

		String num = scanner.nextLine();
		if (validate(num)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

	public static boolean validate(String num) {
		return num.length() == 10;

	}

}
