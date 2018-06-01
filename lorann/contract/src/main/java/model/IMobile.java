package model;

import java.awt.Point;

import showboard.IPawn;

public interface IMobile extends IPawn {

	int getX(); 
	
	int getY();
	
	int getSpeed();
	
	boolean getAlive();
	
	Point getPosition();
	
	void moveUp();
	
	void moveLeft();
	
	void moveRight();
	
	void moveDown();
	
	void doNothing();
	 
}
