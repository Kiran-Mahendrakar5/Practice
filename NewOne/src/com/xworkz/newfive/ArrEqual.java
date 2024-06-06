package com.xworkz.newfive;

import java.util.Arrays;

public class ArrEqual {

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 5 };
		int[] num1 = { 1, 2, 3, 4, 5 };

		boolean isEqual = Arrays.equals(num, num1);
		System.out.println(isEqual);
	}

}
