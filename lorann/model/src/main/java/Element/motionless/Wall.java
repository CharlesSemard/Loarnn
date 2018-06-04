package Element.motionless;

import model.Permeability;
import model.Sprite;

class Wall extends MotionlessElement {
	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite('o',"bone");
	
	/** Instantiates a new Wall. */
	Wall(){
		super(SPRITE, Permeability.BLOCKING);
	}
}