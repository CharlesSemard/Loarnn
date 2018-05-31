package mobile;

import java.awt.Image;
import java.awt.Point;

//import Element.Sprite;

public class Spell extends Mobile{
	/** The Constant SPRITE. */
	//private static final Sprite SPRITE = new Sprite(, "fireball_1.png"); 
	/** The X */
	//private int position_Y = this.getY();  //TODO finir cette merde ptn, bisous PL
	/** The Y */
	private int position_X;
	/** The alive */
	private Boolean alive = false;
	/** The Speed */
	private int speed = 1;
	
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
}
