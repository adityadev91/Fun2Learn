package com.fun2learn.alphabets;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import com.fun2learn.alphabets.rhymes.TrainController;
import com.fun2learn.alphabets.rhymes.TrainView;
import com.fun2learn.alphabets.rhymes.Vehicle;

public class Train extends Vehicle  {

	/**
	 * @uml.property  name="wheel1"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private Wheel wheel1;
	/**
	 * @uml.property  name="wheel2"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private Wheel wheel2;
	/**
	 * @uml.property  name="wheel3"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private Wheel wheel3;
	/**
	 * @uml.property  name="wheel4"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private Wheel wheel4;
	/**
	 * @uml.property  name="wheel5"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private Wheel wheel5;
	/**
	 * @uml.property  name="wheel6"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private Wheel wheel6;


	  // constructor updates x and y to specific values
	  public Train() {	
	    super(30, 300);
	    wheel1 = new Wheel(x+37.5f, y+63, 50, 5);
	    wheel2 = new Wheel(x+167.5f, y+63, 50, 5);
	    
	    
	    wheel3 = new Wheel(x+300+37.5f, y+63, 50, 5);
	    wheel4 = new Wheel(x+300+167.5f, y+63, 50, 5);
	    

	    wheel5 = new Wheel(x+600+37.5f, y+63, 50, 5);
	    wheel6 = new Wheel(x+600+167.5f, y+63, 50, 5);
	    
	 
	  }

	@Override
	public void drawShape(Graphics2D myGraphics) {
		int w1 = 250, h1 = 90, w2 = 143, h2 = 75, w4 = 50, h4 = 45, w5 = 35;
	    float e1 = 62.5f, e2 = 22.5f, e3 = 125, e4 = 45, w3 = 16.67f, h3 = 30;
	    // draw the lower body
	    RoundRectangle2D.Float cabin1= new RoundRectangle2D.Float(x+300, y, w1, h1, e1, e2);
	    myGraphics.setPaint(Color.blue);
	    myGraphics.fill(cabin1);
	    myGraphics.draw(cabin1);
	    
	    //draw connector 1
	    Line2D.Double line1 = new Line2D.Double(x+300, y+63, x, y+63);
	    myGraphics.setPaint(Color.black);
		myGraphics.setStroke(new BasicStroke(6) );
	    myGraphics.draw(line1);
	    
	    RoundRectangle2D.Float cabin2= new RoundRectangle2D.Float(x, y, w1, h1, e1, e2);
	    myGraphics.setPaint(Color.red);
	    myGraphics.fill(cabin2);
	    myGraphics.draw(cabin2);
	    
	    //draw connector 2
	    Line2D.Double line2 = new Line2D.Double(x+550,y+63,x+800,y+63);
	    myGraphics.setPaint(Color.black);
		myGraphics.setStroke(new BasicStroke(6) );
	    myGraphics.draw(line2);
	    
	    RoundRectangle2D.Float cabin3= new RoundRectangle2D.Float(x+600, y, w1, h1, e1, e2);
	    myGraphics.setPaint(Color.orange);
	    myGraphics.fill(cabin3);
	    myGraphics.draw(cabin3);
	    
	    // draw the wheels for red cabin
	    Ellipse2D.Float wh1 = new Ellipse2D.Float(x+37.5f, y+63, w4, w4);
	    Ellipse2D.Float wh2 = new Ellipse2D.Float(x+167.5f, y+63, w4, w4);
	    myGraphics.setPaint(Color.white);
	    myGraphics.fill(wh1);
	    myGraphics.fill(wh2);
	    myGraphics.setPaint(Color.darkGray);
	    myGraphics.draw(wh1);
	    myGraphics.draw(wh2);

	    wheel1.drawShape(myGraphics);
	    wheel2.drawShape(myGraphics);
	    
	    
	    // draw the wheels for blue cabin
	    Ellipse2D.Float wh3 = new Ellipse2D.Float(x+300+37.5f, y+63, w4, w4);
	    Ellipse2D.Float wh4 = new Ellipse2D.Float(x+300+167.5f, y+63, w4, w4);
	    myGraphics.setPaint(Color.white);
	    myGraphics.fill(wh3);
	    myGraphics.fill(wh4);
	    myGraphics.setPaint(Color.darkGray);
	    myGraphics.draw(wh3);
	    myGraphics.draw(wh4);

	    wheel3.drawShape(myGraphics);
	    wheel4.drawShape(myGraphics);
	    
	    
	    // draw the wheels for orange cabin
	    Ellipse2D.Float wh5 = new Ellipse2D.Float(x+600+37.5f, y+63, w4, w4);
	    Ellipse2D.Float wh6 = new Ellipse2D.Float(x+600+167.5f, y+63, w4, w4);
	    myGraphics.setPaint(Color.white);
	    myGraphics.fill(wh5);
	    myGraphics.fill(wh6);
	    myGraphics.setPaint(Color.darkGray);
	    myGraphics.draw(wh5);
	    myGraphics.draw(wh6);

	    wheel5.drawShape(myGraphics);
	    wheel6.drawShape(myGraphics);
	    
	 // draw the upper body
	    //RoundRectangle2D.Float mid = new RoundRectangle2D.Float(x+700, y-63, w2, h2, e1, e2);
	    Arc2D.Double mid = new Arc2D.Double(x+700, y-55, w2, h2+30, 360, 180, Arc2D.OPEN);
	    myGraphics.setPaint(Color.red);
	    myGraphics.fill(mid);
	    myGraphics.setPaint(Color.blue);
	    myGraphics.draw(mid);
	   /* Rectangle2D.Float top = new Rectangle2D.Float(x+600, y, w2, w4/2);
	    myGraphics.setPaint(Color.white);
	    myGraphics.fill(top);
*/
	    
	    
	    
	}

	@Override
	public void step() {
		float displacement = 10f;
	    x += displacement;
	    wheel1.step(displacement);
	    wheel2.step(displacement);
	    
	    wheel3.step(displacement);
	    wheel4.step(displacement);
	    
	    wheel5.step(displacement);
	    wheel6.step(displacement);
	    
	   
		
	}

	
	/**
	 * @param args
	 * @throws LineUnavailableException 
	 * @throws IOException 
	 * @throws UnsupportedAudioFileException 
	 */
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		  Vehicle roadster = new Train();
		    TrainView v = new TrainView(roadster);
		    TrainController ct = new TrainController(roadster, v);
		    v.setVisible(true);

	}
}
