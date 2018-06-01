package mobile;

import java.awt.Image;
import java.awt.Point;

import model.IMap;
import model.Permeability;
import model.Sprite;

public class Hero extends Mobile{
	
	Hero(Sprite sprite, IMap map, Permeability permeability) {
		super(sprite, map, permeability);
		// TODO Auto-generated constructor stub
	}
	/** The Hero X position */
	int /**/ position_Y;
	/** The Hero Y position */
	int position_X;
	/** The Hero Moving Speed */
	int speed = 1;
	/** Is the Hero allowed to launch a spell ? */
	Boolean hasSpell = true;
	/** Is the gate open ? */
	Boolean hasKey = false;
	@Override
	public Point getPosition() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int getX() {
		return this.getPosition().x;
	}
	
	public int getY() {
	return this.getPosition().y;
	}
	@Override
	public boolean getAlive() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void doNothing() {
		// TODO Auto-generated method stub
		
	}
	
}
