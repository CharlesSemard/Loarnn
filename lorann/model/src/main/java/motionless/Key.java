package motionless;

import Element.Permeability;
import Element.Sprite;

class Key extends MotionlessElement {
	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite('u',"crystal_ball.png");
	
	/** Instantiates a new Key. */
	Key(){
		super(SPRITE, Permeability.BLOCKING);
	}
}
