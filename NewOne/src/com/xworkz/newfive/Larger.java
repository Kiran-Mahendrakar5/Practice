package com.xworkz.newfive;

public class Larger {

	public static void main(String[] args) {

		int[] num = { 2, 4, 7, 9, 11, 56 };

		int larger = FindLarger(num);

		System.out.println(larger);
	}
	public static int FindLarger(int[] ref) {
		int max = ref[0];
		for(int i=1;i<ref.length;i++) {
			if(ref[i]>max) {
				max=ref[i];
			}
		}
		return max;
		
	}
	
}
