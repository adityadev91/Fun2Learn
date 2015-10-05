package com.fun2learn.alphabets;

import java.awt.Graphics2D;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import com.fun2learn.alphabets.rhymes.ABCController;
import com.fun2learn.alphabets.rhymes.ABCView;
import com.fun2learn.alphabets.rhymes.MainController;
import com.fun2learn.alphabets.rhymes.MainView;
import com.fun2learn.alphabets.rhymes.TrainController;
import com.fun2learn.alphabets.rhymes.TrainView;
import com.fun2learn.alphabets.rhymes.Vehicle;

public class Main {

	/**
	 * @param args
	 * @throws LineUnavailableException 
	 * @throws IOException 
	 * @throws UnsupportedAudioFileException 
	 */
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		    MainView v = new MainView();
		    MainController ct = new MainController(v);
		    v.setVisible(true);

	}

}
