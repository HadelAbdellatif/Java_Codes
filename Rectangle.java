package com.sun;

public class Rectangle extends Shapes{

	private double width;
	private double height;
	
	public Rectangle() {
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(double width, double height, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea(){
		return 0.5*width*height;
	}
	
	public double getPerimeter() {
		return 2*(width+height);
	}
	
	public void printRectangle() {
		System.out.println("Rectangle with height : "+getHeight()+" , width : "+getWidth()+" , color : "+super.getColor()+" , filled : "+super.isFilled()+" , Date : "+getDateCreated()+" , getArea : "+getArea()+" , getPerimeter : "+getPerimeter());
	}
	
	
}
