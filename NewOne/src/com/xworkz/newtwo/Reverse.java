package com.xworkz.newtwo;

public class Reverse {
	
	public static void main(String[] args) {
		
		String name="kiran";
		String revers = "";
		
		for(int i=name.length()-1;i>=0;i--) {
			revers+=name.charAt(i);
		}
		System.out.println(name);
		System.out.println(revers);
	}

}
