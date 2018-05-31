package mobile;

import java.awt.Image;
import java.awt.Point;

public class Hero extends Mobile{
	
	/** The Hero X position */
	int /**/ position_Y;
	/** The Hero Y position */
	int position_X;
	/** Is the hero alive ? */
	Boolean isAlive = true;
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
	
}
