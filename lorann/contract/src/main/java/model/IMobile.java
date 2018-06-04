package model;

import java.awt.Point;

import showboard.IPawn;

public interface IMobile extends IPawn {

	int getX(); 
	
	int getY();
	
	int getSpeed();
	
	Point getPosition();
	
	boolean moveUp();
	
	boolean moveLeft();
	
	boolean moveRight();
	
	boolean moveDown();
	
	boolean moveUpRight();
	
	boolean moveUpLeft();
	
	boolean moveDownRight();
	
	boolean moveDownLeft();
	
	void doNothing();

	boolean isAlive();

	boolean isHit(int newX, int newY);

	void shoot();

	int collect();
	
	void move();
	 
}
