package model;

import java.awt.Point;

import showboard.IPawn;

public interface IMobile extends IPawn {

	int getX(); 
	
	int getY();
	
	int getSpeed();
	
	Point getPosition();
	
	void moveUp();
	
	void moveLeft();
	
	void moveRight();
	
	void moveDown();
	
	void doNothing();

	boolean isAlive();

	boolean isHit(int newX, int newY);

	void shoot();

	int collect();
	 
}
