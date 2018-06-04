package model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Sprite {
	
	private Image image;
	private String imageName;
	private char consoleImage;
	private boolean imageLoaded;
	
	 /**
     * Instantiates a new sprite.
     *
     * @param character
     *            the character
     * @param imageName
     *            the image name
     */
	public Sprite(char character, String imageName) {
		this.setConsoleImage(character);
		this.setImageName(imageName);
	}
	
	/**
     * Instantiates a new sprite.
     *
     * @param character
     *            the character
     */
    public Sprite(final char character) {
        this(character, "noimage.jpg");
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
     * Gets the image name.
     *
     * @return the imageName
     */
    public final String getImageName() {
        return this.imageName;
    }

    /**
     * Get the console image.
     *
     * @return the consoleImage
     */
	public char getConsoleImage() {
		return this.consoleImage;
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
	
	/**
     * Gets the image.
     *
     * @return the image
     */
    public final Image getImage() {
        return this.image;
    }
    
    /**
     * Sets the image.
     *
     * @param image
     *            the new image
     */
    private void setImage(final Image image) {
        this.image = image;
    }
    
    /**
     * Loads image.
     *
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public final void loadImage() throws IOException {
    	String path = System.getProperty("user.dir") + "\\images\\" + this.getImageName() + ".png";
    	//System.out.println(path);
    	try {
    		
    		this.setImage(ImageIO.read(new File(path)));
    	}
    	catch(Exception e){
    		path = System.getProperty("user.dir") + "\\images\\floor.png";
    		this.setImage(ImageIO.read(new File(path)));
    	}  
    }
    
    /**
     * Checks if the image is loaded.
     *
     * @return true, if the image is loaded
     */
    public final boolean isImageLoaded() {
        return this.imageLoaded;
    }

    /**
     * Sets the image loaded.
     *
     * @param isImageLoaded
     *            the new image loaded
     */
    public final void setImageLoaded(final boolean isImageLoaded) {
        this.imageLoaded = isImageLoaded;
    }
}
