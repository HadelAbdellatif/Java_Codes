package com.sun;

import java.util.Date;

public class Shapes {

	private String color;
	private boolean filled;
	private Date dateCreated;
	
	public Shapes() {
		dateCreated = new Date();
	}

	public Shapes(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
		dateCreated = new Date();

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Override
	public String toString() {
		return "Shape: color = " + color + ", filled = " + filled + ", dateCreated = " + dateCreated;
	}
	
	
}
