package com.xworkz.newthree;

public class VowelC {
	
	public static void main(String[] args) {
		
		System.out.println(Stringcontainvowel("Hello"));
		System.out.println(Stringcontainvowels("tv"));
	}
	public static  boolean Stringcontainvowel(String ref) {
		return ref.matches(".*[aeiou].*");
		
	}
	public static  boolean Stringcontainvowels(String ref1) {
		return ref1.matches(".*[bcdefghjlmnpqlqwxyz].*");
		
	}

}
