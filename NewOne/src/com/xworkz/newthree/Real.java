package com.xworkz.newthree;

import java.util.Scanner;

public class Real {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number");
		int ref = scanner.nextInt();
		for(int i=1;i<ref;i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
	}

}
