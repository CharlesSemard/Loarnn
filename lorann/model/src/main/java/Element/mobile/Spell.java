package Element.mobile;

import java.awt.Image;
import java.awt.Point;

import model.IMap;
import model.Permeability;
import model.Sprite;

//import Element.Sprite;

public class Spell extends Mobile{
	
	Spell(Sprite sprite, IMap map, Permeability permeability) {
		super(sprite, map, permeability);
		// TODO Auto-generated constructor stub
	}
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
