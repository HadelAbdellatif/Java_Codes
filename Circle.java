package com.sun;

class Circle {

	double radius;

	// constructor with default vale
	Circle() {
		radius = 1.0;
	}

	// constructor without default vale
	Circle(double r) {
		radius = r;
	}

	// Method 1
	double getArea() {
		return Math.PI * radius * radius;
	}

	// Method 2
	double getParimeter() {
		return Math.PI * radius * 2;
	}

	// Method 3
	void setRadius(double rad) {
		radius = rad; // important
	}
}

