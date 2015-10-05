package com.fun2learn.numbers;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import puzzleproject.Resources;

import com.fun2learn.alphabets.rhymes.MainController;
import com.fun2learn.alphabets.rhymes.MainView;



public class Radioquestion extends JPanel implements ActionListener{
	private static final int DEFAULT_IMAGE_TYPE = BufferedImage.TYPE_INT_ARGB;
	int correctAns;
	Quiz quiz;	
	int selected = -1;
	boolean used;
	BufferedImage Image;
	//questions
	JPanel qPanel=new JPanel();
	//answers
	JPanel aPanel=new JPanel(new GridLayout(1, 3));
	JRadioButton[] responses;
	ButtonGroup group=new ButtonGroup();
	//bottom
	JPanel botPanel=new JPanel(new GridLayout(1, 3,10,0));
	JButton next;
	
	JButton finish;
	
	public JButton menuButton;
	private ImageIcon menuicon;
	
	public Radioquestion(String q, BufferedImage image, String[] options, int ans, Quiz quiz){
		this.quiz=quiz;
		Image menuImage = null;
		try {
			menuImage = ImageIO.read(new File("res/image/menu.png"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		menuicon = new ImageIcon(menuImage);
		next=new JButton("Next");
		finish=new JButton("Quit");
		menuButton= new JButton("Menu");
		menuButton.setActionCommand(Resources.MENUSOUND);
		menuButton.setFont(new Font("Arial", Font.PLAIN, 50));
		next.setFont(new Font("Arial", Font.PLAIN, 50));
		finish.setFont(new Font("Arial", Font.PLAIN, 50));
		next.setActionCommand(Resources.NEXTSOUND);
		finish.setActionCommand(Resources.MENUSOUND);

		BufferedImage Image = new BufferedImage(100,100,DEFAULT_IMAGE_TYPE);
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		correctAns=ans;
		try {
			Image = resizeImage(image,400,350,DEFAULT_IMAGE_TYPE);
		} catch (IOException e) {
		     e.printStackTrace();
		}
		
	//	Image = image;
		//question
		JLabel ques = new JLabel(q);
		ques.setFont(new Font("Arial", Font.PLAIN, 50));
		qPanel.add(ques);
		
		add(qPanel);
		//image
		
		JLabel picLabel = new JLabel(new ImageIcon(Image));
		picLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(picLabel);
		
		//answer
		responses=new JRadioButton[options.length];
		for(int i=0;i<options.length;i++){
			responses[i]=new JRadioButton(options[i]);
			responses[i].addActionListener(this);
			responses[i].setFont(new Font("Arial", Font.PLAIN, 160));
			group.add(responses[i]);
			aPanel.add(responses[i]);
		}
		add(aPanel);
		//bottom
		next.addActionListener(this);
		finish.addActionListener(this);
		menuButton.addActionListener(this);
		botPanel.add(next);
		botPanel.add(finish);
		botPanel.add(menuButton);
		add(botPanel);
	}
	
	public void actionPerformed(ActionEvent e){
		Object src=e.getSource();
		MainController.playAudio(e.getActionCommand());
		//next button
		if(src.equals(next)){
			showResult();
			System.out.println("selected ="+selected);
			if(selected==correctAns){
				used=true;
				quiz.next();
			}
		}
		//finish button
		if(src.equals(finish)){
			quiz.showSummary();
		}
		if(src.equals(menuButton)){
			quiz.setVisible(false);
  	        quiz.dispose();
  	      MainView mainView = new MainView();
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
		//radio buttons
		for(int i=0;i<responses.length;i++){
			if(src==responses[i]){
				selected=i;
			}
		}
	}
	
	public void showResult(){
		String text;
	    if (selected >= 0) {
		  text = responses[selected].getText();
	    } else {
	      text = "Please select an answer !!";
	    }
		quiz.total++;
		//String correct = "audio/sounds/One.wav";
		//String wrong = "audio/sounds/Two.wav";
	
	    

		if(selected==correctAns){
			JOptionPane.showMessageDialog(null, text+" is correct!!!!\nWell Done :)");
		} else if (selected >= 0) {
			quiz.wrongs++;
			JOptionPane.showMessageDialog(null, text+" is not correct !!\nSorry :(...Try again !!");
		} else {
		    JOptionPane.showMessageDialog(null, text);
		}
		
	}
	
	private BufferedImage resizeImage(BufferedImage originalImage, int width, int height, int type) throws IOException {  
	        BufferedImage resizedImage = new BufferedImage(width, height, type);  
	        Graphics2D g = resizedImage.createGraphics();  
	        g.drawImage(originalImage, 0, 0, width, height, null);  
	        g.dispose();  
	        return resizedImage;  
	 }  
}