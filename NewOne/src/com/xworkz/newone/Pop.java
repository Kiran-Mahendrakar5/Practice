package com.xworkz.newone;

import java.util.Scanner;

public class Pop {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enterString");
		String word = scanner.nextLine();
		if (isPolidrom(word)) {
			System.out.println("correct");
		} else {
			System.out.println("no");
		}
	}

	public static boolean isPolidrom(String ref) {
		int length = ref.length();
		for (int i = 0; i < length / 2; i++) {
			if (ref.charAt(i) != ref.charAt(length - i - 1)) {
				return false;
			}

		}
		return true;

	}
}
