package com.fun2learn.alphabets.rhymes;

import java.awt.*;

public abstract class Vehicle {	
  /**
 * @uml.property  name="x"
 */
protected float x = 30; // vehicle's position
/**
 * @uml.property  name="y"
 */
protected float y = 300;

  // constructor updates x and y to specific values
  public Vehicle() {	
    this(0, 0);
  }

  // constructor updates x and y to values passed in as arguments
  public Vehicle(float xValue, float yValue) {	
    x = xValue;
    y = yValue;
  }	

  // method to draw shape of Vehicle
    public abstract void drawShape(Graphics2D myGraphics);	

  // change the (x, y) position by a small amount
	protected abstract void step();
	
}
