package com.xworkz.newone.four;

public class ArrayLarger {

	public static void main(String[] args) {

		int[] array = { 1, 2, 4, 6, 7, 9 };

		int larger = findLargest(array);

		System.out.println(larger);

	}

	public static int findLargest(int [] arr) {
		int max = arr[0];
		 for (int i = 1; i < arr.length; i++) {
			 if (arr[i] > max) {
				 max = arr[i];
			 }
		 }
		
			 
		return max;

	}
}
