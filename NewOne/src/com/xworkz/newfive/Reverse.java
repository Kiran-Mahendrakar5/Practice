package com.xworkz.newfive;

public class Reverse {

	public static void main(String[] args) {

		String name = "kiran";
		String news = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			news+=name.charAt(i);

		}
		System.out.println(news);

	}
}
