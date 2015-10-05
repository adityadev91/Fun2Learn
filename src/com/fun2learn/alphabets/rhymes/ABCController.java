package com.fun2learn.alphabets.rhymes;



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

import puzzleproject.Resources;

import com.fun2learn.alphabets.Train;

public class ABCController  implements  ActionListener {
  /**
 * @uml.property  name="view"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
private ABCView view;
Clip clip = null;
	
  public ABCController(ABCView v) throws  IOException, LineUnavailableException, UnsupportedAudioFileException {

    view = v;
 
	 
    view.addMenuListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
    	MainController.playAudio(e.getActionCommand());
    	      view.setVisible(false);
    	      view.dispose();
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
    });
    
    view.addStartListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			view.menuButton.hide();
			view.nextButton.hide();
			view.startButton.hide();
			view.stopButton.show();
			AudioInputStream fis = null;
			try {
				fis = AudioSystem.getAudioInputStream(new File("res/audio-alphabet/AlphabetSongFile.wav").getAbsoluteFile());
			} catch (UnsupportedAudioFileException | IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	                AudioInputStream ais = AudioSystem.getAudioInputStream(
	                 AudioFormat.Encoding.PCM_SIGNED,fis);
					try {
						clip = AudioSystem.getClip();
					} catch (LineUnavailableException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	                
	                try {
						clip.open(ais);
					} catch (LineUnavailableException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	                FloatControl gainControl = 
	                	    (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
	                	gainControl.setValue(6.0f); // increase volume by 6 decibels.
	                clip.start();
	                view.panel.requestFocusInWindow();
			
		}
	});
    
    view.addStopListener(new ActionListener(){
    	public void actionPerformed(ActionEvent e) {
    		if(clip.isRunning()){
    			clip.stop();
    			view.menuButton.show();
    			view.nextButton.show();
    			view.startButton.show();
    			view.stopButton.hide();
    			
    		}
    		
    	
    }
  });
	
    view.addNextListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        	MainController.playAudio(Resources.NEXTSOUND);
        	      view.setVisible(false);
        	      view.dispose();
        	      Vehicle train = new Train();
      		      TrainView v = new TrainView(train);
      		      try {
					TrainController ct = new TrainController(train, v);
				} catch (UnsupportedAudioFileException | IOException
						| LineUnavailableException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
      		     v.setVisible(true);
      		     
        	    }
        });
    view.addAListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
    	 try 
    	    { 
    	    	 AudioInputStream fis =
    	    			 AudioSystem.getAudioInputStream(new File("res/audio-alphabet/A.wav").getAbsoluteFile());
    	                AudioInputStream ais = AudioSystem.getAudioInputStream(
    	                 AudioFormat.Encoding.PCM_SIGNED,fis);
    	                Clip clip = AudioSystem.getClip();
    	                
    	                clip.open(ais);
    	                FloatControl gainControl = 
    	                	    (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
    	                	gainControl.setValue(6.0f); // increase volume by 6 decibels.
    	                clip.start();
    	                view.panel.requestFocusInWindow();
    	    }
    	    catch(Exception ex)
    	    {
    	      System.out.println("Error with playing sound A.");
    	      ex.printStackTrace( );
    	    }
     
    }
  });
  
    view.addBListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
    	  try 
  	    {
  	    	 AudioInputStream fis =
  	    			 AudioSystem.getAudioInputStream(new File("res/audio-alphabet/B.wav").getAbsoluteFile());
  	                AudioInputStream ais = AudioSystem.getAudioInputStream(
  	                 AudioFormat.Encoding.PCM_SIGNED,fis);
  	                Clip clip = AudioSystem.getClip();
  	                clip.open(ais);
  	              FloatControl gainControl = 
	                	    (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
	                	gainControl.setValue(6.0f); // increase volume by 6 decibels.
  	                clip.start();
  	              view.panel.requestFocusInWindow();
  	    }
  	    catch(Exception ex)
  	    {
  	      System.out.println("Error with playing sound B.");
  	      ex.printStackTrace( );
  	    }
      }
    });	
 

  view.addCListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
    	  try 
  	    {
  	    	 AudioInputStream fis =
  	    			 AudioSystem.getAudioInputStream(new File("res/audio-alphabet/C.wav").getAbsoluteFile());
  	                AudioInputStream ais = AudioSystem.getAudioInputStream(
  	                 AudioFormat.Encoding.PCM_SIGNED,fis);
  	                Clip clip = AudioSystem.getClip();
  	                clip.open(ais);
  	              FloatControl gainControl = 
	                	    (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
	                	gainControl.setValue(6.0f); // increase volume by 6 decibels.
  	                clip.start();
  	              view.panel.requestFocusInWindow();
  	    }
  	    catch(Exception ex)
  	    {
  	      System.out.println("Error with playing sound C.");
  	      ex.printStackTrace( );
  	    }
      }
    });	
 

 view.addDListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
  	  try 
	    {
	    	 AudioInputStream fis =
	    			 AudioSystem.getAudioInputStream(new File("res/audio-alphabet/D.wav").getAbsoluteFile());
	                AudioInputStream ais = AudioSystem.getAudioInputStream(
	                 AudioFormat.Encoding.PCM_SIGNED,fis);
	                Clip clip = AudioSystem.getClip();
	                clip.open(ais);
	                FloatControl gainControl = 
	                	    (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
	                	gainControl.setValue(6.0f); // increase volume by 6 decibels.
	                clip.start();
	                view.panel.requestFocusInWindow();
	    }
	    catch(Exception ex)
	    {
	      System.out.println("Error with playing sound D.");
	      ex.printStackTrace( );
	    }
    }
  });	


view.addEListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
  	  try 
	    {
	    	 AudioInputStream fis =
	    			 AudioSystem.getAudioInputStream(new File("res/audio-alphabet/E.wav").getAbsoluteFile());
	                AudioInputStream ais = AudioSystem.getAudioInputStream(
	                 AudioFormat.Encoding.PCM_SIGNED,fis);
	                Clip clip = AudioSystem.getClip();
	                clip.open(ais);
	                FloatControl gainControl = 
	                	    (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
	                	gainControl.setValue(6.0f); // increase volume by 6 decibels.
	                clip.start();
	                view.panel.requestFocusInWindow();
	    }
	    catch(Exception ex)
	    {
	      System.out.println("Error with playing sound E.");
	      ex.printStackTrace( );
	    }
    }
  });	


view.addFListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
  	  try 
	    {
	    	 AudioInputStream fis =
	    			 AudioSystem.getAudioInputStream(new File("res/audio-alphabet/F.wav").getAbsoluteFile());
	                AudioInputStream ais = AudioSystem.getAudioInputStream(
	                 AudioFormat.Encoding.PCM_SIGNED,fis);
	                Clip clip = AudioSystem.getClip();
	                clip.open(ais);
	                FloatControl gainControl = 
	                	    (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
	                	gainControl.setValue(6.0f); // increase volume by 6 decibels.
	                clip.start();
	                view.panel.requestFocusInWindow();
	    }
	    catch(Exception ex)
	    {
	      System.out.println("Error with playing sound F.");
	      ex.printStackTrace( );
	    }
    }
  });	


view.addGListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
  	  try 
	    {
	    	 AudioInputStream fis =
	    			 AudioSystem.getAudioInputStream(new File("res/audio-alphabet/G.wav").getAbsoluteFile());
	                AudioInputStream ais = AudioSystem.getAudioInputStream(
	                 AudioFormat.Encoding.PCM_SIGNED,fis);
	                Clip clip = AudioSystem.getClip();
	                clip.open(ais);
	                FloatControl gainControl = 
	                	    (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
	                	gainControl.setValue(6.0f); // increase volume by 6 decibels.
	                clip.start();
	                view.panel.requestFocusInWindow();
	    }
	    catch(Exception ex)
	    {
	      System.out.println("Error with playing sound G.");
	      ex.printStackTrace( );
	    }
    }
  });	

  
  view.addHListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	  	  try 
		    {
		    	 AudioInputStream fis =
		    			 AudioSystem.getAudioInputStream(new File("res/audio-alphabet/H.wav").getAbsoluteFile());
		                AudioInputStream ais = AudioSystem.getAudioInputStream(
		                 AudioFormat.Encoding.PCM_SIGNED,fis);
		                Clip clip = AudioSystem.getClip();
		                clip.open(ais);
		                FloatControl gainControl = 
		                	    (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
		                	gainControl.setValue(6.0f); // increase volume by 6 decibels.
		                clip.start();
		                view.panel.requestFocusInWindow();
		    }
		    catch(Exception ex)
		    {
		      System.out.println("Error with playing sound H.");
		      ex.printStackTrace( );
		    }
	    }
	  });	

view.addIListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
  	  try 
	    {
	    	 AudioInputStream fis =
	    			 AudioSystem.getAudioInputStream(new File("res/audio-alphabet/I.wav").getAbsoluteFile());
	                AudioInputStream ais = AudioSystem.getAudioInputStream(
	                 AudioFormat.Encoding.PCM_SIGNED,fis);
	                Clip clip = AudioSystem.getClip();
	                clip.open(ais);
	                FloatControl gainControl = 
	                	    (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
	                	gainControl.setValue(6.0f); // increase volume by 6 decibels.
	                clip.start();
	                view.panel.requestFocusInWindow();
	    }
	    catch(Exception ex)
	    {
	      System.out.println("Error with playing sound I.");
	      ex.printStackTrace( );
	    }
    }
  });	

view.addJListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
  	  try 
	    {
	    	 AudioInputStream fis =
	    			 AudioSystem.getAudioInputStream(new File("res/audio-alphabet/J.wav").getAbsoluteFile());
	                AudioInputStream ais = AudioSystem.getAudioInputStream(
	                 AudioFormat.Encoding.PCM_SIGNED,fis);
	                Clip clip = AudioSystem.getClip();
	                clip.open(ais);
	                FloatControl gainControl = 
	                	    (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
	                	gainControl.setValue(6.0f); // increase volume by 6 decibels.
	                clip.start();
	                view.panel.requestFocusInWindow();
	    }
	    catch(Exception ex)
	    {
	      System.out.println("Error with playing sound J.");
	      ex.printStackTrace( );
	    }
    }
  });	

view.addKListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
  	  try 
	    {
	    	 AudioInputStream fis =
	    			 AudioSystem.getAudioInputStream(new File("res/audio-alphabet/K.wav").getAbsoluteFile());
	                AudioInputStream ais = AudioSystem.getAudioInputStream(
	                 AudioFormat.Encoding.PCM_SIGNED,fis);
	                Clip clip = AudioSystem.getClip();
	                clip.open(ais);
	                FloatControl gainControl = 
	                	    (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
	                	gainControl.setValue(6.0f); // increase volume by 6 decibels.
	                clip.start();
	                view.panel.requestFocusInWindow();
	    }
	    catch(Exception ex)
	    {
	      System.out.println("Error with playing sound K.");
	      ex.printStackTrace( );
	    }
    }
  });	

view.addLListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
  	  try 
	    {
	    	 AudioInputStream fis =
	    			 AudioSystem.getAudioInputStream(new File("res/audio-alphabet/L.wav").getAbsoluteFile());
	                AudioInputStream ais = AudioSystem.getAudioInputStream(
	                 AudioFormat.Encoding.PCM_SIGNED,fis);
	                Clip clip = AudioSystem.getClip();
	                clip.open(ais);
	                FloatControl gainControl = 
	                	    (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
	                	gainControl.setValue(6.0f); // increase volume by 6 decibels.
	                clip.start();
	                view.panel.requestFocusInWindow();
	    }
	    catch(Exception ex)
	    {
	      System.out.println("Error with playing sound L.");
	      ex.printStackTrace( );
	    }
    }
  });	

view.addMListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
  	  try 
	    {
	    	 AudioInputStream fis =
	    			 AudioSystem.getAudioInputStream(new File("res/audio-alphabet/M.wav").getAbsoluteFile());
	                AudioInputStream ais = AudioSystem.getAudioInputStream(
	                 AudioFormat.Encoding.PCM_SIGNED,fis);
	                Clip clip = AudioSystem.getClip();
	                clip.open(ais);
	                FloatControl gainControl = 
	                	    (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
	                	gainControl.setValue(6.0f); // increase volume by 6 decibels.
	                clip.start();
	                view.panel.requestFocusInWindow();
	    }
	    catch(Exception ex)
	    {
	      System.out.println("Error with playing sound M.");
	      ex.printStackTrace( );
	    }
    }
  });	

view.addNListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
  	  try 
	    {
	    	 AudioInputStream fis =
	    			 AudioSystem.getAudioInputStream(new File("res/audio-alphabet/N.wav").getAbsoluteFile());
	                AudioInputStream ais = AudioSystem.getAudioInputStream(
	                 AudioFormat.Encoding.PCM_SIGNED,fis);
	                Clip clip = AudioSystem.getClip();
	                clip.open(ais);
	                FloatControl gainControl = 
	                	    (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
	                	gainControl.setValue(6.0f); // increase volume by 6 decibels.
	                clip.start();
	                view.panel.requestFocusInWindow();
	    }
	    catch(Exception ex)
	    {
	      System.out.println("Error with playing sound N.");
	      ex.printStackTrace( );
	    }
    }
  });	

view.addOListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
  	  try 
	    {
	    	 AudioInputStream fis =
	    			 AudioSystem.getAudioInputStream(new File("res/audio-alphabet/O.wav").getAbsoluteFile());
	                AudioInputStream ais = AudioSystem.getAudioInputStream(
	                 AudioFormat.Encoding.PCM_SIGNED,fis);
	                Clip clip = AudioSystem.getClip();
	                clip.open(ais);
	                FloatControl gainControl = 
	                	    (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
	                	gainControl.setValue(6.0f); // increase volume by 6 decibels.
	                clip.start();
	                view.panel.requestFocusInWindow();
	    }
	    catch(Exception ex)
	    {
	      System.out.println("Error with playing sound O.");
	      ex.printStackTrace( );
	    }
    }
  });	

view.addPListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
  	  try 
	    {
	    	 AudioInputStream fis =
	    			 AudioSystem.getAudioInputStream(new File("res/audio-alphabet/P.wav").getAbsoluteFile());
	                AudioInputStream ais = AudioSystem.getAudioInputStream(
	                 AudioFormat.Encoding.PCM_SIGNED,fis);
	                Clip clip = AudioSystem.getClip();
	                clip.open(ais);
	                FloatControl gainControl = 
	                	    (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
	                	gainControl.setValue(6.0f); // increase volume by 6 decibels.
	                clip.start();
	                view.panel.requestFocusInWindow();
	    }
	    catch(Exception ex)
	    {
	      System.out.println("Error with playing sound P.");
	      ex.printStackTrace( );
	    }
    }
  });	

view.addQListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
  	  try 
	    {
	    	 AudioInputStream fis =
	    			 AudioSystem.getAudioInputStream(new File("res/audio-alphabet/Q.wav").getAbsoluteFile());
	                AudioInputStream ais = AudioSystem.getAudioInputStream(
	                 AudioFormat.Encoding.PCM_SIGNED,fis);
	                Clip clip = AudioSystem.getClip();
	                clip.open(ais);
	                FloatControl gainControl = 
	                	    (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
	                	gainControl.setValue(6.0f); // increase volume by 6 decibels.
	                clip.start();
	                view.panel.requestFocusInWindow();
	    }
	    catch(Exception ex)
	    {
	      System.out.println("Error with playing sound Q.");
	      ex.printStackTrace( );
	    }
    }
  });	

view.addRListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
  	  try 
	    {
	    	 AudioInputStream fis =
	    			 AudioSystem.getAudioInputStream(new File("res/audio-alphabet/R.wav").getAbsoluteFile());
	                AudioInputStream ais = AudioSystem.getAudioInputStream(
	                 AudioFormat.Encoding.PCM_SIGNED,fis);
	                Clip clip = AudioSystem.getClip();
	                clip.open(ais);
	                FloatControl gainControl = 
	                	    (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
	                	gainControl.setValue(6.0f); // increase volume by 6 decibels.
	                clip.start();
	                view.panel.requestFocusInWindow();
	    }
	    catch(Exception ex)
	    {
	      System.out.println("Error with playing sound R.");
	      ex.printStackTrace( );
	    }
    }
  });	

view.addSListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
  	  try 
	    {
	    	 AudioInputStream fis =
	    			 AudioSystem.getAudioInputStream(new File("res/audio-alphabet/S.wav").getAbsoluteFile());
	                AudioInputStream ais = AudioSystem.getAudioInputStream(
	                 AudioFormat.Encoding.PCM_SIGNED,fis);
	                Clip clip = AudioSystem.getClip();
	                clip.open(ais);
	                FloatControl gainControl = 
	                	    (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
	                	gainControl.setValue(6.0f); // increase volume by 6 decibels.
	                clip.start();
	                view.panel.requestFocusInWindow();
	    }
	    catch(Exception ex)
	    {
	      System.out.println("Error with playing sound S.");
	      ex.printStackTrace( );
	    }
    }
  });	

view.addTListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
  	  try 
	    {
	    	 AudioInputStream fis =
	    			 AudioSystem.getAudioInputStream(new File("res/audio-alphabet/T.wav").getAbsoluteFile());
	                AudioInputStream ais = AudioSystem.getAudioInputStream(
	                 AudioFormat.Encoding.PCM_SIGNED,fis);
	                Clip clip = AudioSystem.getClip();
	                clip.open(ais);
	                FloatControl gainControl = 
	                	    (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
	                	gainControl.setValue(6.0f); // increase volume by 6 decibels.
	                clip.start();
	                view.panel.requestFocusInWindow();
	    }
	    catch(Exception ex)
	    {
	      System.out.println("Error with playing sound T.");
	      ex.printStackTrace( );
	    }
    }
  });	

view.addUListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
  	  try 
	    {
	    	 AudioInputStream fis =
	    			 AudioSystem.getAudioInputStream(new File("res/audio-alphabet/U.wav").getAbsoluteFile());
	                AudioInputStream ais = AudioSystem.getAudioInputStream(
	                 AudioFormat.Encoding.PCM_SIGNED,fis);
	                Clip clip = AudioSystem.getClip();
	                clip.open(ais);
	                FloatControl gainControl = 
	                	    (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
	                	gainControl.setValue(6.0f); // increase volume by 6 decibels.
	                clip.start();
	                view.panel.requestFocusInWindow();
	    }
	    catch(Exception ex)
	    {
	      System.out.println("Error with playing sound U.");
	      ex.printStackTrace( );
	    }
    }
  });	

view.addVListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
  	  try 
	    {
	    	 AudioInputStream fis =
	    			 AudioSystem.getAudioInputStream(new File("res/audio-alphabet/V.wav").getAbsoluteFile());
	                AudioInputStream ais = AudioSystem.getAudioInputStream(
	                 AudioFormat.Encoding.PCM_SIGNED,fis);
	                Clip clip = AudioSystem.getClip();
	                clip.open(ais);
	                FloatControl gainControl = 
	                	    (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
	                	gainControl.setValue(6.0f); // increase volume by 6 decibels.
	                clip.start();
	                view.panel.requestFocusInWindow();
	    }
	    catch(Exception ex)
	    {
	      System.out.println("Error with playing sound V.");
	      ex.printStackTrace( );
	    }
    }
  });	

view.addWListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
  	  try 
	    {
	    	 AudioInputStream fis =
	    			 AudioSystem.getAudioInputStream(new File("res/audio-alphabet/W.wav").getAbsoluteFile());
	                AudioInputStream ais = AudioSystem.getAudioInputStream(
	                 AudioFormat.Encoding.PCM_SIGNED,fis);
	                Clip clip = AudioSystem.getClip();
	                clip.open(ais);
	                FloatControl gainControl = 
	                	    (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
	                	gainControl.setValue(6.0f); // increase volume by 6 decibels.
	                clip.start();
	                view.panel.requestFocusInWindow();
	    }
	    catch(Exception ex)
	    {
	      System.out.println("Error with playing sound W.");
	      ex.printStackTrace( );
	    }
    }
  });	

view.addXListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
  	  try 
	    {
	    	 AudioInputStream fis =
	    			 AudioSystem.getAudioInputStream(new File("res/audio-alphabet/X.wav").getAbsoluteFile());
	                AudioInputStream ais = AudioSystem.getAudioInputStream(
	                 AudioFormat.Encoding.PCM_SIGNED,fis);
	                Clip clip = AudioSystem.getClip();
	                clip.open(ais);
	                FloatControl gainControl = 
	                	    (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
	                	gainControl.setValue(6.0f); // increase volume by 6 decibels.
	                clip.start();
	                view.panel.requestFocusInWindow();
	    }
	    catch(Exception ex)
	    {
	      System.out.println("Error with playing sound X.");
	      ex.printStackTrace( );
	     
	    }
    }
  });	

view.addYListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
  	  try 
	    {
	    	 AudioInputStream fis =
	    			 AudioSystem.getAudioInputStream(new File("res/audio-alphabet/Y.wav").getAbsoluteFile());
	                AudioInputStream ais = AudioSystem.getAudioInputStream(
	                 AudioFormat.Encoding.PCM_SIGNED,fis);
	                Clip clip = AudioSystem.getClip();
	                clip.open(ais);
	                FloatControl gainControl = 
	                	    (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
	                	gainControl.setValue(6.0f); // increase volume by 6 decibels.
	                clip.start();
	                view.panel.requestFocusInWindow();
	    }
	    catch(Exception ex)
	    {
	      System.out.println("Error with playing sound Y.");
	      ex.printStackTrace( );
	     
	    }
    }
  });	

view.addZListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
  	  try 
	    {
	    	 AudioInputStream fis =
	    			 AudioSystem.getAudioInputStream(new File("res/audio-alphabet/Z.wav").getAbsoluteFile());
	                AudioInputStream ais = AudioSystem.getAudioInputStream(
	                 AudioFormat.Encoding.PCM_SIGNED,fis);
	                Clip clip = AudioSystem.getClip();
	                clip.open(ais);
	                FloatControl gainControl = 
	                	    (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
	                	gainControl.setValue(6.0f); // increase volume by 6 decibels.
	                clip.start();
	                view.panel.requestFocusInWindow();
	    }
	    catch(Exception ex)
	    {
	      System.out.println("Error with playing sound Z.");
	      ex.printStackTrace( );
	      
	    }
    }
  });	
}

  public void actionPerformed(ActionEvent e) {
    view.repaint();	
  }


}
