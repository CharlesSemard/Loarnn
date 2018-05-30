package motionless;

import element.Permeability;
import element.Sprite;

class Key extends MotionlessElement {
	private static final Sprite SPRITE = new Sprite('u',"crystal_ball.png");

	Key(){
		super(SPRITE, Permeability.BLOCKING);
	}
}
