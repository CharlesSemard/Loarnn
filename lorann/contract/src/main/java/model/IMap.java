package model;

import java.awt.Point;

import java.util.Observable;

/**
 * <h1>The Interface IMap.</h1>
 * 
 * @author Alexandre Vivier Baudry
 * @version 1.0
 */

public interface IMap {
	
    /**
     * Gets the width.
     *
     * @return the width
     */

	int getWidth();
	
    /**
     * Gets the height.
     *
     * @return the height
     */
	
	int getHeight();
	
    /**
     * Gets the on the road XY.
     *
     * @param x
     *            the x
     * @param y
     *            the y
     * @return the on the road XY
     */
	
	IElement getOnTheMapXY(int x, int y);
	
	void setOnTheMapXY(int x, int y, IElement element);
	
    /**
     * Gets the observable.
     *
     * @return the observable
     */
	
	Observable getObservable();
	
	/**
	 * Gets the hero position 
	 * @return the hero position
	 */

	Point getCharacterPosition();
	
	/**
	 * Gets the purse 
	 * @return the purse position
	 */
	
	IMobile[] getPurses();
	
	/**
	 * Gets the monster position 
	 * @return the monster position
	 */
	
	IMobile[] getMonsters();
	
	/**
	 * Gets the EnergyBall position 
	 * @return the EnergyBall position
	 */
	Point getEnergyBall();
	
	/**
	 * Gets the door position 
	 * @return the door position
	 */
	
	Point getDoor();
	
	/**
	 * Gets the spell position 
	 * @return the spell position
	 */

	boolean setSpellOnTheMapXY(int x, int y, IElement spell);
	
	/**
	 * Gets the refresh of the frame 
	 * @return the refresh
	 */
	
	void setElementHasChanged();
}
