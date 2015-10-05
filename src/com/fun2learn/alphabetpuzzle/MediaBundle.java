package com.fun2learn.alphabetpuzzle;


/**
 * The Class MediaBundle.
 *
 * @author adityadev
 */
public class MediaBundle {

	/** The image. */
	String image;

	/** The audio. */
	String audio;

	/** The alphabet. */
	String alphabet;

	/**
	 * Gets the alphabet.
	 *
	 * @return the alphabet
	 */
	public String getAlphabet() {
		return alphabet;
	}

	/**
	 * Gets the audio.
	 *
	 * @return the audio
	 */
	public String getAudio() {
		return audio;
	}

	/**
	 * Gets the image.
	 *
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * Sets the alphabet.
	 *
	 * @param alphabet the new alphabet
	 */
	public void setAlphabet(String alphabet) {
		this.alphabet = alphabet;
	}

	/**
	 * Sets the audio.
	 *
	 * @param audio the new audio
	 */
	public void setAudio(String audio) {
		this.audio = audio;
	}

	/**
	 * Sets the image.
	 *
	 * @param image the new image
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * Instantiates a new media bundle.
	 *
	 * @param alphabet the alphabet
	 * @param image the image
	 * @param audio the audio
	 */
	public MediaBundle(String alphabet,String image,String audio) {
		setAlphabet(alphabet);
		setImage(image);
		setAudio(audio);
	}

	/**
	 * Instantiates a new media bundle.
	 */
	public MediaBundle() {}

}
