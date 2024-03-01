package com.sun;

public class Circle2 extends Shapes {

	private double radius;

	public Circle2() {
	}

	public Circle2(double radius) {
		this.radius = radius;
	}

	public Circle2(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return 3.14 * radius * radius;
	}

	public double getPerimeter() {
		return 3.14 * radius * 2;
	}

	public double getDiameter() {
		return radius * 2;
	}

	public void printCircle() {
		System.out.println("Circle with radius : "+getRadius()+" , color : "+super.getColor()+" , filled : "+super.isFilled()+" , Date : "+getDateCreated()+" , getArea : "+getArea()+" , getPerimeter : "+getPerimeter()+" , getDiameter : "+getDiameter());
	}

}
