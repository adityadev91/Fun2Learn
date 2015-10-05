package com.fun2learn.numbers;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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

import com.fun2learn.alphabetpuzzle.AlphPuzzleServices;
import com.fun2learn.alphabetpuzzle.AlphPuzzleUI;
import com.fun2learn.alphabets.Main;
import com.fun2learn.alphabets.rhymes.KeyEventHandler;
import com.fun2learn.alphabets.rhymes.MainController;
import com.fun2learn.alphabets.rhymes.MainView;




public class Nums implements KeyListener, ActionListener{
	static final int windowwidth = 1000;
	static final int windowheight = 1000;
	static final int panelrows = 2;
	static final int panelcols = 5;
	static final int HGAP = 10;
	static final int VGAP = 10;
	JPanel panel;
	JFrame window;
	/**
	 * Constructor that initializes buttons on the panel
	 */
	public Nums() {
		//Define and initialize window components 
		window = new JFrame("Numbers");
		panel = new JPanel(new GridLayout(panelrows, panelcols, HGAP, VGAP)){
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				super.setBackground(Color.CYAN);
			}
		};
		addMenuButton();
		try {
			Resources1.image1 = ImageIO.read(new File("res/images/1.png"));
			Resources1.image2 = ImageIO.read(new File("res/images/2.png"));
			Resources1.image3 = ImageIO.read(new File("res/images/3.png"));
			Resources1.image4 = ImageIO.read(new File("res/images/4.png"));
			Resources1.image5 = ImageIO.read(new File("res/images/5.png"));
			Resources1.image6 = ImageIO.read(new File("res/images/6.png"));
			Resources1.image7 = ImageIO.read(new File("res/images/7.png"));
			Resources1.image8 = ImageIO.read(new File("res/images/8.png"));
			Resources1.image9 = ImageIO.read(new File("res/images/9.png"));
			Resources1.image10 =ImageIO.read(new File("res/images/10.png"));
			Resources1.image11 =ImageIO.read(new File("res/images/11.png"));

			Resources1.button1 = new JButton(new ImageIcon(Resources1.image1));
			Resources1.button1.setBorder(BorderFactory.createEmptyBorder());
			Resources1.button1.setContentAreaFilled(false);
			Resources1.button2 = new JButton(new ImageIcon(Resources1.image2));
			Resources1.button2.setBorder(BorderFactory.createEmptyBorder());
			Resources1.button2.setContentAreaFilled(false);
			Resources1.button3 = new JButton(new ImageIcon(Resources1.image3));
			Resources1.button3.setBorder(BorderFactory.createEmptyBorder());
			Resources1.button3.setContentAreaFilled(false);
			Resources1.button4 = new JButton(new ImageIcon(Resources1.image4));
			Resources1.button4.setBorder(BorderFactory.createEmptyBorder());
			Resources1.button4.setContentAreaFilled(false);
			Resources1.button5 = new JButton(new ImageIcon(Resources1.image5));
			Resources1.button5.setBorder(BorderFactory.createEmptyBorder());
			Resources1.button5.setContentAreaFilled(false);
			Resources1.button6 = new JButton(new ImageIcon(Resources1.image6));
			Resources1.button6.setBorder(BorderFactory.createEmptyBorder());
			Resources1.button6.setContentAreaFilled(false);
			Resources1.button7 = new JButton(new ImageIcon(Resources1.image7));
			Resources1.button7.setBorder(BorderFactory.createEmptyBorder());
			Resources1.button7.setContentAreaFilled(false);
			Resources1.button8 = new JButton(new ImageIcon(Resources1.image8));
			Resources1.button8.setBorder(BorderFactory.createEmptyBorder());
			Resources1.button8.setContentAreaFilled(false);
			Resources1.button9 = new JButton(new ImageIcon(Resources1.image9));
			Resources1.button9.setBorder(BorderFactory.createEmptyBorder());
			Resources1.button9.setContentAreaFilled(false);
			Resources1.button10 = new JButton(new ImageIcon(Resources1.image10));
			Resources1.button10.setBorder(BorderFactory.createEmptyBorder());
			Resources1.button10.setContentAreaFilled(false);
			Resources1.button11= new JButton(new ImageIcon(Resources1.image11));
			Resources1.button11.setBorder(BorderFactory.createEmptyBorder());
			Resources1.button11.setContentAreaFilled(false);


			//Add listener
			ActionClass actionEvent = new ActionClass();

			Resources1.button1.addActionListener(actionEvent);
			Resources1.button2.addActionListener(actionEvent);
			Resources1.button3.addActionListener(actionEvent);
			Resources1.button4.addActionListener(actionEvent);
			Resources1.button5.addActionListener(actionEvent);
			Resources1.button6.addActionListener(actionEvent);
			Resources1.button7.addActionListener(actionEvent);
			Resources1.button8.addActionListener(actionEvent);
			Resources1.button9.addActionListener(actionEvent);
			Resources1.button10.addActionListener(actionEvent);
			Resources1.button11.addActionListener(this);
			


			Resources1.button1.setActionCommand(Resources1.sound1);
			Resources1.button2.setActionCommand(Resources1.sound2);
			Resources1.button3.setActionCommand(Resources1.sound3);
			Resources1.button4.setActionCommand(Resources1.sound4);
			Resources1.button5.setActionCommand(Resources1.sound5);
			Resources1.button6.setActionCommand(Resources1.sound6);
			Resources1.button7.setActionCommand(Resources1.sound7);
			Resources1.button8.setActionCommand(Resources1.sound8);
			Resources1.button9.setActionCommand(Resources1.sound9);
			Resources1.button10.setActionCommand(Resources1.sound10);
			Resources1.button11.setActionCommand(Resources.NEXTSOUND);



			//Add Content to Panel
			panel.add(Resources1.button1, BorderLayout.CENTER);
			panel.add(Resources1.button2, BorderLayout.CENTER);
			panel.add(Resources1.button3, BorderLayout.CENTER);
			panel.add(Resources1.button4, BorderLayout.CENTER);
			panel.add(Resources1.button5, BorderLayout.CENTER);
			panel.add(Resources1.button6, BorderLayout.CENTER);
			panel.add(Resources1.button7, BorderLayout.CENTER);
			panel.add(Resources1.button8, BorderLayout.CENTER);
			panel.add(Resources1.button9, BorderLayout.CENTER);
			panel.add(Resources1.button10,BorderLayout.CENTER);
			panel.add(Resources1.button11,BorderLayout.CENTER);


			//Add Panel to Window
			window.setContentPane(panel);
			// create the event handler
			KeyEventHandler eventHandler = new KeyEventHandler();
			// make the panel focusable so it can receive keyboard events
			panel.setFocusable(true);
			panel.addKeyListener(eventHandler);
			window.setSize(Resources.WINDOWWIDTH, Resources.WINDOWHEIGHT);
			window.setVisible(true);
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		if(actionEvent.getSource()==Resources1.button11){
			MainController.playAudio(actionEvent.getActionCommand());
			this.window.setVisible(false);
			this.window.dispose();
			new Quiz();
		}
	}

	public static void main(String[] args) {
		new Nums();
		// create the event handler
	}

	private void addMenuButton() {
		try {
			JButton menuButton= new JButton(new ImageIcon(ImageIO.read(new File("res/image/menu.png"))));
			menuButton.setBorder(BorderFactory.createEmptyBorder());
			menuButton.setContentAreaFilled(false);
			menuButton.setActionCommand(Resources.MENUSOUND);
			menuButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					MainController.playAudio(e.getActionCommand());
					window.dispose();
					MainView mainView = new MainView();
					try {
						new MainController(mainView);
					} catch (IOException|LineUnavailableException|UnsupportedAudioFileException e1) {
						e1.toString();
					}
					//this should stay for key press
					mainView.requestFocusInWindow();
					mainView.setVisible(true);			
				}
			});
			panel.add(menuButton);
		} catch (IOException e) {
			e.toString();
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
	}




	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//JLabel label1 = new JLabel();
		//label1.setText("You pressed the key:   ");
		System.out.println("Key with number " +e.getKeyChar() +" typed");


	}




	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
