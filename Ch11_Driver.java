package com.sun;

public class Ch11_Driver {

	public static void main(String[] args) {

      Circle2 c = new Circle2();
      c.setRadius(5);
      c.setColor("Red");
      c.setFilled(true);
      c.printCircle();
      
      Rectangle r = new Rectangle();
      r.setWidth(10);
      r.setHeight(2);
      r.setColor("Blue");
      r.setFilled(false);
      r.printRectangle();
     
      
	}

}
