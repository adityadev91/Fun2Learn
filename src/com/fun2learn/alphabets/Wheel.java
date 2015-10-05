package com.fun2learn.alphabets;

import java.awt.*;
import java.awt.geom.*;

public class Wheel {
  /**
 * @uml.property  name="x"
 */
float x;
/**
 * @uml.property  name="y"
 */
float y;
/**
 * @uml.property  name="width"
 */
float width;
/**
 * @uml.property  name="height"
 */
float height;
/**
 * @uml.property  name="angle"
 */
float angle;
/**
 * @uml.property  name="thickness"
 */
float thickness;

  public Wheel(float x1, float y1, float diameter, int thick) {	
    x = x1;
    y = y1;
    height = diameter;
    width = diameter;
    angle = 0;
    thickness = thick;	
  }
//creates circular shape with two spokes representing a wheel
  protected Shape createShape(Graphics2D g2) {
    GeneralPath path = new GeneralPath();
    g2.setPaint(Color.black);
    Stroke s = new BasicStroke(thickness);
    g2.setStroke(s);
    Ellipse2D e1 = new Ellipse2D.Float(x, y, height, width);
    g2.draw(e1);
    path.append(e1, false);
    g2.setPaint(Color.white);
    g2.fill(e1);
    g2.setPaint(Color.black);
    Line2D l1 = new Line2D.Float(x, y+width/2, x+width, y+width/2);
    path.append(l1, false);
    Line2D l2 = new Line2D.Float(x+width/2, y, x+width/2, y+ width);
    path.append(l2,false);
    return path;
  }	

  public void drawShape(Graphics2D g2) {
    AffineTransform t = g2.getTransform();
    Shape shape = createShape(g2);
    // rotate the shape by the specified angle around its center.
    g2.rotate(angle, x + width/2, y + height/2);
    g2.draw(shape);
    g2.setTransform(t);
  }

  public void step(float displacement) {
    x = x + displacement;
    angle += displacement/width;
  }
}
