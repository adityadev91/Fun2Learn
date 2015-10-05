package com.fun2learn.alphabetpuzzle;

import java.util.ArrayList;
import java.util.Random;

import puzzleproject.Resources;

public class AlphPuzzleServices {
	static ArrayList<MediaBundle> MediaAlphArray = new ArrayList<MediaBundle>();
	static ArrayList<MediaBundle> MediaObj1Array = new ArrayList<MediaBundle>();
	static ArrayList<MediaBundle> MediaObj2Array = new ArrayList<MediaBundle>();
	static ArrayList<MediaBundle> MediaObj3Array = new ArrayList<MediaBundle>();

	private static int currentIndex=-1;
	int rightOption = -1;

	public AlphPuzzleServices() {
		initMediaAlphArray();
		initMediaObj1Array();
	}

	private void initMediaObj1Array() {
		MediaObj1Array.add(new MediaBundle("A", Resources.OBJ1A, Resources.SOUNDOBJ1A));
		MediaObj1Array.add(new MediaBundle("B", Resources.OBJ1B, Resources.SOUNDOBJ1B));
		MediaObj1Array.add(new MediaBundle("C", Resources.OBJ1C, Resources.SOUNDOBJ1C));
		MediaObj1Array.add(new MediaBundle("D", Resources.OBJ1D, Resources.SOUNDOBJ1D));
		MediaObj1Array.add(new MediaBundle("E", Resources.OBJ1E, Resources.SOUNDOBJ1E));
		MediaObj1Array.add(new MediaBundle("F", Resources.OBJ1F, Resources.SOUNDOBJ1F));
		MediaObj1Array.add(new MediaBundle("G", Resources.OBJ1G, Resources.SOUNDOBJ1G));
		MediaObj1Array.add(new MediaBundle("H", Resources.OBJ1H, Resources.SOUNDOBJ1H));
		MediaObj1Array.add(new MediaBundle("I", Resources.OBJ1I, Resources.SOUNDOBJ1I));
		MediaObj1Array.add(new MediaBundle("J", Resources.OBJ1J, Resources.SOUNDOBJ1J));
		MediaObj1Array.add(new MediaBundle("K", Resources.OBJ1K, Resources.SOUNDOBJ1K));
		MediaObj1Array.add(new MediaBundle("L", Resources.OBJ1L, Resources.SOUNDOBJ1L));
		MediaObj1Array.add(new MediaBundle("M", Resources.OBJ1M, Resources.SOUNDOBJ1M));
		MediaObj1Array.add(new MediaBundle("N", Resources.OBJ1N, Resources.SOUNDOBJ1N));
		MediaObj1Array.add(new MediaBundle("O", Resources.OBJ1O, Resources.SOUNDOBJ1O));
		MediaObj1Array.add(new MediaBundle("P", Resources.OBJ1P, Resources.SOUNDOBJ1P));
		MediaObj1Array.add(new MediaBundle("Q", Resources.OBJ1Q, Resources.SOUNDOBJ1Q));
		MediaObj1Array.add(new MediaBundle("R", Resources.OBJ1R, Resources.SOUNDOBJ1R));
		MediaObj1Array.add(new MediaBundle("S", Resources.OBJ1S, Resources.SOUNDOBJ1S));
		MediaObj1Array.add(new MediaBundle("T", Resources.OBJ1T, Resources.SOUNDOBJ1T));
		MediaObj1Array.add(new MediaBundle("U", Resources.OBJ1U, Resources.SOUNDOBJ1U));
		MediaObj1Array.add(new MediaBundle("V", Resources.OBJ1V, Resources.SOUNDOBJ1V));
		MediaObj1Array.add(new MediaBundle("W", Resources.OBJ1W, Resources.SOUNDOBJ1W));
		MediaObj1Array.add(new MediaBundle("X", Resources.OBJ1X, Resources.SOUNDOBJ1X));
		MediaObj1Array.add(new MediaBundle("Y", Resources.OBJ1Y, Resources.SOUNDOBJ1Y));
		MediaObj1Array.add(new MediaBundle("Z", Resources.OBJ1Z, Resources.SOUNDOBJ1Z));

	}

	private void initMediaObj2Array() {
		MediaObj2Array.add(new MediaBundle("A", Resources.OBJ2A, Resources.SOUNDOBJ2A));
		MediaObj2Array.add(new MediaBundle("B", Resources.OBJ2B, Resources.SOUNDOBJ2B));
		MediaObj2Array.add(new MediaBundle("C", Resources.OBJ2C, Resources.SOUNDOBJ2C));
		MediaObj2Array.add(new MediaBundle("D", Resources.OBJ2D, Resources.SOUNDOBJ2D));
		MediaObj2Array.add(new MediaBundle("E", Resources.OBJ2E, Resources.SOUNDOBJ2E));
		MediaObj2Array.add(new MediaBundle("F", Resources.OBJ2F, Resources.SOUNDOBJ2F));
		MediaObj2Array.add(new MediaBundle("G", Resources.OBJ2G, Resources.SOUNDOBJ2G));
		MediaObj2Array.add(new MediaBundle("H", Resources.OBJ2H, Resources.SOUNDOBJ2H));
		MediaObj2Array.add(new MediaBundle("I", Resources.OBJ2I, Resources.SOUNDOBJ2I));
		MediaObj2Array.add(new MediaBundle("J", Resources.OBJ2J, Resources.SOUNDOBJ2J));
		MediaObj2Array.add(new MediaBundle("K", Resources.OBJ2K, Resources.SOUNDOBJ2K));
		MediaObj2Array.add(new MediaBundle("L", Resources.OBJ2L, Resources.SOUNDOBJ2L));
		MediaObj2Array.add(new MediaBundle("M", Resources.OBJ2M, Resources.SOUNDOBJ2M));
		MediaObj2Array.add(new MediaBundle("N", Resources.OBJ2N, Resources.SOUNDOBJ2N));
		MediaObj2Array.add(new MediaBundle("O", Resources.OBJ2O, Resources.SOUNDOBJ2O));
		MediaObj2Array.add(new MediaBundle("P", Resources.OBJ2P, Resources.SOUNDOBJ2P));
		MediaObj2Array.add(new MediaBundle("Q", Resources.OBJ2Q, Resources.SOUNDOBJ2Q));
		MediaObj2Array.add(new MediaBundle("R", Resources.OBJ2R, Resources.SOUNDOBJ2R));
		MediaObj2Array.add(new MediaBundle("S", Resources.OBJ2S, Resources.SOUNDOBJ2S));
		MediaObj2Array.add(new MediaBundle("T", Resources.OBJ2T, Resources.SOUNDOBJ2T));
		MediaObj2Array.add(new MediaBundle("U", Resources.OBJ2U, Resources.SOUNDOBJ2U));
		MediaObj2Array.add(new MediaBundle("V", Resources.OBJ2V, Resources.SOUNDOBJ2V));
		MediaObj2Array.add(new MediaBundle("W", Resources.OBJ2W, Resources.SOUNDOBJ2W));
		MediaObj2Array.add(new MediaBundle("X", Resources.OBJ2X, Resources.SOUNDOBJ2X));
		MediaObj2Array.add(new MediaBundle("Y", Resources.OBJ2Y, Resources.SOUNDOBJ2Y));
		MediaObj2Array.add(new MediaBundle("Z", Resources.OBJ2Z, Resources.SOUNDOBJ2Z));

	}

	private void initMediaObj3Array() {
		MediaObj3Array.add(new MediaBundle("A", Resources.OBJ3A, Resources.SOUNDOBJ3A));
		MediaObj3Array.add(new MediaBundle("B", Resources.OBJ3B, Resources.SOUNDOBJ3B));
		MediaObj3Array.add(new MediaBundle("C", Resources.OBJ3C, Resources.SOUNDOBJ3C));
		MediaObj3Array.add(new MediaBundle("D", Resources.OBJ3D, Resources.SOUNDOBJ3D));
		MediaObj3Array.add(new MediaBundle("E", Resources.OBJ3E, Resources.SOUNDOBJ3E));
		MediaObj3Array.add(new MediaBundle("F", Resources.OBJ3F, Resources.SOUNDOBJ3F));
		MediaObj3Array.add(new MediaBundle("G", Resources.OBJ3G, Resources.SOUNDOBJ3G));
		MediaObj3Array.add(new MediaBundle("H", Resources.OBJ3H, Resources.SOUNDOBJ3H));
		MediaObj3Array.add(new MediaBundle("I", Resources.OBJ3I, Resources.SOUNDOBJ3I));
		MediaObj3Array.add(new MediaBundle("J", Resources.OBJ3J, Resources.SOUNDOBJ3J));
		MediaObj3Array.add(new MediaBundle("K", Resources.OBJ3K, Resources.SOUNDOBJ3K));
		MediaObj3Array.add(new MediaBundle("L", Resources.OBJ3L, Resources.SOUNDOBJ3L));
		MediaObj3Array.add(new MediaBundle("M", Resources.OBJ3M, Resources.SOUNDOBJ3M));
		MediaObj3Array.add(new MediaBundle("N", Resources.OBJ3N, Resources.SOUNDOBJ3N));
		MediaObj3Array.add(new MediaBundle("O", Resources.OBJ3O, Resources.SOUNDOBJ3O));
		MediaObj3Array.add(new MediaBundle("P", Resources.OBJ3P, Resources.SOUNDOBJ3P));
		MediaObj3Array.add(new MediaBundle("Q", Resources.OBJ3Q, Resources.SOUNDOBJ3Q));
		MediaObj3Array.add(new MediaBundle("R", Resources.OBJ3R, Resources.SOUNDOBJ3R));
		MediaObj3Array.add(new MediaBundle("S", Resources.OBJ3S, Resources.SOUNDOBJ3S));
		MediaObj3Array.add(new MediaBundle("T", Resources.OBJ3T, Resources.SOUNDOBJ3T));
		MediaObj3Array.add(new MediaBundle("U", Resources.OBJ3U, Resources.SOUNDOBJ3U));
		MediaObj3Array.add(new MediaBundle("V", Resources.OBJ3V, Resources.SOUNDOBJ3V));
		MediaObj3Array.add(new MediaBundle("W", Resources.OBJ3W, Resources.SOUNDOBJ3W));
		MediaObj3Array.add(new MediaBundle("X", Resources.OBJ3X, Resources.SOUNDOBJ3X));
		MediaObj3Array.add(new MediaBundle("Y", Resources.OBJ3Y, Resources.SOUNDOBJ3Y));
		MediaObj3Array.add(new MediaBundle("Z", Resources.OBJ3Z, Resources.SOUNDOBJ3Z));

	}
	
	private void initMediaAlphArray() {
		MediaAlphArray.add(new MediaBundle("A", Resources.IMAGE_A, Resources.SOUNDA));
		MediaAlphArray.add(new MediaBundle("B", Resources.IMAGE_B, Resources.SOUNDB));
		MediaAlphArray.add(new MediaBundle("C", Resources.IMAGE_C, Resources.SOUNDC));
		MediaAlphArray.add(new MediaBundle("D", Resources.IMAGE_D, Resources.SOUNDD));
		MediaAlphArray.add(new MediaBundle("E", Resources.IMAGE_E, Resources.SOUNDE));
		MediaAlphArray.add(new MediaBundle("F", Resources.IMAGE_F, Resources.SOUNDF));
		MediaAlphArray.add(new MediaBundle("G", Resources.IMAGE_G, Resources.SOUNDG));
		MediaAlphArray.add(new MediaBundle("H", Resources.IMAGE_H, Resources.SOUNDH));
		MediaAlphArray.add(new MediaBundle("I", Resources.IMAGE_I, Resources.SOUNDI));
		MediaAlphArray.add(new MediaBundle("J", Resources.IMAGE_J, Resources.SOUNDJ));
		MediaAlphArray.add(new MediaBundle("K", Resources.IMAGE_K, Resources.SOUNDK));
		MediaAlphArray.add(new MediaBundle("L", Resources.IMAGE_L, Resources.SOUNDL));
		MediaAlphArray.add(new MediaBundle("M", Resources.IMAGE_M, Resources.SOUNDM));
		MediaAlphArray.add(new MediaBundle("N", Resources.IMAGE_N, Resources.SOUNDN));
		MediaAlphArray.add(new MediaBundle("O", Resources.IMAGE_O, Resources.SOUNDO));
		MediaAlphArray.add(new MediaBundle("P", Resources.IMAGE_P, Resources.SOUNDP));
		MediaAlphArray.add(new MediaBundle("Q", Resources.IMAGE_Q, Resources.SOUNDQ));
		MediaAlphArray.add(new MediaBundle("R", Resources.IMAGE_R, Resources.SOUNDR));
		MediaAlphArray.add(new MediaBundle("S", Resources.IMAGE_S, Resources.SOUNDS));
		MediaAlphArray.add(new MediaBundle("T", Resources.IMAGE_T, Resources.SOUNDT));
		MediaAlphArray.add(new MediaBundle("U", Resources.IMAGE_U, Resources.SOUNDU));
		MediaAlphArray.add(new MediaBundle("V", Resources.IMAGE_V, Resources.SOUNDV));
		MediaAlphArray.add(new MediaBundle("W", Resources.IMAGE_W, Resources.SOUNDW));
		MediaAlphArray.add(new MediaBundle("X", Resources.IMAGE_X, Resources.SOUNDX));
		MediaAlphArray.add(new MediaBundle("Y", Resources.IMAGE_Y, Resources.SOUNDY));
		MediaAlphArray.add(new MediaBundle("Z", Resources.IMAGE_Z, Resources.SOUNDZ));

	}

	public MediaBundle getQuestion() {
		setCurrentIndex(getCurrentIndex() + 1);
		MediaBundle qObject=null;
		qObject = MediaAlphArray.get(getCurrentIndex()%Resources.TOTAL_ALPHABETS);
		System.out.println("currentIndex: "+getCurrentIndex());
		return qObject;
	}

	public MediaBundle[] getThreeOptions() {
		MediaBundle aObjects[]= new MediaBundle[3];
		Random randInt1 = new Random();
		rightOption = randInt1.nextInt(3);
		Random randInt2 = new Random();
		int randAnswer=getCurrentIndex();
		int i;
		aObjects[rightOption] = MediaObj1Array.get(getCurrentIndex()%Resources.TOTAL_ALPHABETS);

		for(i=0;i<3;i++){
			while(randAnswer==getCurrentIndex()){
				randAnswer = randInt2.nextInt(Resources.TOTAL_ALPHABETS);	 
				System.out.println("randAnswer: "+randAnswer);
			}
			if(i!=rightOption){
				aObjects[i] = MediaObj1Array.get(randAnswer);					
			}
			randAnswer=getCurrentIndex();

		}
		return aObjects;
	}

	public boolean checkIfRightAnswer() {
		return false;
	}

	public int getRightOption() {
		return rightOption;
	}

	public static int getCurrentIndex() {
		return currentIndex;
	}

	public static void setCurrentIndex(int currentIndex) {
		AlphPuzzleServices.currentIndex = currentIndex;
	}


}
