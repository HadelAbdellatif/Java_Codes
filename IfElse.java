package com.sun;

public class IfElse {

	public static void main(String[] args) {

		double radius;
		double area;
		
		radius = 20;
		
		area = radius*radius*3.14;
		
		if(area > 20) {
		System.out.println("The area for the circle of radius "+radius+" is "+area+" and grater than 20");
		}
		
		else if(area == 20) {
			System.out.println("The area for the circle of radius "+radius+" is "+area+" and equal 20");
			}
		
		else
		{
			System.out.println("The area for the circle of radius "+radius+" is "+area+" and less than 20");

		}
	}

}
