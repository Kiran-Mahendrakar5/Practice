package com.xworkz.newfive;

import java.util.Scanner;

public class Phone {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Phone Number");
		String number = scanner.nextLine();
		if(validate(number)) {
			System.out.println("Thank U For Providing Correct Number");
		}else {
			System.out.println("Invalid Number");
		}

	}
	public static boolean validate(String num) {
//	String clean = 	num.replace(" ", "");
		if(!num.matches("\\d+")) {
			return false;
		}
		return num.length()==10;
	}

}
