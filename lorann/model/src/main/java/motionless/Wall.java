package motionless;

import Element.Permeability;
import Element.Sprite;

class Wall extends MotionlessElement {
	private static final Sprite SPRITE = new Sprite('o',"bone.png");

	Wall(){
		super(SPRITE, Permeability.BLOCKING);
	}
}