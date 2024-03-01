package com.sun;

public class StringTestCode {

	public static void main(String[] args) {
		String myStr1 = "Hello";
		String myStr2 = "Hello";
		System.out.println(myStr1.compareTo(myStr2)); // Returns 0 because they are equal
		
		System.out.println("Welcomeloleoloe".replace("el", "AB"));
		System.out.println("Welcomeloleoloe".replaceAll("el", "AB"));

	}

}
