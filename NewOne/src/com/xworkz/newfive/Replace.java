package com.xworkz.newfive;

public class Replace {
	
	public static void main(String[] args) {
		
		String name = "kiran mahendrakar";
		String old = "kiran";
		String replace  = "Kishan";
		
	String clean = 	name.replace(old, replace);
	String clean1 = 	clean.replace(" ", "");
	System.out.println(clean);
	System.out.println(clean1);
				
	}

}
