package com.fun2learn.alphabets.rhymes;



import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.io.File;

import javax.imageio.ImageIO;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


import puzzleproject.Resources;

//import javax.media.Format;
//import javax.media.format.AudioFormat;
import java.io.IOException;
/*import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import javazoom.jl.player.advanced.AdvancedPlayer;
import javazoom.jl.player.advanced.PlaybackEvent;
import javazoom.jl.player.advanced.PlaybackListener;*/



public class ABCView extends JFrame {

	// Components
	/**
	 * @uml.property  name="menuButton"
	 * @uml.associationEnd  
	 */
	public JButton menuButton;
	public JButton startButton;
	public JButton stopButton;

	private ImageIcon menuicon;
	private ImageIcon starticon;
	private ImageIcon nexticon;
	private ImageIcon stopicon;

	public JButton nextButton;

	/**
	 * @uml.property  name="aButton"
	 * @uml.associationEnd  
	 */
	private JButton aButton;  
	/**
	 * @uml.property  name="bButton"
	 * @uml.associationEnd  
	 */
	private JButton bButton;
	/**
	 * @uml.property  name="cButton"
	 * @uml.associationEnd  
	 */
	private JButton cButton;  
	/**
	 * @uml.property  name="dButton"
	 * @uml.associationEnd  
	 */
	private JButton dButton; 
	/**
	 * @uml.property  name="eButton"
	 * @uml.associationEnd  
	 */
	private JButton eButton;  
	/**
	 * @uml.property  name="fButton"
	 * @uml.associationEnd  
	 */
	private JButton fButton; 
	/**
	 * @uml.property  name="gButton"
	 * @uml.associationEnd  
	 */
	private JButton gButton;  
	/**
	 * @uml.property  name="hButton"
	 * @uml.associationEnd  
	 */
	private JButton hButton; 
	/**
	 * @uml.property  name="iButton"
	 * @uml.associationEnd  
	 */
	private JButton iButton;  
	/**
	 * @uml.property  name="jButton"
	 * @uml.associationEnd  
	 */
	private JButton jButton; 
	/**
	 * @uml.property  name="kButton"
	 * @uml.associationEnd  
	 */
	private JButton kButton;  
	/**
	 * @uml.property  name="lButton"
	 * @uml.associationEnd  
	 */
	private JButton lButton; 
	/**
	 * @uml.property  name="mButton"
	 * @uml.associationEnd  
	 */
	private JButton mButton;  
	/**
	 * @uml.property  name="nButton"
	 * @uml.associationEnd  
	 */
	private JButton nButton; 
	/**
	 * @uml.property  name="oButton"
	 * @uml.associationEnd  
	 */
	private JButton oButton;  
	/**
	 * @uml.property  name="pButton"
	 * @uml.associationEnd  
	 */
	private JButton pButton; 
	/**
	 * @uml.property  name="qButton"
	 * @uml.associationEnd  
	 */
	private JButton qButton;  
	/**
	 * @uml.property  name="rButton"
	 * @uml.associationEnd  
	 */
	private JButton rButton; 
	/**
	 * @uml.property  name="sButton"
	 * @uml.associationEnd  
	 */
	private JButton sButton;  
	/**
	 * @uml.property  name="tButton"
	 * @uml.associationEnd  
	 */
	private JButton tButton; 
	/**
	 * @uml.property  name="uButton"
	 * @uml.associationEnd  
	 */
	private JButton uButton;  
	/**
	 * @uml.property  name="vButton"
	 * @uml.associationEnd  
	 */
	private JButton vButton; 
	/**
	 * @uml.property  name="wButton"
	 * @uml.associationEnd  
	 */
	private JButton wButton;  
	/**
	 * @uml.property  name="xButton"
	 * @uml.associationEnd  
	 */
	private JButton xButton; 
	/**
	 * @uml.property  name="yButton"
	 * @uml.associationEnd  
	 */
	private JButton yButton;  
	/**
	 * @uml.property  name="zButton"
	 * @uml.associationEnd  
	 */
	private JButton zButton; 

	/**
	 * @uml.property  name="aicon"
	 * @uml.associationEnd  
	 */
	ImageIcon aicon;

	/**
	 * @uml.property  name="bicon"
	 * @uml.associationEnd  
	 */
	ImageIcon bicon;

	/**
	 * @uml.property  name="cicon"
	 * @uml.associationEnd  
	 */
	ImageIcon cicon;

	/**
	 * @uml.property  name="dicon"
	 * @uml.associationEnd  
	 */
	ImageIcon dicon;

	/**
	 * @uml.property  name="eicon"
	 * @uml.associationEnd  
	 */
	ImageIcon eicon;

	/**
	 * @uml.property  name="ficon"
	 * @uml.associationEnd  
	 */
	ImageIcon ficon;

	/**
	 * @uml.property  name="gicon"
	 * @uml.associationEnd  
	 */
	ImageIcon gicon;
	/**
	 * @uml.property  name="hicon"
	 * @uml.associationEnd  
	 */
	ImageIcon hicon;

	/**
	 * @uml.property  name="iicon"
	 * @uml.associationEnd  
	 */
	ImageIcon iicon;

	/**
	 * @uml.property  name="jicon"
	 * @uml.associationEnd  
	 */
	ImageIcon jicon;

	/**
	 * @uml.property  name="kicon"
	 * @uml.associationEnd  
	 */
	ImageIcon kicon;

	/**
	 * @uml.property  name="licon"
	 * @uml.associationEnd  
	 */
	ImageIcon licon;

	/**
	 * @uml.property  name="micon"
	 * @uml.associationEnd  
	 */
	ImageIcon micon;

	/**
	 * @uml.property  name="nicon"
	 * @uml.associationEnd  
	 */
	ImageIcon nicon;
	/**
	 * @uml.property  name="oicon"
	 * @uml.associationEnd  
	 */
	ImageIcon oicon;

	/**
	 * @uml.property  name="picon"
	 * @uml.associationEnd  
	 */
	ImageIcon picon;

	/**
	 * @uml.property  name="qicon"
	 * @uml.associationEnd  
	 */
	ImageIcon qicon;

	/**
	 * @uml.property  name="ricon"
	 * @uml.associationEnd  
	 */
	ImageIcon ricon;

	/**
	 * @uml.property  name="sicon"
	 * @uml.associationEnd  
	 */
	ImageIcon sicon;

	/**
	 * @uml.property  name="ticon"
	 * @uml.associationEnd  
	 */
	ImageIcon ticon;

	/**
	 * @uml.property  name="uicon"
	 * @uml.associationEnd  
	 */
	ImageIcon uicon;
	/**
	 * @uml.property  name="vicon"
	 * @uml.associationEnd  
	 */
	ImageIcon vicon;

	/**
	 * @uml.property  name="wicon"
	 * @uml.associationEnd  
	 */
	ImageIcon wicon;

	/**
	 * @uml.property  name="xicon"
	 * @uml.associationEnd  
	 */
	ImageIcon xicon;

	/**
	 * @uml.property  name="yicon"
	 * @uml.associationEnd  
	 */
	ImageIcon yicon;

	/**
	 * @uml.property  name="zicon"
	 * @uml.associationEnd  
	 */
	ImageIcon zicon;

	/**
	 * @uml.property  name="panel"
	 * @uml.associationEnd  
	 */
	public JPanel panel;

	public ABCView() {
		// Lay the components   
		panel = new JPanel() {

			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				Image backgroundImage = null;
				try {
					backgroundImage = ImageIO.read(new File("res/image/ABCImage.jpg"));
				} catch (IOException e) {
					e.printStackTrace();
				}
				g.drawImage(backgroundImage, 0, 0, this);
				Graphics2D myGraphics = (Graphics2D) g;
			}
		};


		// create the buttons


		try {
			Image menuImage = ImageIO.read(new File("res/image/menu.png"));
			Image startImage = ImageIO.read(new File("res/image/StartButton.png"));

			Image aImage = ImageIO.read(new File("res/images/A.png"));
			Image bImage = ImageIO.read(new File("res/images/B.png"));
			Image cImage = ImageIO.read(new File("res/images/C.png"));
			Image dImage = ImageIO.read(new File("res/images/D.png"));
			Image eImage = ImageIO.read(new File("res/images/E.png"));
			Image fImage = ImageIO.read(new File("res/images/F.png"));
			Image gImage = ImageIO.read(new File("res/images/G.png"));

			Image hImage = ImageIO.read(new File("res/images/H.png"));
			Image iImage = ImageIO.read(new File("res/images/I.png"));
			Image jImage = ImageIO.read(new File("res/images/J.png"));
			Image kImage = ImageIO.read(new File("res/images/K.png"));
			Image lImage = ImageIO.read(new File("res/images/L.png"));
			Image mImage = ImageIO.read(new File("res/images/M.png"));
			Image nImage = ImageIO.read(new File("res/images/N.png"));

			Image oImage = ImageIO.read(new File("res/images/O.png"));
			Image pImage = ImageIO.read(new File("res/images/P.png"));
			Image qImage = ImageIO.read(new File("res/images/Q.png"));
			Image rImage = ImageIO.read(new File("res/images/R.png"));
			Image sImage = ImageIO.read(new File("res/images/S.png"));
			Image tImage = ImageIO.read(new File("res/images/T.png"));
			Image uImage = ImageIO.read(new File("res/images/U.png"));

			Image vImage = ImageIO.read(new File("res/images/V.png"));
			Image wImage = ImageIO.read(new File("res/images/W.png"));
			Image xImage = ImageIO.read(new File("res/images/X.png"));
			Image yImage = ImageIO.read(new File("res/images/Y.png"));
			Image zImage = ImageIO.read(new File("res/images/Z.png"));

			Image nextImage = ImageIO.read(new File("res/image/Next.png"));
			Image stopImage = ImageIO.read(new File("res/image/Stop.png"));

			menuicon = new ImageIcon(menuImage);
			starticon = new ImageIcon (startImage);
			stopicon = new ImageIcon (stopImage);

			aicon = new ImageIcon(aImage);
			bicon = new ImageIcon(bImage);
			cicon = new ImageIcon(cImage);
			dicon = new ImageIcon(dImage);
			eicon = new ImageIcon(eImage);
			ficon = new ImageIcon(fImage);
			gicon = new ImageIcon(gImage);

			hicon = new ImageIcon(hImage);
			iicon = new ImageIcon(iImage);
			jicon = new ImageIcon(jImage);
			kicon = new ImageIcon(kImage);
			licon = new ImageIcon(lImage);
			micon = new ImageIcon(mImage);
			nicon = new ImageIcon(nImage);

			oicon = new ImageIcon(oImage);
			picon = new ImageIcon(pImage);
			qicon = new ImageIcon(qImage);
			ricon = new ImageIcon(rImage);
			sicon = new ImageIcon(sImage);
			ticon = new ImageIcon(tImage);
			uicon = new ImageIcon(uImage);

			vicon = new ImageIcon(vImage);
			wicon = new ImageIcon(wImage);
			xicon = new ImageIcon(xImage);
			yicon = new ImageIcon(yImage);
			zicon = new ImageIcon(zImage);

			nexticon = new ImageIcon(nextImage);


		} catch (IOException e) {
			e.printStackTrace();
		}
		menuButton= new JButton("",menuicon);
		startButton = new JButton ("",starticon);
		stopButton = new JButton("",stopicon);
		menuButton.setBorder(BorderFactory.createEmptyBorder());
		menuButton.setActionCommand(Resources.MENUSOUND);
		menuButton.setContentAreaFilled(false);
		startButton.setBorder(BorderFactory.createEmptyBorder());
		startButton.setContentAreaFilled(false);
		stopButton.setBorder(BorderFactory.createEmptyBorder());
		stopButton.setContentAreaFilled(false);

		aButton = new JButton("",aicon);
		aButton.setBackground(Color.ORANGE);
		bButton = new JButton("",bicon);
		bButton.setBackground(Color.ORANGE);
		cButton = new JButton("",cicon);
		cButton.setBackground(Color.ORANGE);
		dButton = new JButton("",dicon);
		dButton.setBackground(Color.ORANGE);
		eButton = new JButton("",eicon); 
		eButton.setBackground(Color.ORANGE);
		fButton = new JButton("",ficon);
		fButton.setBackground(Color.ORANGE);
		gButton = new JButton("",gicon);
		gButton.setBackground(Color.ORANGE);

		hButton = new JButton("",hicon);
		hButton.setBackground(Color.ORANGE);
		iButton = new JButton("",iicon);
		iButton.setBackground(Color.ORANGE);
		jButton = new JButton("",jicon);
		jButton.setBackground(Color.ORANGE);
		kButton = new JButton("",kicon);
		kButton.setBackground(Color.ORANGE);
		lButton = new JButton("",licon); 
		lButton.setBackground(Color.ORANGE);
		mButton = new JButton("",micon);
		mButton.setBackground(Color.ORANGE);
		nButton = new JButton("",nicon);
		nButton.setBackground(Color.ORANGE);


		oButton = new JButton("",oicon);
		oButton.setBackground(Color.ORANGE);
		pButton = new JButton("",picon);
		pButton.setBackground(Color.ORANGE);
		qButton = new JButton("",qicon);
		qButton.setBackground(Color.ORANGE);
		rButton = new JButton("",ricon);
		rButton.setBackground(Color.ORANGE);
		sButton = new JButton("",sicon); 
		sButton.setBackground(Color.ORANGE);
		tButton = new JButton("",ticon);
		tButton.setBackground(Color.ORANGE);
		uButton = new JButton("",uicon);
		uButton.setBackground(Color.ORANGE);

		vButton = new JButton("",vicon);
		vButton.setBackground(Color.ORANGE);
		wButton = new JButton("",wicon);
		wButton.setBackground(Color.ORANGE);
		xButton = new JButton("",xicon);
		xButton.setBackground(Color.ORANGE);
		yButton = new JButton("",yicon);
		yButton.setBackground(Color.ORANGE);
		zButton = new JButton("",zicon); 
		zButton.setBackground(Color.ORANGE);

		nextButton= new JButton("",nexticon);
		nextButton.setBorder(BorderFactory.createEmptyBorder());
		nextButton.setContentAreaFilled(false);




		// add the buttons to the panel
		panel.add(menuButton);
		panel.add(startButton);
		panel.add(stopButton);
		panel.add(aButton);
		panel.add(bButton);
		panel.add(cButton);
		panel.add(dButton);
		panel.add(eButton);
		panel.add(fButton);
		panel.add(gButton);

		panel.add(hButton);
		panel.add(iButton);
		panel.add(jButton);
		panel.add(kButton);
		panel.add(lButton);
		panel.add(mButton);
		panel.add(nButton);

		panel.add(oButton);
		panel.add(pButton);
		panel.add(qButton);
		panel.add(rButton);
		panel.add(sButton);
		panel.add(tButton);
		panel.add(uButton);

		panel.add(vButton);
		panel.add(wButton);
		panel.add(xButton);
		panel.add(yButton);
		panel.add(zButton);

		panel.add(nextButton);

		// add the panel to this window

		stopButton.hide();
		panel.setFocusable(true);
		panel.addKeyListener(new KeyEventHandler());
		setContentPane(panel);
		panel.setOpaque(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(Resources.WINDOWWIDTH, Resources.WINDOWHEIGHT);
		setTitle("ABC Train");
		setResizable(false);
		panel.setVisible(true);

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

	// add a listener to the A button
	public void addAListener(ActionListener listener) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		aButton.addActionListener(listener); 
	}

	// add a listener to the B button
	public void addBListener(ActionListener listener) {
		bButton.addActionListener(listener);
	}
	//add a listener to the C button
	public void addCListener(ActionListener listener) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		cButton.addActionListener(listener);
	}

	// add a listener to the D button
	public void addDListener(ActionListener listener) {
		dButton.addActionListener(listener);
	}

	//add a listener to the E button
	public void addEListener(ActionListener listener) {
		eButton.addActionListener(listener);
	}
	//add a listener to the F button
	public void addFListener(ActionListener listener) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		fButton.addActionListener(listener);
	}

	// add a listener to the G button
	public void addGListener(ActionListener listener) {
		gButton.addActionListener(listener);
	}

	//add a listener to the H button
	public void addHListener(ActionListener listener) {
		hButton.addActionListener(listener);
	}

	//add a listener to the I button
	public void addIListener(ActionListener listener) {
		iButton.addActionListener(listener);
	}
	//add a listener to the J button
	public void addJListener(ActionListener listener) {
		jButton.addActionListener(listener);
	}
	//add a listener to the K button
	public void addKListener(ActionListener listener) {
		kButton.addActionListener(listener);
	}
	//add a listener to the L button
	public void addLListener(ActionListener listener) {
		lButton.addActionListener(listener);
	}
	//add a listener to the M button
	public void addMListener(ActionListener listener) {
		mButton.addActionListener(listener);
	}
	//add a listener to the N button
	public void addNListener(ActionListener listener) {
		nButton.addActionListener(listener);
	}
	//add a listener to the O button
	public void addOListener(ActionListener listener) {
		oButton.addActionListener(listener);
	}
	//add a listener to the P button
	public void addPListener(ActionListener listener) {
		pButton.addActionListener(listener);
	}
	//add a listener to the Q button
	public void addQListener(ActionListener listener) {
		qButton.addActionListener(listener);
	}
	//add a listener to the R button
	public void addRListener(ActionListener listener) {
		rButton.addActionListener(listener);
	}
	//add a listener to the S button
	public void addSListener(ActionListener listener) {
		sButton.addActionListener(listener);
	}
	//add a listener to the T button
	public void addTListener(ActionListener listener) {
		tButton.addActionListener(listener);
	}
	//add a listener to the U button
	public void addUListener(ActionListener listener) {
		uButton.addActionListener(listener);
	}
	//add a listener to the V button
	public void addVListener(ActionListener listener) {
		vButton.addActionListener(listener);
	}
	//add a listener to the W button
	public void addWListener(ActionListener listener) {
		wButton.addActionListener(listener);
	}
	//add a listener to the X button
	public void addXListener(ActionListener listener) {
		xButton.addActionListener(listener);
	}
	//add a listener to the Y button
	public void addYListener(ActionListener listener) {
		yButton.addActionListener(listener);
	}
	//add a listener to the Z button
	public void addZListener(ActionListener listener) {
		zButton.addActionListener(listener);
	}

	//add a listener to the Next button
	public void addNextListener(ActionListener listener) {
		nextButton.addActionListener(listener);
		nextButton.setActionCommand(Resources.NEXTSOUND);
	}

}
