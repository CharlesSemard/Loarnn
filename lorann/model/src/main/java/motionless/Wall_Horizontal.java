package motionless;

import Element.Permeability;
import Element.Sprite;

class Wall_Horizontal extends MotionlessElement {
	
	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite('-',"horizontal_bone.png");

	/** Instantiates a new Wall_Horizontal. */
	Wall_Horizontal(){
		super(SPRITE, Permeability.BLOCKING);
	}
}