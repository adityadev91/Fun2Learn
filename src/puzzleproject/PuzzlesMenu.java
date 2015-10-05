package puzzleproject;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 * @author adityadev
 *
 */
class PuzzlesMenu {
	/**
	 * 
	 */
	public PuzzlesMenu() {
		createPanel();
		createMenu();
	}

	private void createPanel() {
		JFrame window = new JFrame("Puzzle Menu");
		JPanel panel = new JPanel(new GridLayout(Resources.panelrows, Resources.panelcols, Resources.HGAP, Resources.VGAP));
		
		//Add Panel to Window
		window.setContentPane(panel);
		window.pack();
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	private void createMenu() {
		
	}

	public static void main(String[] args) {
		new PuzzlesMenu();
	}

}