package com.xworkz.newfive;

public class Vowel {

	public static void main(String[] args) {

		System.out.println(StringContainVowel("tv"));

	}

	public static boolean StringContainVowel(String ref) {
		return ref.matches(".*[aeiou].*");
	}

}
