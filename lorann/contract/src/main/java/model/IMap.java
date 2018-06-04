package model;

import java.awt.Point;
import java.util.Observable;

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

	Point getCharacterPosition();
	
	Point[] getPurses();
	
	Point[] getMonsters();
	
	Point getEnergyBall();
	
	Point getDoor();

	boolean setSpellOnTheMapXY(int x, int y, IElement spell);
	
	void setElementHasChanged();
}
