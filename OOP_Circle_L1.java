package com.sun;

public class OOP_Circle_L1 { // Driver

	public static void main(String[] args) {

		// instance of object Circle
		Circle c1 = new Circle();
		System.out.println("The area of circle with radius " + c1.radius + " is " + c1.getArea());
		System.out.println("The parimeter of circle with radius " + c1.radius + " is " + c1.getParimeter());

		Circle c2 = new Circle(10); 
		System.out.println("The area of circle with radius " + c2.radius + " is " + c2.getArea());
		System.out.println("The parimeter of circle with radius " + c2.radius + " is " + c2.getParimeter());

		c1.setRadius(2);
		System.out.println("The area of circle with radius " + c1.radius + " is " + c1.getArea());
		System.out.println("The parimeter of circle with radius " + c1.radius + " is " + c1.getParimeter());

		c2.setRadius(5);
		System.out.println("The area of circle with radius " + c2.radius + " is " + c2.getArea());
		System.out.println("The parimeter of circle with radius " + c2.radius + " is " + c2.getParimeter());

		// for printing current date

		java.util.Date date = new java.util.Date();
		System.out.println(date.toString());
	}

}
