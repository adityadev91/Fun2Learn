/**
 * @description This package holds all the Puzzle files for OOADP Project
 */
package puzzleproject;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author adityadev
 *
 */
public class PuzzlePanel {
	
	/**
	 * Constructor that initializes buttons on the panel
	 */
	public PuzzlePanel() {
		//Define and initialize window components 
		JFrame window = new JFrame("Puzzles");
		JPanel panel = new JPanel(new GridLayout(Resources.panelrows, Resources.panelcols, Resources.HGAP, Resources.VGAP));
		try {
			BufferedImage bufImgA = ImageIO.read(new File(Resources.IMAGE_A));
			BufferedImage bufImgB = ImageIO.read(new File(Resources.IMAGE_B));
			BufferedImage bufImgC = ImageIO.read(new File(Resources.IMAGE_C));
			BufferedImage bufImgD = ImageIO.read(new File(Resources.IMAGE_D));
			BufferedImage bufImgE = ImageIO.read(new File(Resources.IMAGE_E));
			BufferedImage bufImgF = ImageIO.read(new File(Resources.IMAGE_F));
			BufferedImage bufImgG = ImageIO.read(new File(Resources.IMAGE_G));
			BufferedImage bufImgH = ImageIO.read(new File(Resources.IMAGE_H));
			BufferedImage bufImgI = ImageIO.read(new File(Resources.IMAGE_I));
			BufferedImage bufImgJ = ImageIO.read(new File(Resources.IMAGE_J));
			BufferedImage bufImgK = ImageIO.read(new File(Resources.IMAGE_K));
			BufferedImage bufImgL = ImageIO.read(new File(Resources.IMAGE_L));
			BufferedImage bufImgM = ImageIO.read(new File(Resources.IMAGE_M));
			BufferedImage bufImgN = ImageIO.read(new File(Resources.IMAGE_N));
			BufferedImage bufImgO = ImageIO.read(new File(Resources.IMAGE_O));
			BufferedImage bufImgP = ImageIO.read(new File(Resources.IMAGE_P));
			BufferedImage bufImgQ = ImageIO.read(new File(Resources.IMAGE_Q));
			BufferedImage bufImgR = ImageIO.read(new File(Resources.IMAGE_R));
			BufferedImage bufImgS = ImageIO.read(new File(Resources.IMAGE_S));
			BufferedImage bufImgT = ImageIO.read(new File(Resources.IMAGE_T));
			BufferedImage bufImgU = ImageIO.read(new File(Resources.IMAGE_U));
			BufferedImage bufImgV = ImageIO.read(new File(Resources.IMAGE_V));
			BufferedImage bufImgW = ImageIO.read(new File(Resources.IMAGE_W));
			BufferedImage bufImgX = ImageIO.read(new File(Resources.IMAGE_X));
			BufferedImage bufImgY = ImageIO.read(new File(Resources.IMAGE_Y));
			BufferedImage bufImgZ = ImageIO.read(new File(Resources.IMAGE_Z));

			Resources.buttonA = new JButton(new ImageIcon(bufImgA));
			Resources.buttonA.setBorder(BorderFactory.createEmptyBorder());
			Resources.buttonA.setContentAreaFilled(false);
			Resources.buttonB = new JButton(new ImageIcon(bufImgB));
			Resources.buttonB.setBorder(BorderFactory.createEmptyBorder());
			Resources.buttonB.setContentAreaFilled(false);
			Resources.buttonC = new JButton(new ImageIcon(bufImgC));
			Resources.buttonC.setBorder(BorderFactory.createEmptyBorder());
			Resources.buttonC.setContentAreaFilled(false);
			Resources.buttonD = new JButton(new ImageIcon(bufImgD));
			Resources.buttonD.setBorder(BorderFactory.createEmptyBorder());
			Resources.buttonD.setContentAreaFilled(false);
			Resources.buttonE = new JButton(new ImageIcon(bufImgE));
			Resources.buttonE.setBorder(BorderFactory.createEmptyBorder());
			Resources.buttonE.setContentAreaFilled(false);
			Resources.buttonF = new JButton(new ImageIcon(bufImgF));
			Resources.buttonF.setBorder(BorderFactory.createEmptyBorder());
			Resources.buttonF.setContentAreaFilled(false);
			Resources.buttonG = new JButton(new ImageIcon(bufImgG));
			Resources.buttonG.setBorder(BorderFactory.createEmptyBorder());
			Resources.buttonG.setContentAreaFilled(false);
			Resources.buttonH = new JButton(new ImageIcon(bufImgH));
			Resources.buttonH.setBorder(BorderFactory.createEmptyBorder());
			Resources.buttonH.setContentAreaFilled(false);
			Resources.buttonI = new JButton(new ImageIcon(bufImgI));
			Resources.buttonI.setBorder(BorderFactory.createEmptyBorder());
			Resources.buttonI.setContentAreaFilled(false);
			Resources.buttonJ = new JButton(new ImageIcon(bufImgJ));
			Resources.buttonJ.setBorder(BorderFactory.createEmptyBorder());
			Resources.buttonJ.setContentAreaFilled(false);
			Resources.buttonK = new JButton(new ImageIcon(bufImgK));
			Resources.buttonK.setBorder(BorderFactory.createEmptyBorder());
			Resources.buttonK.setContentAreaFilled(false);
			Resources.buttonL = new JButton(new ImageIcon(bufImgL));
			Resources.buttonL.setBorder(BorderFactory.createEmptyBorder());
			Resources.buttonL.setContentAreaFilled(false);
			Resources.buttonM = new JButton(new ImageIcon(bufImgM));
			Resources.buttonM.setBorder(BorderFactory.createEmptyBorder());
			Resources.buttonM.setContentAreaFilled(false);
			Resources.buttonN = new JButton(new ImageIcon(bufImgN));
			Resources.buttonN.setBorder(BorderFactory.createEmptyBorder());
			Resources.buttonN.setContentAreaFilled(false);
			Resources.buttonO = new JButton(new ImageIcon(bufImgO));
			Resources.buttonO.setBorder(BorderFactory.createEmptyBorder());
			Resources.buttonO.setContentAreaFilled(false);
			Resources.buttonP = new JButton(new ImageIcon(bufImgP));
			Resources.buttonP.setBorder(BorderFactory.createEmptyBorder());
			Resources.buttonP.setContentAreaFilled(false);
			Resources.buttonQ = new JButton(new ImageIcon(bufImgQ));
			Resources.buttonQ.setBorder(BorderFactory.createEmptyBorder());
			Resources.buttonQ.setContentAreaFilled(false);
			Resources.buttonR = new JButton(new ImageIcon(bufImgR));
			Resources.buttonR.setBorder(BorderFactory.createEmptyBorder());
			Resources.buttonR.setContentAreaFilled(false);
			Resources.buttonS = new JButton(new ImageIcon(bufImgS));
			Resources.buttonS.setBorder(BorderFactory.createEmptyBorder());
			Resources.buttonS.setContentAreaFilled(false);
			Resources.buttonT = new JButton(new ImageIcon(bufImgT));
			Resources.buttonT.setBorder(BorderFactory.createEmptyBorder());
			Resources.buttonT.setContentAreaFilled(false);
			Resources.buttonU = new JButton(new ImageIcon(bufImgU));
			Resources.buttonU.setBorder(BorderFactory.createEmptyBorder());
			Resources.buttonU.setContentAreaFilled(false);
			Resources.buttonV = new JButton(new ImageIcon(bufImgV));
			Resources.buttonV.setBorder(BorderFactory.createEmptyBorder());
			Resources.buttonV.setContentAreaFilled(false);
			Resources.buttonW = new JButton(new ImageIcon(bufImgW));
			Resources.buttonW.setBorder(BorderFactory.createEmptyBorder());
			Resources.buttonW.setContentAreaFilled(false);
			Resources.buttonX = new JButton(new ImageIcon(bufImgX));
			Resources.buttonX.setBorder(BorderFactory.createEmptyBorder());
			Resources.buttonX.setContentAreaFilled(false);
			Resources.buttonY = new JButton(new ImageIcon(bufImgY));
			Resources.buttonY.setBorder(BorderFactory.createEmptyBorder());
			Resources.buttonY.setContentAreaFilled(false);
			Resources.buttonZ = new JButton(new ImageIcon(bufImgZ));
			Resources.buttonZ.setBorder(BorderFactory.createEmptyBorder());
			Resources.buttonZ.setContentAreaFilled(false);

			//Add listener
			ActionClass actionEvent = new ActionClass();

			Resources.buttonA.addActionListener(actionEvent);
			Resources.buttonB.addActionListener(actionEvent);
			Resources.buttonC.addActionListener(actionEvent);
			Resources.buttonD.addActionListener(actionEvent);
			Resources.buttonE.addActionListener(actionEvent);
			Resources.buttonF.addActionListener(actionEvent);
			Resources.buttonG.addActionListener(actionEvent);
			Resources.buttonH.addActionListener(actionEvent);
			Resources.buttonI.addActionListener(actionEvent);
			Resources.buttonJ.addActionListener(actionEvent);
			Resources.buttonK.addActionListener(actionEvent);
			Resources.buttonL.addActionListener(actionEvent);
			Resources.buttonM.addActionListener(actionEvent);
			Resources.buttonN.addActionListener(actionEvent);
			Resources.buttonO.addActionListener(actionEvent);
			Resources.buttonP.addActionListener(actionEvent);
			Resources.buttonQ.addActionListener(actionEvent);
			Resources.buttonR.addActionListener(actionEvent);
			Resources.buttonS.addActionListener(actionEvent);
			Resources.buttonT.addActionListener(actionEvent);
			Resources.buttonU.addActionListener(actionEvent);
			Resources.buttonV.addActionListener(actionEvent);
			Resources.buttonW.addActionListener(actionEvent);
			Resources.buttonX.addActionListener(actionEvent);
			Resources.buttonY.addActionListener(actionEvent);
			Resources.buttonZ.addActionListener(actionEvent);

			Resources.buttonA.setActionCommand(Resources.SOUNDA);
			Resources.buttonB.setActionCommand(Resources.SOUNDB);
			Resources.buttonC.setActionCommand(Resources.SOUNDC);
			Resources.buttonD.setActionCommand(Resources.SOUNDD);
			Resources.buttonE.setActionCommand(Resources.SOUNDE);
			Resources.buttonF.setActionCommand(Resources.SOUNDF);
			Resources.buttonG.setActionCommand(Resources.SOUNDG);
			Resources.buttonH.setActionCommand(Resources.SOUNDH);
			Resources.buttonI.setActionCommand(Resources.SOUNDI);
			Resources.buttonJ.setActionCommand(Resources.SOUNDJ);
			Resources.buttonK.setActionCommand(Resources.SOUNDK);
			Resources.buttonL.setActionCommand(Resources.SOUNDL);
			Resources.buttonM.setActionCommand(Resources.SOUNDM);
			Resources.buttonN.setActionCommand(Resources.SOUNDN);
			Resources.buttonO.setActionCommand(Resources.SOUNDO);
			Resources.buttonP.setActionCommand(Resources.SOUNDP);
			Resources.buttonQ.setActionCommand(Resources.SOUNDQ);
			Resources.buttonR.setActionCommand(Resources.SOUNDR);
			Resources.buttonS.setActionCommand(Resources.SOUNDS);
			Resources.buttonT.setActionCommand(Resources.SOUNDT);
			Resources.buttonU.setActionCommand(Resources.SOUNDU);
			Resources.buttonV.setActionCommand(Resources.SOUNDV);
			Resources.buttonW.setActionCommand(Resources.SOUNDW);
			Resources.buttonX.setActionCommand(Resources.SOUNDX);
			Resources.buttonY.setActionCommand(Resources.SOUNDY);
			Resources.buttonZ.setActionCommand(Resources.SOUNDZ);


			//Add Content to Panel
			panel.add(Resources.buttonA, BorderLayout.CENTER);
			panel.add(Resources.buttonB, BorderLayout.CENTER);
			panel.add(Resources.buttonC, BorderLayout.CENTER);
			panel.add(Resources.buttonD, BorderLayout.CENTER);
			panel.add(Resources.buttonE, BorderLayout.CENTER);
			panel.add(Resources.buttonF, BorderLayout.CENTER);
			panel.add(Resources.buttonG, BorderLayout.CENTER);
			panel.add(Resources.buttonH, BorderLayout.CENTER);
			panel.add(Resources.buttonI, BorderLayout.CENTER);
			panel.add(Resources.buttonJ, BorderLayout.CENTER);
			panel.add(Resources.buttonK, BorderLayout.CENTER);
			panel.add(Resources.buttonL, BorderLayout.CENTER);
			panel.add(Resources.buttonM, BorderLayout.CENTER);
			panel.add(Resources.buttonN, BorderLayout.CENTER);
			panel.add(Resources.buttonO, BorderLayout.CENTER);
			panel.add(Resources.buttonP, BorderLayout.CENTER);
			panel.add(Resources.buttonQ, BorderLayout.CENTER);
			panel.add(Resources.buttonR, BorderLayout.CENTER);
			panel.add(Resources.buttonS, BorderLayout.CENTER);
			panel.add(Resources.buttonT, BorderLayout.CENTER);
			panel.add(Resources.buttonU, BorderLayout.CENTER);
			panel.add(Resources.buttonV, BorderLayout.CENTER);
			panel.add(Resources.buttonW, BorderLayout.CENTER);
			panel.add(Resources.buttonX, BorderLayout.CENTER);
			panel.add(Resources.buttonY, BorderLayout.CENTER);
			panel.add(Resources.buttonZ, BorderLayout.CENTER);

			//Add Panel to Window
			window.setContentPane(panel);
			window.pack();
			//window.setSize(windowwidth,windowheight);
			window.setVisible(true);
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}


	public static void main(String[] args) {
		new PuzzlePanel();
	}
}
