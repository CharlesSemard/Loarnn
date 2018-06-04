package model;

import java.awt.Image;
import showboard.ISquare;

/**
 * <h1>The Interface IElement.</h1>
 * 
 * @author Alexandre Vivier Baudry
 * @version 1.0
 */

public interface IElement extends ISquare {
	
	/**
     * Gets the sprite.
     *
     * @return the sprite
     */
    Sprite getSprite();

    /**
     * Gets the permeability.
     *
     * @return the permeability
     */
    Permeability getPermeability();
    
    /*
     * (non-Javadoc)
     * @see fr.exia.showboard.ISquare#getImage()
     */
    @Override
    Image getImage();
}