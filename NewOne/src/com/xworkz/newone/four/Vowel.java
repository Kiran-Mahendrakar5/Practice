package com.xworkz.newone.four;

public class Vowel {
	
	public static void main(String[] args) {
		
		System.out.println(StringContain("tv"));
		
		
	}
	public static boolean StringContain(String ref) {
		return ref.matches(".*[aeiou].*");
	}

}
