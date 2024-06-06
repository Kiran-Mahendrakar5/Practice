package com.xworkz.newtwo;

import java.util.Scanner;

public class ReadNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = scanner.nextInt();
		for(int i=1;i<=num;i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}

	}

}
