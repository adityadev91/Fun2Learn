/**
 * 
 */
package com.fun2learn.alphabetpuzzle;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import puzzleproject.Resources;

import com.fun2learn.alphabets.Main;
import com.fun2learn.alphabets.rhymes.MainController;
import com.fun2learn.alphabets.rhymes.MainView;

/**
 * @author adityadev
 *
 */
public class AlphPuzzleUI extends JFrame implements ActionListener {

	private JButton menuButton, qButton;													//Define question button
	private JButton answerArray[] = new JButton[3];							//Define answer buttons
	private JButton nextButton = new JButton();//change 2

	JFrame window = new JFrame("Puzzles");									//Define and initialize window
	JPanel panel;
	GridBagConstraints gbc = new GridBagConstraints();						//Define and initialize GridBagLayout
	MediaBundle qObject;
	MediaBundle ansObjects[] = new MediaBundle[3];
	AlphPuzzleServices aps = new AlphPuzzleServices();						//Define and initialize Services object
	int rightOption;

	ImageIcon objImageIcon = new ImageIcon();//change
	public AlphPuzzleUI() {
		panel = new JPanel(new GridBagLayout()){
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
			}
		};							//Define and initialize panel
		this.panel.setBackground(Color.orange);
		try {
			objImageIcon.setImage(ImageIO.read(new File(Resources.IMAGE_NEXT)));//change
		} catch (IOException e) {
			System.out.println(e.toString());
		}

		nextButton.setIcon(objImageIcon);//change 
		nextButton.addActionListener(this);
		initQuestion();
		initAnswers();

		this.gbc.insets=new Insets(0, 0, 0, 100);						//Assign padding to all buttons
		addMenuButton();

		this.gbc.anchor=GridBagConstraints.SOUTHEAST;
		this.gbc.gridy=3;
		this.gbc.gridx=2;
		this.nextButton.setBorder(BorderFactory.createEmptyBorder());
		this.nextButton.setContentAreaFilled(false);
		this.nextButton.setVisible(false);
		this.panel.add(this.nextButton,this.gbc);
		this.window.setContentPane(panel);									//Add panel to window
		this.window.setSize(Resources.WINDOWWIDTH,Resources.WINDOWHEIGHT);										//Set window size
		this.window.setVisible(true);										//Allow visibility of window
		this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			//Properly exit JFrame

		System.out.println("rightOption: "+rightOption);
	}

	private void addMenuButton() {
		this.gbc.gridy=0;
		this.gbc.gridx=0;
		this.gbc.anchor=GridBagConstraints.NORTHWEST;
		try {
			menuButton= new JButton(new ImageIcon(ImageIO.read(new File("res/image/menu.png"))));
		} catch (IOException e) {
			e.toString();
		}
		this.menuButton.setBorder(BorderFactory.createEmptyBorder());
		this.menuButton.setContentAreaFilled(false);
		this.menuButton.addActionListener(this);
		this.panel.add(this.menuButton,this.gbc);
		this.menuButton.setActionCommand(Resources.MENUSOUND);
	}

	private void initAnswers() {
		this.ansObjects = this.aps.getThreeOptions();
		this.gbc.gridy=1;													//Assign next row position to answer buttons
		int i;
		for(i=0;i<3;i++){
			this.answerArray[i] = new JButton(new ImageIcon(ansObjects[i].getImage())); 
			this.answerArray[i].setBorder(BorderFactory.createEmptyBorder());
			this.answerArray[i].setContentAreaFilled(false);
			this.answerArray[i].addActionListener(this);					//Assign Listener to question button
			this.answerArray[i].setActionCommand(ansObjects[i].getAudio());
			this.gbc.gridx=i;												//Assigns consecutive positions to answer buttons
			this.panel.add(answerArray[i],this.gbc);						//Add answer buttons to panel
		}
		this.rightOption = this.aps.getRightOption();
	}

	private void initQuestion() {
		this.gbc.insets=new Insets(100, 100, 00, 100);						//Assign padding to all buttons
		this.qObject = this.aps.getQuestion();								//Assign question button with alphabet image
		this.gbc.anchor=GridBagConstraints.CENTER;
		qButton = new JButton(new ImageIcon(qObject.getImage()));
		System.out.println(this.qButton.getIcon());
		this.qButton.setBorder(BorderFactory.createEmptyBorder());
		this.qButton.setContentAreaFilled(false);
		this.qButton.addActionListener(this);								//Assign Listener to question button
		this.qButton.setActionCommand(this.qObject.getAudio());
		this.gbc.gridx=1;													//Assign position to question button
		this.gbc.gridy=0;
		this.qButton.setBackground(Color.ORANGE);
		this.panel.add(this.qButton, this.gbc);									//Add question button to panel
	}

	private void displayRightAnswerMessage() {
		System.out.println("Right Answer");
	}

	private void displayWrongAnswerMessage() {
		System.out.println("Wrong Answer");
	}

	private void displayArrow() {
		this.gbc.gridy=3;
		this.gbc.gridx=4;
		this.panel.add(this.nextButton,gbc);
		this.nextButton.setVisible(true);
		this.nextButton.setActionCommand(Resources.NEXTSOUND);
		int i;
		for(i=0;i<3;i++){
			if(i!=rightOption){
				this.answerArray[i].setVisible(false);
			}
		}
		//this.nextButton.addActionListener(this);
	}

	private void repaintPanel() {
		this.panel.removeAll();
		this.panel.revalidate();
		this.panel.repaint();
		System.out.println("Panel has been repainted");
		this.nextButton.setVisible(false);
		initQuestion();
		initAnswers();
		addMenuButton();
	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		if(actionEvent.getSource()==nextButton){
			if(AlphPuzzleServices.getCurrentIndex()<Resources.TOTAL_ALPHABETS-1){
				repaintPanel();
			}
			else{
				AlphPuzzleServices.setCurrentIndex(-1);
				//JDialog.setDefaultLookAndFeelDecorated(true);
				int response = JOptionPane.showConfirmDialog(null, "Play again?", "Congrats!",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (response == JOptionPane.NO_OPTION) {
					// Go to Main Screen
					this.window.dispose();
					MainView mainView = new MainView();
					try {
						new MainController(mainView);
					} catch (Exception e1) {
						e1.toString();
					}
					//this should stay for key press
					mainView.requestFocusInWindow();
					mainView.setVisible(true);
				} else if (response == JOptionPane.YES_OPTION) {
					this.window.dispose();
					new AlphPuzzleUI();
				} else if (response == JOptionPane.CLOSED_OPTION) {
					// Do Nothing
				}				
			}
		}else if(actionEvent.getSource()==menuButton){
			AlphPuzzleServices.setCurrentIndex(-1);
			this.window.setVisible(false);
			this.window.dispose();
			MainView mainView = new MainView();
			try {
				new MainController(mainView);
			} catch (IOException|LineUnavailableException|UnsupportedAudioFileException e1) {
				e1.toString();
			}
			//this should stay for key press
			mainView.requestFocusInWindow();
			mainView.setVisible(true);	
		}else//change 1
			if(this.answerArray[this.rightOption]==actionEvent.getSource()){
				displayRightAnswerMessage();
				displayArrow();
			}
			else{
				displayWrongAnswerMessage();
			}
		try {
			String action = actionEvent.getActionCommand();
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(action).getAbsoluteFile());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();			
		} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
			System.out.println(e1.toString());
		}
	}

	public static void main(String[] args) {
		new AlphPuzzleUI();
	}

}
