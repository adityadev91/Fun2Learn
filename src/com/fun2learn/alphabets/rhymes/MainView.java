package com.fun2learn.alphabets.rhymes;



import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import puzzleproject.Resources;
//import javax.media.Player;
//import javax.sound.sampled.AudioFormat;



public class MainView extends JFrame {
	// Components
	/**
	 * @uml.property  name="rhymesButton"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JButton rhymesButton;  
	/**
	 * @uml.property  name="puzzlesButton"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JButton puzzlesButton;
	/**
	 * @uml.property  name="countingButton"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JButton countingButton; 
	/**
	 * @uml.property  name="rhymesButtonicon"
	 * @uml.associationEnd  readOnly="true"
	 */
	ImageIcon rhymesButtonicon;
	/**
	 * @uml.property  name="rhymesicon"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private ImageIcon rhymesicon;
	/**
	 * @uml.property  name="pzzlesicon"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private ImageIcon pzzlesicon;
	/**
	 * @uml.property  name="countingicon"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private ImageIcon countingicon;

	public MainView() {
		// Lay the components   
		JPanel panel = new JPanel(new GridLayout(3,0)) {


			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				Graphics2D myGraphics = (Graphics2D) g;
			}
		};


		// create the buttons
		try {
			Image rhymesImage = ImageIO.read(new File("res/image/rhymes2.png"));
			Image puzzlesImage = ImageIO.read(new File("res/image/puzzles.gif"));
			Image countingImage = ImageIO.read(new File("res/image/counting.png"));
			rhymesicon = new ImageIcon(rhymesImage);
			pzzlesicon = new ImageIcon(puzzlesImage);
			countingicon = new ImageIcon(countingImage);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}




		rhymesButton = new JButton("",rhymesicon);
		rhymesButton.setBackground(Color.ORANGE);
		rhymesButton.setActionCommand(Resources.RHYMESSOUND);
		
		puzzlesButton = new JButton("",pzzlesicon);
		puzzlesButton.setBackground(Color.CYAN);
		puzzlesButton.setActionCommand(Resources.PUZZLESSOUND);
		
		countingButton = new JButton("",countingicon);
		countingButton.setBackground(new Color(0,235,0));
		countingButton.setActionCommand(Resources.NUMBERSSOUND);
		
		// add the buttons to the panel
		panel.add(rhymesButton);
		panel.add(puzzlesButton);
		panel.add(countingButton);

		// add the panel to this window
		panel.setFocusable(true);
		setContentPane(panel);
		panel.setOpaque(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(Resources.WINDOWWIDTH, Resources.WINDOWHEIGHT);
		setTitle("Fun 2 Learn");
		setResizable(false);

	}

	// add a listener to the A button
	public void addRhymesListener(ActionListener listener) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		rhymesButton.addActionListener(listener);
	}

	// add a listener to the B button
	public void addPuzzlesListener(ActionListener listener) {
		puzzlesButton.addActionListener(listener);
	}
	//add a listener to the C button
	public void addCountingListener(ActionListener listener) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		countingButton.addActionListener(listener);
	}


}
