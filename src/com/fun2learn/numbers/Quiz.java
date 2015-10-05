package com.fun2learn.numbers;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import puzzleproject.Resources;

import com.fun2learn.alphabets.rhymes.MainController;
import com.fun2learn.alphabets.rhymes.MainView;

public class Quiz extends JFrame{
	JPanel p=new JPanel();
	CardLayout cards=new CardLayout();
	int numQs;
	int wrongs=0;
	int total=0;
	public BufferedImage[] image;



	String[][] answers={
			{"2","1","3"},
			{"5","1","2"},
			{"3","6","5"},
			{"2","4","8"},
			{"4","5","7"},
			{"1","5","6"},
			{"7","5","8"},
			{"6","9","8"},
			{"10","8","9"},
			{"7","10","9"},
	};


	public static Radioquestion[] questions;

	public static void main(String args[]){
		new Quiz();
	}




	public Quiz(){
		super("Number Puzzles");
		getImages();
		setQuestions();
		setResizable(true);
		setSize(Resources.WINDOWWIDTH,Resources.WINDOWHEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		p.setLayout(cards);
		//p.setBackground(Color.black); 
		numQs=questions.length;
		for(int i=0;i<numQs;i++){
			p.add(questions[i],"q"+i);
		}
		Random r=new Random();
		int i=r.nextInt(numQs);
		cards.show(p,"q"+i);

		add(p);	
		setVisible(true);
	}

	public void next(){
		if((total-wrongs)==numQs){
			showSummary();
		}else{
			Random r=new Random();
			boolean found=false;
			int i=0;
			while(!found){
				i=r.nextInt(numQs);
				if(!questions[i].used){
					found=true;
				}
			}
			cards.show(p,"q"+i);
		}
	}

	public void showSummary(){
		JOptionPane.showMessageDialog(null,"All Done :), here are your results"+
				"\nNumber of incorrect Answers: \t"+wrongs+
				"\nNumber of Correct Answers: \t"+(total-wrongs)+
				"\nAverage Incorrect Answers per Questions: \t"+((float)wrongs/numQs)+
				"\nPercent Correct: \t\t"+(int)(((float)(total-wrongs)/total)*100)+"%"
				);
		super.dispose();
		//System.exit(0);
		MainView v = new MainView();
		try {
			MainController ct = new MainController(v);
		} catch (IOException | LineUnavailableException
				| UnsupportedAudioFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		v.setVisible(true);
	}

	public void getImages() {
		try {
			image = new BufferedImage [30];
			image[0] = ImageIO.read(new File("res/images/1strawberry.png"));
			image[1] = ImageIO.read(new File("res/images/2tomatoes.png"));
			image[2] = ImageIO.read(new File("res/images/3icecreams.png"));
			image[3] = ImageIO.read(new File("res/images/4flowers.png"));
			image[4] = ImageIO.read(new File("res/images/5pencils.png"));
			image[5] = ImageIO.read(new File("res/images/6cupcakes.jpg"));
			image[6] = ImageIO.read(new File("res/images/7balloons.png"));
			image[7] = ImageIO.read(new File("res/images/8chairs.png"));
			image[8] = ImageIO.read(new File("res/images/9roses.png"));
			image[9] = ImageIO.read(new File("res/images/10chocolate.png"));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void setQuestions() {
		Radioquestion questions1[] ={

				new Radioquestion(
						"Count the number of strawberries in the picture",
						image[0],
						answers[0],
						1,this
						),
						new Radioquestion(
								"Count the number of tomatoes in the picture",
								image[1],
								answers[1],
								2,this
								),
								new Radioquestion(
										"Count the number of ice candies in the picture",
										image[2],
										answers[2],
										0,this
										),
										new Radioquestion(
												"Count the number of flowers in the picture",
												image[3],
												answers[3],
												1,this
												),
												new Radioquestion(
														"Count the number of pencils in the picture",
														image[4],
														answers[4],
														1,this
														),
														new Radioquestion(
																"Count the number of cupcakes in the picture",
																image[5],
																answers[5],
																2,this
																),
																new Radioquestion(
																		"Count the number of balloons in the picture",
																		image[6],
																		answers[6],
																		0,this
																		),
																		new Radioquestion(
																				"Count the number of chairs in the picture",
																				image[7],
																				answers[7],
																				2,this
																				),
																				new Radioquestion(
																						"Count the number of roses in the picture",
																						image[8],
																						answers[8],
																						2,this
																						),
																						new Radioquestion(
																								"Count the number of chocolates in the picture",
																								image[9],
																								answers[9],
																								1,this
																								)
		};

		questions = questions1;


	}
}