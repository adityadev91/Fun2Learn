package com.fun2learn.alphabets.rhymes;



import java.awt.*;
import java.awt.event.*;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

import puzzleproject.Resources;
import javazoom.jl.player.Player;



public class TrainView extends JFrame {
  public JButton startButton;
  public JButton stopButton;
  public JButton menuButton;
  public JButton backButton;
  private Vehicle model;
  private static Player player ;
  static int fileRunning = 0;
  Clip clip ;
  private ImageIcon menuicon;
  private ImageIcon starticon;
  private ImageIcon stopicon;
  private ImageIcon backicon;
  public JPanel panel;
 
  public TrainView(Vehicle m) {
    model = m;
    // Lay the components   
      panel = new JPanel() {
      public void paintComponent(Graphics g) {
      super.paintComponent(g);
      Image backgroundImage = null;
	try {
		backgroundImage = ImageIO.read(new File("res/image/newfarm.jpg"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      g.drawImage(backgroundImage, 0, 0, this);
      Graphics2D myGraphics = (Graphics2D) g;
      model.drawShape(myGraphics);
     }
   };
   
   Image menuImage;
try {
	
	menuImage = ImageIO.read(new File("res/image/menu.png"));
	menuicon = new ImageIcon(menuImage);
	menuButton= new JButton("",menuicon);
	menuButton.setBorder(BorderFactory.createEmptyBorder());
	menuButton.setActionCommand(Resources.MENUSOUND);
	menuButton.setContentAreaFilled(false);
	
	Image startImage = ImageIO.read(new File("res/image/StartButton.png"));
	starticon = new ImageIcon(startImage);
	startButton = new JButton("",starticon);
	startButton.setBorder(BorderFactory.createEmptyBorder());
	startButton.setContentAreaFilled(false);
	
	Image stopImage = ImageIO.read(new File("res/image/Stop.png"));
	stopicon = new ImageIcon(stopImage);
	stopButton = new JButton("",stopicon);
	stopButton.setBorder(BorderFactory.createEmptyBorder());
	startButton.setContentAreaFilled(false);
	
	Image backImage = ImageIO.read(new File("res/image/Back.png"));
	backicon = new ImageIcon(backImage);
	backButton = new JButton("",backicon);
	backButton.setBorder(BorderFactory.createEmptyBorder());
	backButton.setActionCommand(Resources.BACKSOUND);
	backButton.setContentAreaFilled(false);
	
} catch (IOException e) {
	e.printStackTrace();
}
  
    // add the panel to this window
    panel.add(menuButton);
    panel.add(startButton);
    panel.add(stopButton);
    panel.add(backButton);
    stopButton.hide();
    panel.setFocusable(true);
    setContentPane(panel);
    panel.setOpaque(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(Resources.WINDOWWIDTH, Resources.WINDOWHEIGHT);
    setTitle("Train Animation");
    setResizable(false);
    panel.setVisible(true);
    menuButton.requestFocusInWindow();
  }
  public void addMenuListener(ActionListener listener) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
	    menuButton.addActionListener(listener); 
	    
	  }
  public void addStartListener(ActionListener listener) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
	    startButton.addActionListener(listener); 
	  }
  public void addStopListener(ActionListener listener) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
	    stopButton.addActionListener(listener); 
	  }
  public void addBackListener(ActionListener listener) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
	    backButton.addActionListener(listener); 
	    
	  }
  
}
