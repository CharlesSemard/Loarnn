package mobile;

import java.awt.Image;
import java.awt.Point;

public class Monster extends Mobile{

	/** The X */
	private int position_Y;
	/** The Y */
	private int position_X;
	/** The alive */
	private Boolean alive = true;
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
