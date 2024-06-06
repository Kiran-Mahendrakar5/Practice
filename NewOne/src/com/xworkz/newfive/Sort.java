package com.xworkz.newfive;

import java.util.Arrays;

public class Sort {
	
	public static void main(String[] args) {
		
		String [] fruit = {"banana","draggen","apple"};
		Arrays.sort(fruit,String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(fruit));
		
		
		int []num = {5,7,8,0,3,1};
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
	}

}
