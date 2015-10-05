package com.fun2learn.alphabets.rhymes;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Timer;

public class TrainController implements  ActionListener,MouseListener {

	long remaining; // How many milliseconds remain in the countdown.

	long lastUpdate; // When count was last updated
	Clip clip = null;

	// List the models and views that the controller interacts with
	/**
	 * @uml.property  name="model"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private Vehicle model; // object being animated
	/**
	 * @uml.property  name="view"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private TrainView view;   
	/**
	 * @uml.property  name="timer"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private Timer timer; // create a swing timer to run periodically

	public TrainController(Vehicle m, TrainView v) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		model = m;
		view = v;
		timer = new Timer(30, this);
		timer.setDelay(100);
		v.setFocusable(true);
		v.addMouseListener(this);


		view.addMenuListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainController.playAudio(e.getActionCommand());
				view.setVisible(false);
				view.dispose();
				MainView mainView = new MainView();
				mainView.setFocusable(true);
				try {
					MainController ct = new MainController(mainView);
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
				mainView.requestFocusInWindow();
				mainView.setVisible(true);	

			}
		});


		view.addStartListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.menuButton.hide();
				view.backButton.hide();
				view.startButton.hide();
				view.stopButton.show();
				AudioInputStream fis = null;
				try {
					fis = AudioSystem.getAudioInputStream(new File("res/audio-alphabet/OldMc-wav.wav").getAbsoluteFile());
				} catch (UnsupportedAudioFileException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				AudioInputStream ais = AudioSystem.getAudioInputStream(
						AudioFormat.Encoding.PCM_SIGNED,fis);
				try {
					clip = AudioSystem.getClip();
				} catch (LineUnavailableException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				try {
					clip.open(ais);
				} catch (LineUnavailableException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				FloatControl gainControl = 
						(FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
				gainControl.setValue(6.0f); // increase volume by 6 decibels.
				clip.start();
				view.panel.requestFocusInWindow();

			}
		});

		view.addStopListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(clip.isRunning()){
					clip.stop();
					view.menuButton.show();
					view.backButton.show();
					view.startButton.show();
					view.stopButton.hide();

				}


			}
		});

		view.addBackListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainController.playAudio(e.getActionCommand());
				view.setVisible(false);
				view.dispose();

				ABCView v = new ABCView();
				try {
					ABCController ct = new ABCController(v);
				} catch (IOException | LineUnavailableException
						| UnsupportedAudioFileException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				v.setVisible(true);
			}
		});
	}

	//Start or resume the countdown
	void resume() {
		// Restore the time we're counting down from and restart the timer.
		lastUpdate = System.currentTimeMillis();
		timer.start(); // Start the timer
	}

	//Pause the countdown
	void pause() {
		// Subtract elapsed time from the remaining time and stop timing
		long now = System.currentTimeMillis();
		remaining -= (now - lastUpdate);
		timer.stop(); // Stop the timer
	}






	public TrainController(TrainView trainView) {
		// TODO Auto-generated constructor stub
	}

	// action performed by timer
	public void actionPerformed(ActionEvent e) {
		// move the model by one step

		model.step();	   
		// call the paintComponent method in view

		view.repaint();	
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		pause();

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		resume(); // resume countdown
	}

	@Override
	public void mousePressed(MouseEvent arg0) {


	}

	@Override
	public void mouseReleased(MouseEvent arg0) {


	}
}
