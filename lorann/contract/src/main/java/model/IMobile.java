package model;

import java.awt.Point;

import showboard.IPawn;

/**
 * <h1>The Interface IMap.</h1>
 * 
 * @author Pierre Loup Martigne
 * @version 1.0
 */

public interface IMobile extends IElement, IPawn {

    /**
     * Gets the x.
     *
     * @return the x
     */
	int getX(); 
	
    /**
     * Gets the y.
     *
     * @return the y
     */
	
	int getY();
	
	/**
	 * Gets the position of mobile element
	 * @return the position of mobile element
	 */
	
	Point getPosition();
	
    /**
     * Gets the moveUp.
     *
     * @return true or false for moveUp
     */	
	boolean moveUp();
	
    /**
     * Gets the moveLeft.
     *
     * @return true or false for moveLeft
     */	
	boolean moveLeft();
	
    /**
     * Gets the moveRight.
     *
     * @return true or false for moveRight
     */	
	boolean moveRight();
	
    /**
     * Gets the moveDown.
     *
     * @return true or false for moveDown
     */	
	
	boolean moveDown();
	
	boolean moveUpRight();
	
	boolean moveUpLeft();
	
	boolean moveDownRight();
	
	boolean moveDownLeft();
	
    /**
     * Do nothing.

     */	
	void doNothing();
	
    /**
     * Gets the life of the character
     *
     * @return the life 
     */	

	boolean isAlive();

    /**
     * Said if the mobile element has been touch
     *
     * @return true or false for this Hit
     */	

	boolean isHit(int newX, int newY);
	
    /**
     * Gets the hit of the character

     */	

	void shoot();
	
    /**
     * Gets items like purse
     *
     * @return points  
     */	

	int collect();
	
	void move();
	 
}
