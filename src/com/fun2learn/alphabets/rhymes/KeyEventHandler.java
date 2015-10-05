package com.fun2learn.alphabets.rhymes;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

public class KeyEventHandler implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		switch(keyCode){
			case 65:
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
		    	    }
		    	    catch(Exception ex)
		    	    {
		    	      System.out.println("Error with playing sound A.");
		    	      ex.printStackTrace( );
		    	    }
				 break;
			case 66:
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
		    	    }
		    	    catch(Exception ex)
		    	    {
		    	      System.out.println("Error with playing sound B.");
		    	      ex.printStackTrace( );
		    	    }
				 break;
			case 67:
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
		    	    }
		    	    catch(Exception ex)
		    	    {
		    	      System.out.println("Error with playing sound C.");
		    	      ex.printStackTrace( );
		    	    }
				 break;
			case 68:
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
		    	    }
		    	    catch(Exception ex)
		    	    {
		    	      System.out.println("Error with playing sound D.");
		    	      ex.printStackTrace( );
		    	    }
				 break;
			case 69:
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
		    	    }
		    	    catch(Exception ex)
		    	    {
		    	      System.out.println("Error with playing sound E.");
		    	      ex.printStackTrace( );
		    	    }
				 break;
			case 70:
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
		    	    }
		    	    catch(Exception ex)
		    	    {
		    	      System.out.println("Error with playing sound F.");
		    	      ex.printStackTrace( );
		    	    }
				 break;
			case 71:
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
		    	    }
		    	    catch(Exception ex)
		    	    {
		    	      System.out.println("Error with playing sound G.");
		    	      ex.printStackTrace( );
		    	    }
				 break;
			case 72:
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
		    	    }
		    	    catch(Exception ex)
		    	    {
		    	      System.out.println("Error with playing sound H.");
		    	      ex.printStackTrace( );
		    	    }
				 break;
			case 73:
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
		    	    }
		    	    catch(Exception ex)
		    	    {
		    	      System.out.println("Error with playing sound I.");
		    	      ex.printStackTrace( );
		    	    }
				 break;
			case 74:
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
		    	    }
		    	    catch(Exception ex)
		    	    {
		    	      System.out.println("Error with playing sound J.");
		    	      ex.printStackTrace( );
		    	    }
				 break;
			case 75:
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
		    	    }
		    	    catch(Exception ex)
		    	    {
		    	      System.out.println("Error with playing sound K.");
		    	      ex.printStackTrace( );
		    	    }
				 break;
				 
			case 76:
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
		    	    }
		    	    catch(Exception ex)
		    	    {
		    	      System.out.println("Error with playing sound L.");
		    	      ex.printStackTrace( );
		    	    }
				 break;
				 
			case 77:
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
		    	    }
		    	    catch(Exception ex)
		    	    {
		    	      System.out.println("Error with playing sound M.");
		    	      ex.printStackTrace( );
		    	    }
				 break;
				 
			case 78:
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
		    	    }
		    	    catch(Exception ex)
		    	    {
		    	      System.out.println("Error with playing sound N.");
		    	      ex.printStackTrace( );
		    	    }
				 break;
				 
			case 79:
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
		    	    }
		    	    catch(Exception ex)
		    	    {
		    	      System.out.println("Error with playing sound O.");
		    	      ex.printStackTrace( );
		    	    }
				 break;
				 
			case 80:
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
		    	    }
		    	    catch(Exception ex)
		    	    {
		    	      System.out.println("Error with playing sound P.");
		    	      ex.printStackTrace( );
		    	    }
				 break;
				 
			case 81:
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
		    	    }
		    	    catch(Exception ex)
		    	    {
		    	      System.out.println("Error with playing sound Q.");
		    	      ex.printStackTrace( );
		    	    }
				 break;
				 
			case 82:
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
		    	    }
		    	    catch(Exception ex)
		    	    {
		    	      System.out.println("Error with playing sound R.");
		    	      ex.printStackTrace( );
		    	    }
				 break;
				 
			case 83:
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
		    	    }
		    	    catch(Exception ex)
		    	    {
		    	      System.out.println("Error with playing sound S.");
		    	      ex.printStackTrace( );
		    	    }
				 break;
				 
			case 84:
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
		    	    }
		    	    catch(Exception ex)
		    	    {
		    	      System.out.println("Error with playing sound T.");
		    	      ex.printStackTrace( );
		    	    }
				 break;
				 
			case 85:
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
		    	    }
		    	    catch(Exception ex)
		    	    {
		    	      System.out.println("Error with playing sound U.");
		    	      ex.printStackTrace( );
		    	    }
				 break;
				 
			case 86:
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
		    	    }
		    	    catch(Exception ex)
		    	    {
		    	      System.out.println("Error with playing sound V.");
		    	      ex.printStackTrace( );
		    	    }
				 break;
				 
			case 87:
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
		    	    }
		    	    catch(Exception ex)
		    	    {
		    	      System.out.println("Error with playing sound W.");
		    	      ex.printStackTrace( );
		    	    }
				 break;
				 
			case 88:
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
		    	    }
		    	    catch(Exception ex)
		    	    {
		    	      System.out.println("Error with playing sound X.");
		    	      ex.printStackTrace( );
		    	    }
				 break;
				 
			case 89:
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
		    	    }
		    	    catch(Exception ex)
		    	    {
		    	      System.out.println("Error with playing sound Y.");
		    	      ex.printStackTrace( );
		    	    }
				 break;
				 
			case 90:
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
		    	    }
		    	    catch(Exception ex)
		    	    {
		    	      System.out.println("Error with playing sound Z.");
		    	      ex.printStackTrace( );
		    	    }
				 break;
		}
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
		
	}	

