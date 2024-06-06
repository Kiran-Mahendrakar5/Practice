package com.xworkz.newtwo;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number");
		int counts = scanner.nextInt();
		if (ifAdd(counts)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

	public static boolean ifAdd(int num) {

		return num % 2 == 0;

	}

}
