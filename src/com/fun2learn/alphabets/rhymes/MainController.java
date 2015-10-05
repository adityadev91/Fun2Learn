package com.fun2learn.alphabets.rhymes;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import com.fun2learn.alphabetpuzzle.AlphPuzzleUI;
import com.fun2learn.numbers.Nums;

public class MainController implements  ActionListener {

	/**
	 * @uml.property  name="view"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private MainView view;

	public MainController( MainView v) throws  IOException, LineUnavailableException, UnsupportedAudioFileException {
		view = v;

		view.addRhymesListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playAudio(e.getActionCommand());
				view.setVisible(false);
				view.dispose();
				ABCView abcView = new ABCView();
				try {
					ABCController ct = new ABCController(abcView);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (LineUnavailableException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UnsupportedAudioFileException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				//this should stay for key press
				abcView.requestFocusInWindow();
				abcView.setVisible(true);

			}

		});

		view.addPuzzlesListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playAudio(e.getActionCommand());
				view.setVisible(false);
				view.dispose();
				new AlphPuzzleUI();
			}
		});	


		view.addCountingListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playAudio(e.getActionCommand());
				view.setVisible(false);
				view.dispose();
				new Nums();
			}
		});	



	}
	
	public static void playAudio(String action) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(action).getAbsoluteFile());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();			
		} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
			System.out.println(e1.toString());
		}
	}

	public void actionPerformed(ActionEvent e) {
		// call the paintComponent method in view
		view.repaint();	
	}
}
