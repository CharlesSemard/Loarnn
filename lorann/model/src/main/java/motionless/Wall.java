package motionless;

import Element.Permeability;
import Element.Sprite;

class Wall extends MotionlessElement {
	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite('o',"bone.png");
	
	/** Instantiates a new Wall. */
	Wall(){
		super(SPRITE, Permeability.BLOCKING);
	}
}