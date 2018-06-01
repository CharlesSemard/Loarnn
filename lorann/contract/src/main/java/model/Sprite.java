package model;
import java.awt.Image;

public class Sprite {
	
	private Image image;
	private String imageName;
	private char consoleImage;
	private boolean imageLoaded;
	
	public Sprite(char character, String imageName) {
		this.setConsoleImage(character);
		this.setImageName(imageName);
	}

	/**
     * Sets the image name.
     *
     * @param imageName
     *            the imageName to set
     */
	private void setImageName(String imageName) {
		this.imageName = imageName;
    }

	/**
     * Sets the console image.
     *
     * @param consoleImage
     *            the consoleImage to set
     */
	private void setConsoleImage(final char consoleImage) {
		this.consoleImage = consoleImage;
		
	}
}
