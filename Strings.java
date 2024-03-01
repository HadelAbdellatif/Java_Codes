package com.sun;

public class Strings {

	public static void main(String[] args) {
		
		String s1 = "Welcome to Java";
		String s2 = new String("Welcome to Java");
		String s3 = "Welcome to Java";
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("s1 == s2 is ");
		stringBuilder.append((s1 == s2));
		System.out.println(stringBuilder.toString());
		System.out.println("s1 == s3 is " + (s1 == s3));

	}

}
