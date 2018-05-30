package motionless;

import Element.Permeability;
import Element.Sprite;

class Key extends MotionlessElement {
	private static final Sprite SPRITE = new Sprite('u',"crystal_ball.png");

	Key(){
		super(SPRITE, Permeability.BLOCKING);
	}
}
