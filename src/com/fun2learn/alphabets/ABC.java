package com.fun2learn.alphabets;

import java.awt.Graphics2D;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;




import com.fun2learn.alphabets.rhymes.ABCController;
import com.fun2learn.alphabets.rhymes.ABCView;
import com.fun2learn.alphabets.rhymes.TrainController;
import com.fun2learn.alphabets.rhymes.TrainView;
import com.fun2learn.alphabets.rhymes.Vehicle;

public class ABC extends Vehicle{

	/**
	 * @param args
	 * @throws LineUnavailableException 
	 * @throws IOException 
	 * @throws UnsupportedAudioFileException 
	 */
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		 Vehicle roadster = new ABC();
		    ABCView v = new ABCView();
		    ABCController ct = new ABCController( v);
		    v.setVisible(true);
	}

	@Override
	public void drawShape(Graphics2D myGraphics) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void step() {
		// TODO Auto-generated method stub
		
	}

}
