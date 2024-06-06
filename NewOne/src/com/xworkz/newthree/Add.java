package com.xworkz.newthree;

import java.util.Scanner;

public class Add {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number");
	int num = 	scanner.nextInt();
	if(ifAdd(num)) {
		System.out.println("yes");
	}else {
		System.out.println("no");
	}
	}
	public static boolean ifAdd(int ref) {
		
		return ref%2==0;
		
	}

}
