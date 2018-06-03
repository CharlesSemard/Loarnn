package Element.motionless;

import java.awt.Image;

import model.Permeability;
import model.Sprite;

class Wall extends MotionlessElement {
	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite('o',"bone");
	
	/** Instantiates a new Wall. */
	Wall(){
		super(SPRITE, Permeability.BLOCKING);
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}
}