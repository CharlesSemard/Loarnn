package motionless;

import Element.Permeability;
import Element.Sprite;

class Wall_Horizontal extends MotionlessElement {
	private static final Sprite SPRITE = new Sprite('-',"horizontal_bone.png");

	Wall_Horizontal(){
		super(SPRITE, Permeability.BLOCKING);
	}
}