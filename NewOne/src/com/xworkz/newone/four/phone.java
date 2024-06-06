package com.xworkz.newone.four;

import java.util.Scanner;

public class phone {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number");
	String num = 	scanner.nextLine();
	if(validate(num)) {
		System.out.println("correct");
	}else {
		System.out.println("no");
	}
	}
	public static boolean validate(String num) {
	String clean = 	num.replace(" ", "");
	if (!clean.matches("\\d+")) {
        return false; // Contains non-numeric characters
    }
	return clean.length()==10;
	}

}
