package com.fun2learn.numbers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class ActionClass implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			String action = e.getActionCommand();
	    	 AudioInputStream fis =
	    			 AudioSystem.getAudioInputStream(new File(action).getAbsoluteFile());
	                AudioInputStream ais = AudioSystem.getAudioInputStream(
	                 AudioFormat.Encoding.PCM_SIGNED,fis);
	                Clip clip = AudioSystem.getClip();
	                clip.open(ais);
	                FloatControl gainControl = 
	                	    (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
	                	gainControl.setValue(6.0f); // increase volume by 6 decibels.
	                clip.start();
		} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
}
