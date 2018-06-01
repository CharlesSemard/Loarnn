package mobile;

import java.awt.Point;

import Element.Element;
import Element.Permeability;
import Element.Sprite;

public abstract class Mobile extends Element implements IMobile {



	/** The X */
	private int x;
	
	/** The Y */
	private int y;
	
	/** The Speed */
	private int speed;
	/** Mobile alive */
	private Boolean alive = true;
	
	private Point position;
	
	Mobile(final Sprite sprite, final IMap map, final Permeability permeability){
		super(sprite, permeability);
		// implémenter un setMap 
		this.position = new Point();
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getSpeed() {
		return speed;
	}

	public Boolean isAlive() {
		return this.alive;
	}
	
	protected void die() {
		this.alive = false;
		// faire une fonction pour reset la map
	}
	
}
